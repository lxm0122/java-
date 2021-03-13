package day02;

import java.util.Calendar;
import java.util.Date;

public class Demo_date {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.WEEK_OF_MONTH,1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DATE,48);
        Date time1=calendar.getTime();
        System.out.println(time1);
        String src;
    }
}
