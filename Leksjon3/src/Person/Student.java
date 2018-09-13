package Person;


/**
 *
 * @author henriette
 * Liang opg 11.2
 */
public class Student extends Person {

    protected String status;
    
    public Student (String name, String address, String phone, String email, String status){
        super(name, address, phone, email);
        this.status = status;
    }
    
    public String getStatus (){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n Status: " + status;
    }
}
