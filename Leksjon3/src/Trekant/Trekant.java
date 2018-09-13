package Trekant;
/**
 *
 * @author henriette
 */
public class Trekant {
    MyPoint p1, p2, p3;
    
    public Trekant(MyPoint p1, MyPoint p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = new MyPoint();    //legger origo som et punkt
    }
    
    public Trekant(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public Trekant (double p1x, double p1y, double p2x, double p2y, double p3x, double p3y){
        this.p1 = new MyPoint(p1x, p1y);
        this.p2 = new MyPoint(p2x, p2y);
        this.p3 = new MyPoint(p3x, p3y);
    }
    
    public Trekant(MyPoint[] pointTab){     //kan evt la trekanten være en MyPoint[] med 3 objekter
        this.p1 = pointTab[0];              //Konstruktør ikke testet
        this.p2 = pointTab[1];
        this.p3 = pointTab[2];
    }
   
    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }
    
    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }
        
    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }  
    
    public MyPoint getP1() {
        return p1;
    }
    
    public MyPoint getP2() {
        return p2;
    }
    
    public MyPoint getP3() {
        return p3;
    }
    
    public double perimeter() {
        return (p1.distance(p2) + p2.distance(p3) + p3.distance(p1));
    }
    
    public double area() {
        double area = (p1.x*(p2.y-p3.y) + p2.x*(p3.y-p1.y) + p3.x*(p1.y-p2.y))/2; 
        return Math.abs(area);
    }
    
    public String toString() {
        return ("Trekant mellom punktene " + (p1.toString()) + ", " + p2.toString()
                + " og " + p3.toString());
    }
}

