
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author henriette
 * Test av klassen Kvadrat
 * String.format("%.2f", obj1.Met()) 
 */
public class KvadratTest {
    public static void main(String[] args) {
        double a, b, c;
        String ut = "";
        
        showMessageDialog(null, "Legg inn koeffisienter a, b og c til kvadratisk likning ax^2 + bx + c = 0");
        a = parseDouble(showInputDialog("Legg inn a: "));
        b = parseDouble(showInputDialog("Legg inn b: "));
        c = parseDouble(showInputDialog("Legg inn c: "));
     
        Kvadrat k1 = new Kvadrat(a, b, c);
        
        if (k1.getDiscriminant() < 0) {
            ut += "Likningen har ingen rot";
        }
        else if (k1.getDiscriminant() == 0) {
            ut += "Resultat: x = " + String.format("%.2f", k1.getRoot1());
        }
        else
            ut += "Resultat: x1 = " + String.format("%.2g", k1.getRoot1());  //f gir 2 desimaler, g gir 2 gj siffer
        
        showMessageDialog(null, ut);
    }    
} 