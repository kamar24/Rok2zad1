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
public class Mechanik extends Pracownik{

    public Mechanik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Mechanik");
    }

   
    

    @Override
    public void WykonajPrace() {
        System.out.println("Grzebu grzebu grzebu");
    }

    @Override
    public void Mow() {
        System.out.println("To chyba uszczelka pod głowicą");
    }
    
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
    
}
