/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zavrsni.controller;

import java.util.List;
import zavrsni.model.Proizvod;
import zavrsni.util.MotoException;

/**
 *
 * @author Denis
 */
public class ObradaProizvod extends Obrada<Proizvod> {

    @Override
    public List<Proizvod> read() {
        return session.createQuery("from Proizvod", Proizvod.class).list();
    }

    @Override
    protected void kontrolaUnos() throws MotoException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaPromjena() throws MotoException {

    }

    @Override
    protected void kontrolaBrisanje() throws MotoException {

    }

    private void kontrolaNaziv() throws MotoException {
        if (entitet.getNaziv() == null) {
            throw new MotoException("Naziv mora biti definiran");
        }

        if (entitet.getNaziv().isEmpty()) {
            throw new MotoException("Naziv ne smije biti prazan");
        }
    }

}
