package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh4 {
        public static void main(String[] args) {
        
        //Khai báo Scanner
        Scanner conso = new Scanner(System.in);
        
        //Yêu cầu người nhập số lượng cần nhập
        System.out.print("Co bao nhieu so can tinh tong : ");
        //Nhập số lượng tính
        int soluong = conso.nextInt();

        int []array = new int[soluong]; // cho so luong vao mang
        int Tong = 0; // khai bao bien tong 
        
        //Cho người nhập từng số theo số lượng trên 
        for(int i = 0 ; i < array.length; i++)
        {
            //Vừa nhập vừa tính tổng 
            System.out.print("Nhap so vao lan "+ (i+1) + ": ");
            array[i] = conso.nextInt();
            Tong += array[i];
        }
        for(int i = 0 ; i < array.length;i++)
        {
           System.out.println("#"+i+": "+array[i]);
        }
        System.out.println("Tong = "+ Tong);
    }
}
