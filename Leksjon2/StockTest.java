/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author henriette
 */
public class StockTest {
    public static void main(String[] args) {
      
        Stock aksje = new Stock("ORCL", "Oracle", 34.5, 34.35);
        
        System.out.print(aksje.symbol + "  -  " + aksje.name + "  -  Change: " 
                + String.format("%.4f", aksje.getChangePercent()) + "%   ");
        
    }    
}
