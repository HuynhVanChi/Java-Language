package THUC_HANH_TREN_LOP.Buoi8.thuchanh4;

import THUC_HANH_TREN_LOP.Buoi8.thuchanh1.Employee;

public class LegalSecretary extends Employee  {
    //Cách ghi sai
    
    // public double getSalary()
    // {
    //     return getSalary() + 5000;
    // }
    
    //Cách ghi đúng 
    public double getSalary()
    {
        return super.getSalary() + 5000; //"super" Được dùng khi gọi phương thức , hàm tạo lớp cha
    }
}