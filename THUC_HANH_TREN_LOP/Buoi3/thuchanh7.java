package THUC_HANH_TREN_LOP.Buoi3;
//                          Viết chương trình nhập 3 cạnh của tam giác sau đó tính diện tích và chu vi theo công thức sau

import java.util.Scanner;

public class thuchanh7 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);

        System.out.println("XIn moi nhap canh a: ");
        double a = conso.nextDouble();

        System.out.println("XIn moi nhap canh a: ");
        double b = conso.nextDouble();

        System.out.println("XIn moi nhap canh a: ");
        double c = conso.nextDouble();

        System.out.println("Chu vi: " + chuvi(a,b,c));
        System.out.println("Nua chu vi:"+ nuachuvi(a,b,c));
        System.out.println("Dien tich:"+ dientich(a,b,c));
    }
    public static double chuvi(double a , double b , double c) {
        return a + b + c;
    }
    public static double nuachuvi(double a , double b , double c) {
        return (a + b + c )/ 2;
    }
    public static double dientich(double a , double b , double c) {
        double p = a + b + c;
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }
}
