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
public class Piekarz extends Pracownik{

    public Piekarz(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek, "Piekarz");
    }

   
    

    @Override
    public void WykonajPrace() {
        System.out.println("Pieku pieku pieku");
    }

    @Override
    public void Mow() {
        System.out.println("Z tej mąki chleba nie będzie");
    }
    
    
    public String PokazDane()
    {
        WykonajPrace();
        Mow();
        return super.PokazDane();
        
    }
    
}
