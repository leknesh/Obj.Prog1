package Account;

import java.util.Date;

/**
 *
 * @author henriette
 */
public class SavingsAccount extends Account {
    
    public SavingsAccount(){
        super();
    }
    
    public SavingsAccount(int id, double balance){
       super(id, balance);
    }
    
    @Override
    public void withdraw(double amount){
        if (amount <= balance) 
            this.balance = (balance - amount);
        else {
            amount = 0;
            System.out.println("For høyt uttaksbeløp, maksimalt uttak er " + balance);
            System.out.println("Tatt ut: " + amount);
        }    
    }   
    
    
}
