/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rok2zad1;

/**
 *
 * @author Sensei
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
         Osoba[] tab = new Osoba[6];
         
         tab[0] = new Piekarz("Adam", "Anioł", 35);
         tab[1] = new Mechanik("Zbyszek", "Klasztor", 19);
         tab[2] = new Nauczyciel("Marek", "Mietek", 57);
         tab[3] = new Murarz("Mieczysław", "Kot", 39);
         tab[4] = new Mechanik("Jan", "Miód", 25);
         tab[5] = new Murarz("Karol", "Pudzianowski", 29);
         
         for(int i=0; i<6; i++)
         {
             System.out.println(tab[i].PokazDane());
         }

    }
    
}