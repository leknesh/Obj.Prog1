
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import java.util.Date;

/*
Using Date class to output date after user- selected elapsed time
Elapsed time is in ms,not very useful... 
 * @author henriette
 */
public class DateTest {
    public static void main(String[] args) {
        int elapsed = parseInt(showInputDialog("Tid etter 1.jan 1970: "));
        
        Date dato = new Date(elapsed);
        
        showMessageDialog(null, "Dato: " + dato.toString());
        
    }
    
}
