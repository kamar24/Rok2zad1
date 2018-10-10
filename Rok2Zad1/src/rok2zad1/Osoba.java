/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rok2zad1;

/**
 *
 * @author Lukasz
 */
public abstract class Osoba {

     private String imie;
     private String naziwsko;
     private int wiek;
     
    
    public static void main(String[] args) {
        
    }

    public Osoba(String imie, String naziwsko, int wiek) {
        this.imie = imie;
        this.naziwsko = naziwsko;
        this.wiek = wiek;
    }
  abstract public void PokazDane();
    

  abstract public void Mow();
}
