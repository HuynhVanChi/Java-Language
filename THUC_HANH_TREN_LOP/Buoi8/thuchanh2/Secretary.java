package THUC_HANH_TREN_LOP.Buoi8.thuchanh2;

public class Secretary {
    int hours;
    int salary;
    int day;
    String from;
    public Secretary()
    {
        this.hours = 40;
        this.salary = 40000;
        this.day = 365;
        this.from = "vàng";
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
