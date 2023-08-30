package edunova.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class Smjer extends Entitet {

    @Column(nullable = false)
    private String naziv;
    private BigDecimal cijena;
    private BigDecimal upisnina;
    private Integer trajanje;
    @Column(columnDefinition = "boolean")
    private boolean verificiran;

    public Smjer() {

    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer(String naziv, BigDecimal cijena, BigDecimal upisnina, Integer trajanje, boolean verificiran, Integer sifra) {
        super(sifra);
        this.naziv = naziv;
        this.cijena = cijena;
        this.upisnina = upisnina;
        this.trajanje = trajanje;
        this.verificiran = verificiran;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Integer getTrajanje() {
        return trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public BigDecimal getUpisnina() {
        return upisnina;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public void setUpisnina(BigDecimal upisnina) {
        this.upisnina = upisnina;
    }

    public boolean isVerificiran() {
        return verificiran;
    }

    public void setVerificiran(boolean verificiran) {
        this.verificiran = verificiran;
    }

}
