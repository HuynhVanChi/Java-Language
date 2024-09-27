package THUC_HANH_TREN_LOP.Buoi3;
//                          Viết chương trình tính số tiền đóng hàng tháng khi vay 1 khoản tiền từ ngân hàng

import java.util.Scanner;

public class thuchanh6_2 {
    public static void main(String[] args) {
        // Khởi tạo 1 đối tuongwh scanner
        Scanner console = new Scanner(System.in);
        
        System.out.print("Xin moi nhap so tien can vay: ");
        //cho phép người dùng nhập
        double m = console.nextDouble();

        System.err.print("Xin moi nhap so nam can vay : ");
        //cho phép người dùng nhập
        int n = console.nextInt();

        System.out.print("Xin moi nhap so lai vay: ");
        //cho phép người dùng nhập
        double c = console.nextDouble();
        
        //Nó trả về Số thực
        System.out.println("So tien ma ban can phai tra hang thang la: " + hangthang(m,c,n));
        
        //Nếu muốn đổi thành số nguyên chúng ta có thể thêm "(int)" trước hangthang(m,c,n)
        System.out.println("So tien ma ban can phai tra hang thang la: " + (int)hangthang(m,c,n));
    }
    public static double hangthang(double m , double c , int  n) {
        int nam=n*12;
        double lai = c /12/100;
        double pay=m*lai*Math.pow(lai+1,nam)/(Math.pow(1+lai,nam)-1);
        return pay;
    }
}
