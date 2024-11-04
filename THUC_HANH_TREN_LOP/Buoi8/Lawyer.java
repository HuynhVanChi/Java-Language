package THUC_HANH_TREN_LOP.Buoi8;

public class Lawyer extends Employee { // Lawyer kế thừa trạng thái, hàng vi của Employee
    //Hàm khởi tạo mặc định
    public Lawyer()
    {
        super();// Gọi hàm khởi tạo mặc định của lớp Employee
    }

    //Hàm khởi tạo có giá trị
    public Lawyer(int d , int s)
    {
        super(d , s , 15 , "pink");
    }

    //Hàng vi của Luật sư
    public void hangvirieng()
    {
        System.out.println("Biết cách cư xử lý các vụ kiện.");
    }
}