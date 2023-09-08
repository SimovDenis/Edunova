package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Denis
 */
public class ObradaSmjer extends Obrada<Smjer> {

    public ObradaSmjer() {
        super();
    }

    public ObradaSmjer(Smjer s) {
        super(s);
    }

    @Override
    public List<Smjer> read() {
        return session.createQuery("from Smjer", Smjer.class).list();
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
        kontrolaUnos();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if (!entitet.getGrupe().isEmpty()) {

            StringBuilder sb = new StringBuilder();
            sb.append("Smjer se ne može obrisati jer ima grupe (");
            for (Grupa g : entitet.getGrupe()) {
                sb.append(g.getNaziv());
                sb.append(", ");
            }
            sb.append(")");

            throw new EdunovaException(sb.toString());
        }
    }

    private void kontrolaNaziv() throws EdunovaException {
        if (entitet.getNaziv() == null) {
            throw new EdunovaException("Naziv smjera mora biti definiran");
        }
        if (entitet.getNaziv().isEmpty()) {
            throw new EdunovaException("Naziv smjera ne smije biti prazan");
        }

    }

    private void kontrolaCijena() throws EdunovaException {

        var c = entitet.getCijena();

        if (c == null) {
            return;
        }

        if (c.compareTo(BigDecimal.ZERO) <= 0 || c.compareTo(new BigDecimal(10000)) > 0) {
            throw new EdunovaException("Ako je cijena postavljena, mora biti veća od nula i manja ili jednaka 10000");
        }

    }

}
