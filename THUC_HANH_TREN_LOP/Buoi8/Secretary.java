package THUC_HANH_TREN_LOP.Buoi8;

public class Secretary {
    int hours;
    int salary;
    int day;
    String from;
    
    //Hàm khởi tạo mặc định
    public Secretary()
    {
        this.hours = 40;
        this.salary = 40000;
        this.day = 365;
        this.from = "vàng";
    }

    //Hàm khởi tạo có giá trị
    public Secretary(int h , int s , int d , String f)
    {
        this.hours = h;
        this.salary = s;
        this.day = d;
        this.from = f;
    }

    public int getHours()
    {
        return  this.hours;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public int getVacationDays()
    {
        return this.day;  
    }
    public String getVacationFrom()
    {
        return this.from;
    }
    
    //Đây là hành vi duy nhất được thêm vào
    public void hanhvirieng()
    {
        System.out.println("Tôi biết cách ghi chep");
    }
}
