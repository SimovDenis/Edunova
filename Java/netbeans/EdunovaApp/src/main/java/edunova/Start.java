/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package edunova;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import edunova.controller.ObradaGrupa;
import edunova.controller.ObradaOperater;
import edunova.controller.ObradaPolaznik;
import edunova.controller.ObradaSmjer;
import edunova.model.Grupa;
import edunova.model.Operater;
import edunova.model.Polaznik;
import edunova.model.Predavac;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import edunova.view.Autorizacija;
import edunova.view.SplashScreen;
import java.io.File;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author Katedra
 */
public class Start {

    public static void main(String[] args) {

        //lozinka();
      new SplashScreen().setVisible(true);
      //  new Start();
      /*
       ObradaOperater oo = new ObradaOperater();
       
       Operater o = oo.autoriziraj("oper@edunova.hr", "oper");
       
        System.out.println(o==null ? "Neispravno" : o.getIme());
        */
    }

    public Start() {
    //radSJSON();
    ucitajIzJSON();
    }
    
    
    
    private static void lozinka(){
         // factory pattern
        Argon2 argon2 = Argon2Factory.create();
        
        String hash = argon2.hash(10, 65536, 1, "oper".toCharArray());
        
        ObradaOperater oo = new ObradaOperater();
        Operater o = new Operater();
        o.setIme("Pero");
        o.setPrezime("perić");
        o.setEmail("oper@edunova.hr");
        o.setUloga("oper");
        o.setOib("81425134722");
        o.setLozinka(hash);
        
        oo.setEntitet(o);
        
        try {
            oo.create();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private  void radSJSON() {
        
        
        Type listType = new TypeToken<List<Grupa>>() {}.getType();
        List<Grupa> target = new ObradaGrupa().read();


        Gson gson = new GsonBuilder()
                
   .setDateFormat("yyyy-MM-dd HH:mm:ss")
                    .setExclusionStrategies(new CustomExclusionStrategy()).create();
        String json = gson.toJson(target, listType);
   
        System.out.println(json);
        
    }
    
    
       void ucitajIzJSON(){
        try {
            
       //Nov 28, 2018, 7:09:02?AM
        Type listType = new TypeToken<List<Grupa>>(){}.getType();
        Gson gson = new GsonBuilder()
   .setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        List<Grupa> list = gson.fromJson(Files.readString(Path.of("podaci.json")), listType);
          
        
            ObradaGrupa og = new ObradaGrupa();
            for(Grupa g : list){
                g.setSifra(null);
                og.setEntitet(g);
                try {
                    og.create();
                } catch (EdunovaException e) {
                    System.out.println(e.getPoruka());
                }
            }
        
         } catch (Exception e) {
             e.printStackTrace();
        }
    }

    
    
    public class CustomExclusionStrategy implements ExclusionStrategy {
 
    public boolean shouldSkipField(FieldAttributes f) {
        
        if(f.getDeclaringClass() == Smjer.class && f.getName().equals("grupe")){
            return true;
        }
        
        if(f.getDeclaringClass() == Polaznik.class && f.getName().equals("grupe")){
            return true;
        }
        
        if(f.getDeclaringClass() == Predavac.class && f.getName().equals("grupe")){
            return true;
        }
        
        return false;
    }
    
    
 
 
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
 
}
    
    
    private void primjerJSON(){
         String json = "[{\"naziv\":\"Schneider Aventinus\",\"cijena\":1010.00,\"upisnina\":98.00,\"trajanje\":246,\"verificiran\":true,\"sifra\":1},{\"naziv\":\"90 Minute IPA\",\"cijena\":917.00,\"upisnina\":74.00,\"trajanje\":344,\"verificiran\":true,\"sifra\":2},{\"naziv\":\"Trappistes Rochefort 8\",\"cijena\":991.00,\"upisnina\":76.00,\"trajanje\":294,\"verificiran\":false,\"sifra\":3},{\"naziv\":\"La Fin Du Monde\",\"cijena\":1065.00,\"upisnina\":101.00,\"trajanje\":97,\"verificiran\":true,\"sifra\":4},{\"naziv\":\"Orval Trappist Ale\",\"cijena\":1476.00,\"upisnina\":56.00,\"trajanje\":348,\"verificiran\":true,\"sifra\":5},{\"naziv\":\"Sierra Nevada Celebration Ale\",\"cijena\":1301.00,\"upisnina\":78.00,\"trajanje\":336,\"verificiran\":false,\"sifra\":6},{\"naziv\":\"Trappistes Rochefort 8\",\"cijena\":1236.00,\"upisnina\":109.00,\"trajanje\":214,\"verificiran\":true,\"sifra\":7},{\"naziv\":\"Stone Imperial Russian Stout\",\"cijena\":922.00,\"upisnina\":54.00,\"trajanje\":135,\"verificiran\":false,\"sifra\":8},{\"naziv\":\"Trappistes Rochefort 10\",\"cijena\":1536.00,\"upisnina\":57.00,\"trajanje\":300,\"verificiran\":true,\"sifra\":9},{\"naziv\":\"Chocolate St\",\"cijena\":1128.00,\"upisnina\":53.00,\"trajanje\":149,\"verificiran\":false,\"sifra\":10},{\"naziv\":\"Shakespeare Oatmeal\",\"cijena\":1157.00,\"upisnina\":107.00,\"trajanje\":212,\"verificiran\":false,\"sifra\":11},{\"naziv\":\"Double Bastard Ale\",\"cijena\":1155.00,\"upisnina\":96.00,\"trajanje\":181,\"verificiran\":true,\"sifra\":12},{\"naziv\":\"Prvi preko kontrola\",\"verificiran\":false,\"sifra\":13}]";

        List<Smjer> lista = new Gson().fromJson(json, 
                new TypeToken<List<Smjer>>(){}.getType());
        
        ObradaSmjer os = new ObradaSmjer();
        
        for(Smjer s : lista){
            os.setEntitet(s);
            try {
                os.create();
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
    }
}
