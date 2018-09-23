
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author henriette
 */
public class SolveLinearEquation {

    public static void main(String[] args) {
        int lengde;
        String inn, ut = "";
        String[] txtTab;
        double[] koeffTab;
        
        do {
            inn = showInputDialog("Legg inn koeffisienter a,b,c,d,e,f: ");
            txtTab = inn.split(",");
            lengde = txtTab.length;
        } while(lengde != 6);
        
        koeffTab = new double[lengde];
        for (int i = 0; i<lengde; i++) {
            koeffTab[i] = parseDouble(txtTab[i]);
        }
        
        LinearEquation eq1 
                = new LinearEquation(koeffTab[0],koeffTab[1],koeffTab[2],koeffTab[3],koeffTab[4],koeffTab[5]);
        
        if (eq1.getX() == -500000 ){
            ut += "Likningen har ingen løsning!";
        }
        else {
            ut += "Løsning: x = " + String.format("%.2f", eq1.getX())
                    + ", y = " + String.format("%.2f", eq1.getY());
        }
        
        showMessageDialog(null, ut);
       
    }
    
}
