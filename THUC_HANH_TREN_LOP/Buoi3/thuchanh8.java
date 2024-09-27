package THUC_HANH_TREN_LOP.Buoi3;
//                                  Viết chương trình nhập bán kính và tính thể tích hình tròn 

import java.util.Scanner;

public class thuchanh8 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);

        System.out.print("Xin moi nhap so Ban Kinh: ");
        double R = conso.nextDouble();

        System.out.println("Ket qua The Tich hinh tron: "+ thetich(R));
    }
    public static double thetich(double R) {
        return 4/3*3.14*Math.pow(R,2);
    }
}
