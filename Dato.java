/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L1Package;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author henriette
 */
public class Dato {
    private int dag;
    private int mnd;
    private int år;
    private String ut;
           
    public Dato(int dag, int mnd, int år) {
        if (!(gyldigDato(dag, mnd, år)))
                throw new IllegalArgumentException ("Ugyldig dato!");
        else {
            this.år = år;
            this.mnd = mnd;
            this.dag = dag;
        }    
    } 
    
     public Dato (String datoTxt) {
       
         this(parseInt(datoTxt.split("-")[2]), 
         parseInt(datoTxt.split("-")[1]), parseInt(datoTxt.split("-")[0]));      
     } 
    
    @Override
    public String toString(){
        String ut = "Dato: " + dag + "-" + mnd + "-" + år;
        return ut;
    }
    
    public boolean gyldigDato(int dag, int mnd, int år){
        int maxDag;
        
        if (!(år > 0) || !(mnd > 0 && mnd < 13))
            return false;
        else {
            switch (mnd) {
                case 2:
                    if (skuddÅr(år))
                        maxDag = 29;
                    else
                        maxDag = 28;
                break;
                case 4: case 6: case 9: case 11: maxDag = 30;
                break;
                default: maxDag = 31;
            }
            return dag <= maxDag;
        }
    }
    
    public boolean skuddÅr(int år) {
        return !(år%4 == 1 || år%100 == 0);
    }
    
    public boolean erLik(Dato d2) {
        return (this.år == d2.år && 
        this.mnd == d2.mnd &&
        this.år == d2.år);
    }
    
    public boolean erFør(Dato d2) {
        return (this.år <= d2.år 
                && this.mnd <= d2.mnd
                && this.dag < d2.dag);
    }
}