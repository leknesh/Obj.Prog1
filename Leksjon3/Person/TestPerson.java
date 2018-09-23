package Person;

/**
 *
 * @author henriette
 */
public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Per Person", "Personsgt 11, Oslo", "12345667", "per@personsen.no");
        Student p2 = new Student("Stud Studentsen", "Studgt 3", "1234", "afdlgjafljg", "senior");
        Employee p3 = new Employee("Ans Ansattesn", "ansattgt 3", "1234", "zfdljlf", "b23", 123456, (new MyDate(2,3,1977)));
        Faculty p4 = new Faculty("Fak Fakultet", "dljha", "dfjk", "zlfkdjvh", "ljfdh", 123456, (new MyDate(3,4,1234)), "9-16", "guru");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());       
        System.out.println(p3.toString());
        System.out.println(p4);
    }
}
