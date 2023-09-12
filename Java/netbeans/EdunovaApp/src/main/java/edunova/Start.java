package edunova;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import edunova.controller.Obrada;
import edunova.controller.ObradaPolaznik;
import edunova.controller.ObradaSmjer;
import edunova.model.Polaznik;
import edunova.model.Smjer;
import edunova.util.EdunovaException;
import edunova.util.HibernateUtil;
import edunova.util.PocetniInsert;
import java.math.BigDecimal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;

/**
 *
 * @author Denis
 */
public class Start {
    
    public static void main(String[] args) {
        //HibernateUtil.getSession();
        //new PocetniInsert();

        //System.out.println(new Gson().toJson(new ObradaSmjer().read()));
       ObradaSmjer os = new ObradaSmjer();
       Smjer s = new Smjer();
       s.setNaziv("denis");
       s.setCijena(new BigDecimal(3.5));
       os.setEntitet(s);
        
        try {
            os.create();
        } catch (EdunovaException ex) {
            System.out.println(ex.getPoruka());
        }
        
    }
    
    private void primjerJson() {
        String json = "[{\"naziv\":\"Maharaj\",\"cijena\":1200.00,\"upisnina\":96.00,\"trajanje\":294,\"verificiran\":true,\"sifra\":1},{\"naziv\":\"Chocolate St\",\"cijena\":1256.00,\"upisnina\":62.00,\"trajanje\":143,\"verificiran\":true,\"sifra\":2},{\"naziv\":\"Samuel Smith’s Oatmeal Stout\",\"cijena\":985.00,\"upisnina\":54.00,\"trajanje\":204,\"verificiran\":true,\"sifra\":3},{\"naziv\":\"Founders Kentucky Breakfast\",\"cijena\":1292.00,\"upisnina\":72.00,\"trajanje\":206,\"verificiran\":false,\"sifra\":4},{\"naziv\":\"Delirium Tremens\",\"cijena\":1417.00,\"upisnina\":80.00,\"trajanje\":233,\"verificiran\":false,\"sifra\":5},{\"naziv\":\"Chocolate St\",\"cijena\":1056.00,\"upisnina\":116.00,\"trajanje\":214,\"verificiran\":true,\"sifra\":6},{\"naziv\":\"Trappistes Rochefort 8\",\"cijena\":1028.00,\"upisnina\":103.00,\"trajanje\":269,\"verificiran\":false,\"sifra\":7},{\"naziv\":\"Stone IPA\",\"cijena\":1110.00,\"upisnina\":117.00,\"trajanje\":106,\"verificiran\":false,\"sifra\":8},{\"naziv\":\"Double Bastard Ale\",\"cijena\":1503.00,\"upisnina\":103.00,\"trajanje\":172,\"verificiran\":false,\"sifra\":9},{\"naziv\":\"Double Bastard Ale\",\"cijena\":1010.00,\"upisnina\":115.00,\"trajanje\":104,\"verificiran\":false,\"sifra\":10},{\"naziv\":\"Double Bastard Ale\",\"cijena\":958.00,\"upisnina\":91.00,\"trajanje\":160,\"verificiran\":true,\"sifra\":11},{\"naziv\":\"Dreadnaught IPA\",\"cijena\":1206.00,\"upisnina\":81.00,\"trajanje\":97,\"verificiran\":false,\"sifra\":12},{\"naziv\":\"Prvi preko kontrola\",\"verificiran\":false,\"sifra\":13}]";
        List<Smjer> lista = new Gson().fromJson(json,
                new TypeToken<List<Smjer>>() {
                }.getType());
        
        ObradaSmjer os = new ObradaSmjer();
        
        for (Smjer s : lista) {
            os.setEntitet(s);
            try {
                os.create();
            } catch (EdunovaException ex) {
                System.out.println(ex.getPoruka());
            }
        }
    }
}
