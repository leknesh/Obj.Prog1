/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Package;

import static java.lang.System.out;
import static javax.swing.JOptionPane.showMessageDialog;

public class Klokkeslett {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ut = "";
        KlSlett k1 = new KlSlett(9, 13);
        KlSlett k2 = new KlSlett("08:23");
        KlSlett k3 = new KlSlett(24, 59);
    
   ut += "Klokkeslett 1: " + k1.toString() 
           + "\n" + "klokkeslett 2: " + k2.toString() 
           + "\n" + "klokkeslett 3: " + k3.toString();
    
    out.println(ut);
    
    String forhold = "";
    if (k1.erLik(k2)){
        forhold = " er lik ";
    }
    else if (k1.erFør(k2)) {
        forhold = " er før ";
    }
    else
        forhold = " er etter ";
    
    out.println(k1.toString() + forhold + k2.toString());
    }
}
