package THUC_HANH_TREN_LOP.Buoi3;
//                               Vẽ hình cây Noel với giá trị nhập vào là số đoạn và chiều cao của mỗi đoạn:

import java.util.Scanner;

public class thuchanh10 {
    // Cay Noel
    public static void main(String[] args) {
        int batdau = 1;
        Scanner console = new Scanner(System.in);

        System.out.print("Xin moi nhap so doan:" );
        int n = console.nextInt();//NHẬP SỐ ĐOẠN

        System.out.print("Xin moi nhap so chieu cao: ");
        int dong = console.nextInt();// CHIỀU CAO CỦA MỖI ĐOẠN

        int maxleng=(1+2*n)+6;

        for(int i = 1 ; i <= n; i++)
        {
            vecay(maxleng,batdau,dong);
            batdau=batdau+2;
        }

        vecay(maxleng,1,1);
        vecay(maxleng,1,1);
        vecay(maxleng,1,1);
        vecay(maxleng,7,1);
    }
    public static void vecay(int maxleng, int batdau , int dong) {
        int i,j;
        
        for(i=1;i<=dong;i++)
        {
            //Khoang cach ben trai
            for(j=1;j<=((maxleng-(batdau+2*(i-1)))/2);j++)
            {
                System.out.print(" ");
            }
            //in ra ky tu "*"
            for(j=1;j<=(batdau+2*(i-1));j++)
            {
                System.out.print("*");
            }
            //Khoang cach ben phai
            for(j=1;j<=((maxleng-batdau)/2);j++)
            {
                System.out.print(" ");
            }
            System.out.println(); // Cach xuong dong
        }
    }
}
