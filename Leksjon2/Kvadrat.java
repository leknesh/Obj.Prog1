/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriette
 * Klasse for kvadratsetning ax^2 + bx + c = 0
 * 
 */
public class Kvadrat {
    private double a, b, c;
    
    public Kvadrat (double a, double b, double c) {  //overlaster ikke her, burde kanskje det
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double get_a() {
        return a;
    }
    
    public double get_b() {
        return b;
    }
    
    public double get_c() {
        return c;
    }
    
    public double getDiscriminant() {
        return b*b - 4*a*c;
    } 
    
    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0.0;
        }
        else {
            return (-b + Math.sqrt(getDiscriminant()))/2*a;
        }
    }
    
        public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0.0;
        }
        else {
            return (-b - Math.sqrt(getDiscriminant()))/2*a;
        }
    }
}
