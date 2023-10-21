/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edunova.model;

/**
 *
 * @author Katedra
 */
public class StavkaGrafa {
     private String naziv;
        private Integer broj;

        public StavkaGrafa(String naziv, Integer broj) {
            this.naziv = naziv;
            this.broj = broj;
        }
        
        

        public String getNaziv() {
            return naziv;
        }

        public void setNaziv(String naziv) {
            this.naziv = naziv;
        }

        public Integer getBroj() {
            return broj;
        }

        public void setBroj(Integer broj) {
            this.broj = broj;
        }
}
