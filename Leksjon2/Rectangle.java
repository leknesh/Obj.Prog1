/**
 *
 * @author henriette
 * Klasse som oppretter rektangelobjekter og beregner omkrets og areal.
 * Det sjekkes også om rektanglene overlapper
 */
public class Rectangle {
    double width, height;
    int x, y;
    
    /*public Rectangle(){
        this.width = 1.0;
        this.height = 1.0;
        this.x = 1;
        this.y = 1;
    } */
    
    public Rectangle (double width, double height, int x, int y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter(){
        return 2*width + 2*height;
    }
    
    public String getPosition(){
        return "(" + x + ", " + y + ")";
    }
    
    public static boolean kollisjon(Rectangle r1, Rectangle r2) { //Vanskelig å finne generell formel for overlapp?? Spørs i hvilket hjørne
        boolean overX = true, overY = true;
        
        if (r1.x + r1.width < r2.x || r2.x + r2.width < r1.x ) { 
            overX = false;
        }
        System.out.println(overX);
        
        if (r1.y + r1.height < r2.y || r2.y + r2.height < r1.y ){
            overY = false;
        }
        System.out.println(overY);
        
        if (overX && overY)
            return true;
        else
            return false;
    }
}
