/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Package;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author henriette
 */
public class KlSlett {
    private int time;
    private int minutt;
    
    public KlSlett(int time, int minutt) {
        if ( time >= 0 && time < 24 && minutt >= 0 && minutt < 60) {
                this.time = time;
                this.minutt = minutt;}
        else
            showMessageDialog(null, "Ugyldig klokkeslett!");
    }
        
    public KlSlett(String tid) {
        String[] tidTab = tid.split(":");
        int t = parseInt(tidTab[0]);
        int m = parseInt(tidTab[1]);
     
        if ( t >= 0 && t < 24 && m >= 0 && m < 60) {
                this.time = t;
                this.minutt = m;} 
         else
            showMessageDialog(null, "Ugyldig klokkeslett!");
    } 
    
    @Override
    public String toString(){
        String ut = "" + time + ":" + minutt;
        return ut;
    }
    
    public boolean erLik(KlSlett k2) {
        return this.minutt == k2.minutt && this.time == k2.time;
    }
    
    public boolean erFør(KlSlett k2) {
        return this.time <= k2.time && this.minutt < k2.minutt;
    }
}