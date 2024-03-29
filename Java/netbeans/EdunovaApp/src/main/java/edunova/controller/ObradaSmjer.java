/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Grupa;
import edunova.model.Smjer;
import edunova.model.StavkaGrafa;
import edunova.util.EdunovaException;
import edunova.view.Izbornik;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katedra
 */
public class ObradaSmjer extends Obrada<Smjer>{

    public ObradaSmjer() {
        super();
    }
    
    public ObradaSmjer(Smjer s) {
        super(s);
    }
    
    

    @Override
    public List<Smjer> read() {
        // HQL https://docs.jboss.org/hibernate/core/3.3/reference/en/html/queryhql.html
        return session.createQuery("from Smjer", Smjer.class).list();
    }
    
  
    public List<StavkaGrafa> grafIzbornik() {
        
        List<Object[]>  lista= session.createQuery(
                "select smjer.naziv, count(polaznik.sifra) "
                        + " from Grupa a inner join a.smjer as smjer "
                        + " inner join a.polaznici as polaznik group by smjer.naziv "
                        + " order by 2 desc", 
                Object[].class).list();
        List<StavkaGrafa> vrati = new ArrayList<>();
        for(Object[] a : lista){
            vrati.add(
                    new StavkaGrafa(
                            a[0].toString(),
                            Integer.valueOf(a[1].toString())));
        }
        
        return vrati;
    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        kontrolaNaziv();
        nadopunaNaziva();
        kontrolaCijena();
        // DZ: napisati kontrole za trajanje i upisninu
    }

    @Override
    protected void kontrolaPromjena() throws EdunovaException {
       kontrolaNaziv();
        kontrolaCijena();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
       if(!entitet.getGrupe().isEmpty()){
           
           StringBuilder sb = new StringBuilder();
           sb.append("Smjer se ne može obrisati jer ima grupe (");
           for(Grupa g : entitet.getGrupe()){
               sb.append(g.getNaziv());
               sb.append("\n");
           }
           // DZ: Očistiti zadnji zarez
           sb.append(")");
           
           
            throw new EdunovaException(sb.toString());
       }
    }

    private void kontrolaNaziv() throws EdunovaException{
        if(entitet.getNaziv()==null){
            throw new EdunovaException("Naziv smjera mora biti definiran");
        }
        if(entitet.getNaziv().isEmpty()){
            throw new EdunovaException("Naziv smjera ne smije biti prazan");
        }
        
    }
    
    private void nadopunaNaziva(){
         List<Smjer> lista = session.createQuery("from Smjer s where s.naziv like :uvjet",Smjer.class)
                .setParameter("uvjet", entitet.getNaziv() + "%")
                .list();
        
        if(lista!=null && !lista.isEmpty()){
            entitet.setNaziv(entitet.getNaziv() + " (" + (lista.size()) + ")");
        }
    }

    private void kontrolaCijena() throws EdunovaException {
       
        var c = entitet.getCijena();
        if(c==null){
            return;
        }
        
        if(c.compareTo(BigDecimal.ZERO)<=0 ||
                c.compareTo(new BigDecimal(10000))>0){
            throw new EdunovaException("Ako je cijena postavljena mora biti veća od 0 i manja ili jednaka 10000");
        }
        
    }
    
}
