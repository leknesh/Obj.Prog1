package Person;



/**
 *
 * @author henriette
 */
public class Faculty extends Employee {
    protected String officeHours;
    protected String rank;
    
    public Faculty (String name, String address, String phone, String email, 
            String office, double salary, MyDate hireDate, String officeHours,
            String rank){
        super(name, address, phone, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    
    public void SetOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    
    public void SetRank(String rank) {
        this.rank = rank;
    }
    
    public String GetOfficeHours(){
        return officeHours;
    }
    
    public String GetRank(){
        return rank;
    }
    
    @Override
    public String toString(){
        return "Class: Faculty, Name: " + name;
    }
}
