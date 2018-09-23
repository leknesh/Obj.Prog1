
package Account;


public class CheckingAccount extends Account {
    protected double overdraftLimit;
    
    public CheckingAccount(){
        super();
        this.overdraftLimit = 0;
    }
    
    public CheckingAccount(int id, double balance, double overdraftLimit){
       super(id, balance);
       this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if (balance - amount > overdraftLimit) 
            this.balance = (balance - amount);
        else {
            amount = 0;
            System.out.println("For høyt uttaksbeløp, maksimalt uttak er " + (balance-overdraftLimit));
            System.out.println("Tatt ut: " + amount);
        }    
    }   

}
