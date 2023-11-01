
package javaapplication47;
 import java.util.Date;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println("Time 1: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println("Time 2: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println("Time 3: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}
