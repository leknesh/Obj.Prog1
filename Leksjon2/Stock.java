/**
 *Liang 9.2 stock prices
 * @author henriette
 */
   
public class Stock {
    String symbol;
    String name;
    double previousClosePrice, currentPrice;
    
    public Stock (String symbol, String name, double previousClosePrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.previousClosePrice = previousClosePrice;
        this.currentPrice = currentPrice;
    }
    
    public double getChangePercent() {
        return ((currentPrice - previousClosePrice)/100);
    }
}    

