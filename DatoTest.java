/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Package;

import static java.lang.System.out;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author henriette
 */
public class DatoTest {

    public static void main(String[] args) {
        try {
            Dato d1 = new Dato(showInputDialog("Legg inn dato, format YYYY-MM-DD"));
            Dato d2 = new Dato(showInputDialog("Legg inn dato, format YYYY-MM-DD"));
            
            
            String forhold = "";
            if (d1.erLik(d2)){
                forhold = " er lik ";
            }
            else if (d1.erFør(d2)) {
                forhold = " er før ";
            }
            else
                forhold = " er etter ";

            out.println(d1.toString() + forhold + d2.toString());
           }
       
    catch (IndexOutOfBoundsException e) {
             showMessageDialog(null, "Feil nummerformat!");   
                }
    catch (IllegalArgumentException e) {
             showMessageDialog(null, "Ugyldig dato!"); 
                }
        }
    }
 
