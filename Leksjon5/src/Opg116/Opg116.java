
package Opg116;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author henriette
 */
public class Opg116 {

    public static void main(String[] args) {
        
        Loan lån = new Loan(2.5, 10, 100000);
        Circle sirkel = new Circle(2, 1, 1);
        Date dato = new Date();
        String tekst = "Her er tekstobjektet!";
        
        ArrayList<Object> enListe = new ArrayList<>();
        
        enListe.add(lån);
        enListe.add(sirkel);
        enListe.add(dato);
        enListe.add(tekst);
        
        System.out.println("Størrelse av arrayList: " + enListe.size());
        System.out.println(enListe.toString());
    }
    
}
