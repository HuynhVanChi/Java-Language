package THUC_HANH_TREN_LOP.Buoi7.thuchanh3;
public class thuchanh3 {
    public static void main(String[] args) {
        //Khởi tạo 
        Date dmy = new Date(2006, 07, 22);
        //In ra tuần ban đầu cho 
        System.out.println(dmy.toString());
        
        //Tuần  
        dmy.addWeeks(75);//Cho 4 tuần thì tăng 1 tháng
        //In ra KQ y/m/d khi thêm 4 tuần
        System.out.println(dmy.toString());
        
        //
        dmy.daysTo(dmy);
        System.out.println(dmy.toString());
    }
}
