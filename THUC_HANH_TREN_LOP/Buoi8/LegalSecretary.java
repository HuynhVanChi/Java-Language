package THUC_HANH_TREN_LOP.Buoi8;

public class LegalSecretary extends Employee  { //LegalSecretary kế thừa trạng thái , hàng vi của Employee
    
    //Hàm khởi tạo mặc định
    public LegalSecretary()
    {
        super();// Gọi hàm khởi tạo mặc định của lớp Employee
    }

    //Hàm khởi tạo có giá trị
    public LegalSecretary(int d , int s)
    {
        super(d , s ,10 , "yellow");// Thư ký có VacationDays và form giống Employee
    }

    //Hàng vi riêng 
    public void hangvirieng()
    {
        System.out.println("Biết cách nộp hồ sơ pháp lý.");
    }

    //Hàm main
    public static void main(String[] args) {
        //Tạo đối tượng LegalSecretary với hàm khởi tạo mặc định
        LegalSecretary thukyPL = new LegalSecretary(); //đối tượng là thukyPL
        System.out.println("Legal Secretary: ");
        System.out.println("Hours: " + thukyPL.getHours());
        System.out.println("Salary: " + thukyPL.getSalary());
        System.out.println("VacationDays: " + thukyPL.getVacationDays());
        System.out.println("VacationFrom: " + thukyPL.getVacationFrom());
        thukyPL.hangvirieng(); // hành vi riêng của Thư Ký Pháp lý

        //Tạo đối tượng LegalSecretary với hàm khởi tạo có giá trị
        LegalSecretary thukyPL2 = new LegalSecretary(40 , 50000);
        System.out.println("Legal secretary: ");
        System.out.println("Hours: " + thukyPL2.getHours());
        System.out.println("Salary: " + thukyPL.getSalary());
        System.out.println("VacationDays: " + thukyPL2.getVacationDays());
        System.out.println("VacationFrom: " + thukyPL2.getVacationFrom());
        thukyPL2.hangvirieng();
    }
}
