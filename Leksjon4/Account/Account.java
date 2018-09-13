
package Account;

import java.util.Date;

/**
 *
 * @author henriette
 */
public class Account {
    protected int id;
    protected double balance;
    protected static double annualInterestRate = 5.0;
    protected Date dateCreated;
    
    public Account() {
        id = 0;
        balance = 0;
        dateCreated = new Date();
    }
    
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    
    public int getId() {
        return id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(Double balance){
        this.balance = balance;
    }
    
    public void setDateCreated(Date date) {
        this.dateCreated = date;
    }
    
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest(){
        return (balance * (getMonthlyInterestRate())/100);
    }
    
    public void withdraw(double amount){
        this.balance = (balance - amount);
    }
    
    public void deposit(double amount){
        this.balance = (balance + amount);
    }  
}
