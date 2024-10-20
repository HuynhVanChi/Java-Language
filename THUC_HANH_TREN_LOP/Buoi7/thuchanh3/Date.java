package THUC_HANH_TREN_LOP.Buoi7.thuchanh3;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    int y; //Năm
    int m; // tháng
    int d; // ngày
    
    public Date( int year ,int month , int day)
    {
        y = year;
        m = month;
        d = day;
    }
    //Đối tượng biểu diễn ngày đã cho
    public void addDays(int days)
    {
        dataTime.plusDays(days * 24);
    }
    //
    public void addWeeks(int weeks)
    {
        
    }
    public int daysTo(Date other)
    {
        
    }
    public int getDay()
    {
        return d;
    }
    public int getMonth()
    {
        return m;
    }
    public int getYear()
    {
        return y;
    }
    public boolean isLeapYear()
    {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }
}
