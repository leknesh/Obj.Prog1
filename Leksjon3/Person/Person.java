package Person;


/**
 *
 * @author henriette
 * Liang oppgave 11.2
 */
public class Person {
    protected String name, address, phone, email;
    
    public Person(String name, String address, String phone, String email){
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    } 
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getName(){
        return name;
    }
    
     public String getAddress(){
        return address;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String toString(){
        return ("Name: " + name +", address: " + address + "\n" +
                "Phone: " + phone + "\n" +
                "eMail: " + email);
    }
}
