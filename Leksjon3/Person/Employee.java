package Person;

/**
 *
 * @author henriette
 */
public class Employee extends Person {
    
    protected String office;
    protected double salary;
    protected MyDate hireDate;
    
    public Employee(String name, String address, String phone, String email, 
            String office, double salary, MyDate hireDate) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    
    public void setOffice(String office){
        this.office = office;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void sethireDate(MyDate hireDate){
        this.hireDate = hireDate;
    }
    
    public String getOffice(){
        return office;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public MyDate getHireDate(){
        return hireDate;
    }
    
    public String toString(){
        return super.toString() + "\n" + "Office: " + office + "\n Salary: " + salary
                + "\n Date hired: " + hireDate.toString();
    }
}
