/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.controller;

import edunova.model.Polaznik;
import edunova.util.EdunovaException;
import java.util.List;

/**
 *
 * @author Denis
 */
public class ObradaPolaznik extends ObradaOsoba<Polaznik> {

    @Override
    public List<Polaznik> read() {
        return session.createQuery("from Polaznik", Polaznik.class).list();
    }

    @Override
    protected void kontrolaBrisanje() throws EdunovaException {
        if (entitet.getGrupe().isEmpty()) {
            throw new EdunovaException("Ne možeš obrisati polaznika jer se nalazi na nekoj grupi");
        }

    }

    @Override
    protected void kontrolaUnos() throws EdunovaException {
        super.kontrolaUnos();        
        kontrolaBrojUgovora();
    }

    private void kontrolaBrojUgovora() throws EdunovaException {
        String s = entitet.getBrojUgovora();

        if (s == null || !s.contains("/")) {
            throw new EdunovaException("Broj ugovora mora sadržavati /");

        }

    }

}
