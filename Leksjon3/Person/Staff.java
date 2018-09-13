package Person;


/**
 *
 * @author henriette
 */
public class Staff extends Employee {
    protected String title;
    
    public Staff (String name, String address, String phone, String email, 
            String office, double salary, MyDate hireDate, String title){
        super(name, address, phone, email, office, salary, hireDate);
        this.title = title;
    }
    
    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    
    @Override
    public String toString(){
        return "Class: Staff, Name: " + name;
    }
}
