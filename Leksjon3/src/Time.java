/**
 * * @author henriette
 * Liang Excersise 10.1
 * Skjønner ikke helt dette her....
 */
public class Time {
    long hour, minute, second;
    
    public Time() {
       this(0);
    }
    
    public Time(long hour, long minute, long second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Time (long elapseTime) {
        setTime(elapseTime);
    }

    public long getHour() {
        return hour;
    }
    public long getMinute() {
        return minute;
    }
    public long getSecond() {
        return second;
    }
    public void setTime(long elapseTime) {
        long totalMillisec = System.currentTimeMillis();
        long totalSeconds = totalMillisec/1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes/60;
        hour = totalHours % 24;
        
    }
}

