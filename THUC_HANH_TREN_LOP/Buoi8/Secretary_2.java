package THUC_HANH_TREN_LOP.Buoi8;

public class Secretary_2 extends Employee { // "extends Employee" kế thừa trạng thái , hàng vi của Employee.
    
    // Hàm khởi tạo mặc định
    public Secretary_2()
    {
        super();// Gọi hàm khởi tạo mặc định của lớp Employee
    }

    // Hàm khởi tạo có giá trị
    public Secretary_2( int h , int s)
    {
        super(h , s , 10 , "yellow"); // Thư ký có VacationDays và form giống Employee
    }

    //Hành vi của Thư ký
    public void hanhvirieng()
    {
        System.out.println("Tôi biết cách ghi chep");
    }
}
