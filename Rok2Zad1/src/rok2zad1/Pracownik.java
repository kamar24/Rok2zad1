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
public abstract class Pracownik extends Osoba {
    private String zawod;

        public Pracownik(String zawod, String imie, String naziwsko, int wiek) {
        super(imie, naziwsko, wiek);
        this.zawod = zawod;
    }

   
    }
    

