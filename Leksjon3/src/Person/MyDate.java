package Person;

/**
 *
 * @author henriette
 * Liang excersise 10.14
 */
import java.util.GregorianCalendar;

public class MyDate {
    protected int year, month, day; 
    
    public MyDate() {
        GregorianCalendar kalender = new GregorianCalendar();
        this.year = kalender.get(GregorianCalendar.YEAR);
        this.month = kalender.get(GregorianCalendar.MONTH);
        this.day = kalender.get(GregorianCalendar.DAY_OF_MONTH);
    }
    
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }
    
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }
    
    public String getMonthTxt(){
        if (month < 10)
            return "0" + month;
        else
            return "" + month;
    }
    
    public String getDayTxt(){
        if (day < 10)
            return "0" + day;
        else
            return "" + day; 
    }
    
    public void setDate(long elapsedTime){
        GregorianCalendar kalender = new GregorianCalendar();
        kalender.setTimeInMillis(elapsedTime);
        year = kalender.get(GregorianCalendar.YEAR);
        month = kalender.get(GregorianCalendar.MONTH);
        day = kalender.get(GregorianCalendar.DAY_OF_MONTH);        
    }
    
    @Override
    public String toString(){
        return "" + day + "-" + month + "-" + year;
    }
}
