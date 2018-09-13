
package Account;

public class TestAccount {

    public static void main(String[] args) {
       
        Account k1 = new Account(12345, 100000);
        
        System.out.println("Konto nr: " + k1.id + ", balanse: " + k1.balance);
        System.out.println("Årlig rente: " + k1.getAnnualInterestRate());
        System.out.print("Månedlig rentebeløp: ");
        System.out.printf("%.2f", k1.getMonthlyInterest());
        
        k1.deposit(20000);
        
        System.out.println("Ny saldo: " + k1.balance);
        
        k1.withdraw(40000);
        
        System.out.println("Ny saldo: " + k1.balance);
        System.out.print("Månedlig rentebeløp: ");
        System.out.printf("%.2f", k1.getMonthlyInterest());
        
        System.out.println("\n ----------------------------------------------------");
        
        SavingsAccount k2 = new SavingsAccount(34456, 2000);
        k2.withdraw(3000);
        System.out.println("Ny saldo: " + k2.balance);
        
        System.out.println("\n ----------------------------------------------------");
        
        CheckingAccount k3 = new CheckingAccount(34456, 2000, -10000);
        k3.withdraw(3000);
        System.out.println("Ny saldo: " + k3.balance);
        k3.withdraw(10000);
        System.out.println("Ny saldo: " + k3.balance);
    }

    
}
