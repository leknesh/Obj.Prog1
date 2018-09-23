package Opg116;

import java.util.Date;

/*************************************************
 *          Loan
 * _________________________________________________
 * -startAmount: double
 * -startDate: Date
 * -annualInterestRate: double
 * -numberofYears: int
 * --------------------------------------------------
 * +loan()
 * +loan(annualInterestRate: double, numberofYears: int, startAmount: double)
 * +loan(annualInterestRate: double, numberofYears: int, startAmount: double, startDate: Date)
 * +getAnnualInterestRate(): double
 * +getNumberofYears(): int
 * +getStartAmount(): double
 * +getStartDate(): Date
 * +setAnnualInterestRate(double): void
 * +setNumberofYears(int): void
 * +setStartAmount(double): void
 * +setStartDate(Date): void
 * +getMonthlyPayment(): double
 * +getTotalPayment(): double
 * *****************************************************
 * 
*/
public class Loan {
    protected double annualInterestRate;
    protected int numberofYears;
    protected double startAmount;
    protected Date startDate;
    
    public Loan(){   //default
        this(2.5, 1, 0);
    }        
    
    public Loan(double annualInterestRate, int numberofYears, double startAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.startAmount = startAmount;
        startDate = new Date();                 //dagens dato
    }
    
    public Loan(double annualInterestRate, int numberofYears, 
             double startAmount, Date startDate){
        this.annualInterestRate = annualInterestRate;
        this.numberofYears = numberofYears;
        this.startAmount = startAmount;
        this.startDate = startDate;                 //setter spesifikk dato
    }
     
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public int getNumberofYears() {
        return numberofYears;
    }
    
    public double getStartAmount() {
        return startAmount;
    }
    
    public Date getStartDate() {
        return startDate;
    }
     
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void setNumberofYears(int numberofYears) {
        this.numberofYears = numberofYears;
    }
    
    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }
    
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public double getMonthlyPayment(){      //her antas det annuitetslån
        int numberofPayments = numberofYears*12;
        double monthlyInterestDec = annualInterestRate/(12*100);    //desimalverdi
        double monthlyDownPayment;
        
        monthlyDownPayment = ((startAmount*monthlyInterestDec)/
                (1-(Math.pow((1+monthlyInterestDec), -numberofPayments))));
      
        return monthlyDownPayment;
    }
    
    public double getTotalPayment(){
        return getMonthlyPayment()*12*numberofYears;
    }
    
    @Override
    public String toString(){
        String ut = "Nedbetaling av lån kr " + startAmount + " tatt opp " + startDate;
        ut += ". Månedlig beløp = " + String.format("%.2f", getMonthlyPayment()) + " over " + numberofYears + " år. \n";
        return ut;
    }
}
