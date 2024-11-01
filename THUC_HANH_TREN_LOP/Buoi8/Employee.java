package THUC_HANH_TREN_LOP.Buoi8;

public class Employee {
    int hours;
    int salary;
    int day;
    String from;
    //Hàm khởi tạo tham số 
    public Employee(int h , int s , int d , String f)
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
    public double getSalary()
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
}
