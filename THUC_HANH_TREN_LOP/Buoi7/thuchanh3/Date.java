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
        Calendar calendar = new GregorianCalendar(y, m - 1, d);
        calendar.add(Calendar.DAY_OF_YEAR, days);
        this.y = calendar.get(Calendar.YEAR);
        this.m = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH is zero-based
        this.d = calendar.get(Calendar.DAY_OF_MONTH);
    }
    //
    public void addWeeks(int weeks)
    {
        Calendar calendar = new GregorianCalendar(y, m - 1, d);
        calendar.add(Calendar.WEEK_OF_YEAR, weeks);
        this.y = calendar.get(Calendar.YEAR);
        this.m = calendar.get(Calendar.MONTH) + 1; // Calendar.MONTH is zero-based
        this.d = calendar.get(Calendar.DAY_OF_MONTH);
    }
    public int daysTo(Date other)
    {
        Calendar thisDate = new GregorianCalendar(this.y, this.m - 1, this.d);
        Calendar otherDate = new GregorianCalendar(other.y, other.m - 1, other.d);
        long diffInMillis = Math.abs(otherDate.getTimeInMillis() - thisDate.getTimeInMillis());
        long diffInDays = diffInMillis / (24 * 60 * 60 * 1000); // Chuyển đổi mili giây sang ngày
        return (int) diffInDays;
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
