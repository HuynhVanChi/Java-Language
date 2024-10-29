package THUC_HANH_TREN_LOP.Buoi7.thuchanh3;

public class Date {

    int y; //Năm
    int m; // tháng
    int d; // ngày
    
    public Date( int year ,int month , int day)
    {
        this.y = year;
        this.m = month;
        this.d = day;
    }
    
    //Đối tượng biểu diễn ngày đã cho
    public void addDays(int days)
    {
        this.d += days;
    }
    
    //Thêm tuần
    public void addWeeks(int weeks)
    {
        int tmp = weeks *7; //Lấy tuần nhân cho 7 ngày 
        for(int i =1 ; i <= tmp ; i++) 
        {
            //Kiểm tra nếu 30 ngày 
            if(this.d == 30)
            {
                if (this.m > 12) 
                {
                    this.y++;    
                    this.m = 0;
                }
                this.m ++; // tăng tháng 
                this.d = 0;//cho ngày quay về 0 
            }
            //Tăng ngày 
            this.d++; 
        }
    }
    
    //
    public int daysTo(Date other)
    {
        return this.d -= other.getDay();
    }
    
    //trả về Day/Month/Year
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
    
    //Kiểm tra xem có phải năm nhuận không 
    public boolean isLeapYear()
    {
        if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0)) {
            return true;
        }
        return false;
    }

    //Trả về chuỗi year/month/Day
    public String toString()
    {
        return getYear()+"/"+getMonth()+"/"+getDay() + " Nam nhuan: " + isLeapYear();
    }
}
