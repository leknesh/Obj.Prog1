package Opg116;

import java.lang.Math;
import Trekant.MyPoint; //lagt Leksjon 3 i Library, importerer MyPoint-klassen her

/***********************************
 *          Circle
 * ---------------------------------
 * -radius: double
 * -position: MyPoint
 * ----------------------------------
 * +Circle()
 * +Circle(radius: double)
 * +Circle(radius: double, position: MyPoint)
 * +Circle(radius: double, x: double, y: double)
 * +setRadius(radius: double): void
 * +setPosition(position: MyPoint): void
 * +getRadius(): double
 * +getPosition(): MyPoint
 * +circumference(): double
 * +area(): double
 * +changePosition(dx: double, dy: double)
 * --------------------------------------
 *
 * @author henriette
 */
public class Circle {
    protected double radius;
    protected MyPoint position;
    
    public Circle(){
    }
    
    public Circle(double radius){
        if (radius <= 0)
            throw new IllegalArgumentException ("Negative radius!");
        this.radius = radius;
        this.position = new MyPoint();
    }
    
    public Circle(double radius, MyPoint position){
        this.radius = radius;
        this.position = position;
    }
    
    public Circle(double radius, double x, double y){
        this.radius = radius;
        this.position = new MyPoint(x,y);
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public void setPosition(MyPoint position){
        this.position = position;
    }
    
    public void setPosition(double x, double y){
        this.position = new MyPoint(x,y);
    }
    
    public double getRadius(){
        return radius;
    }
    
    public MyPoint getPosition(){
        return position;
    }
    
    public double circumference(){
        return 2*Math.PI*radius;        //2PIr
    }
    
    public double area(){
        return Math.PI*Math.pow(radius, 2); //PIr^2
    }
    
    @Override
    public String toString(){
        String ut = "Sirkel i posisjon " + position + "og radius " + String.format("%.2f", radius);
        ut += ", har omkrets " + String.format("%.2f", circumference()) + " og areal " + String.format("%.2f", area()) + ". \n";
        return ut;
    }
    
    /*
    public void changePosition(double dx, double dy){
    
        //her må jeg nødvendigvis hente ut x og y fra MyPoint for å lage et nytt Mypoint (x+dx, y+dy)
        //får feilmld når jeg prøver å bruke MyPoint.getX(); non-static/static...
    
    double x1 = MyPoint.getX();
    double y1 = MyPoint.getY();
    this.position = new MyPoint((x1+dx),(y1+dy));
    }
    */
}
