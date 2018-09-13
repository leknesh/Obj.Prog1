package Trekant;


/**
 *
 * @author henriette
 * UML:
 * ******************
 *     MyPoint
 * =================
 * +x(int)
 * +y(int)
 * +MyPoint()
 * +MyPoint(x: double, y: double)
 * +distance(Mypoint: myPoint)
 * +distance(x: double, y: double)
 * -------------------------------
 */
public class MyPoint {
   double x, y;
   
   public MyPoint() {
       this.x = 0;
       this.y = 0;
   }
   
   public MyPoint(double x, double y) {
       this.x = x;
       this.y = y;
   }
   
   public void setX(Double x) {
       this.x = x;
   }
   public void setY(Double y) {
       this.y = y;
   }
   
   public double getX(){
       return x;
   }
   
   public double getY(){
       return y;
   }
  
   public double distance(MyPoint myPoint) {
       return Math.sqrt(Math.pow((x-myPoint.getX()), 2) + Math.pow((x-myPoint.getY()), 2));
   }
   
   public double distance(double x, double y) {
       return distance(new MyPoint(x, y));
   }
   
   public String toString() {
       return "( " + x + ", " + y + ")";
   }
}
