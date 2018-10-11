/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rok2zad1;

/**
 *
 * @author lkusta
 */
public class Nauczyciel extends Pracownik {

    public Nauczyciel(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Nauczyciel");
    }

    

    @Override
    public void WykonajPrace() {
        System.out.println("Uczu uczu uczu");
    }

    @Override
    public void Mow() {
        System.out.println("Żodyn nie zdał");
    }
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
    
}
