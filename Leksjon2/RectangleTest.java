
/**
 *
 * @author henriette
 * Creates two rectangles and calculates area and perimeter.
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r2 = new Rectangle(2, 0.5, 1, 1);
        Rectangle r1 = new Rectangle(1, 1, 2, 2);
        
        System.out.println("Rectangle 1: Width = " + r1.width +", height: " + r1.height 
                + ", area: " + String.format("%.2f", r1.getArea()) 
                + ", perimeter: " + String.format("%.2f", r1.getPerimeter())
                + ", position: " + r1.getPosition());
          
        System.out.println("Rectangle 2: Width = " + r2.width +", height: " + r2.height 
                + ", area: " + String.format("%.2f", r2.getArea()) 
                + ", perimeter: " + String.format("%.2f", r2.getPerimeter())
                + ", position: " + r2.getPosition());
        System.out.println("Kollisjon? " + Rectangle.kollisjon(r1, r2));
        
    }
    
}
