package Trekant;


/**
 *
 * @author henriette

 */
public class TestMyPoint {

    public static void main(String[] args) {
        MyPoint punkt1 = new MyPoint(34, 9);
        MyPoint origo = new MyPoint();
        
        System.out.println("Avstanden mellom " + punkt1.toString());
        System.out.println(" og " + origo.toString());
        System.out.println( " er: "+String.format("%.2f", punkt1.distance(origo)));    

        //test av trekant-klassen
       /* MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(2,1);
        MyPoint p3 = new MyPoint(2,2);
        Trekant trekant = new Trekant(p1, p2, p3); */
       
       Trekant trekant = new Trekant(0, 1, 1, 1, 1, 2);
        
        System.out.println("Punkter: " + trekant.toString());
        System.out.println("Omkretsen er: " + String.format("%.2f", (trekant.perimeter())));
        System.out.println("Arealet er: " + String.format("%.2f", (trekant.area())));
    }    
}
