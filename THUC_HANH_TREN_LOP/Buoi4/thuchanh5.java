package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh5 {
    public static void main(String[] args) {
        //Yêu cầu người nhập số lượng cần nhập
        Scanner conso = new Scanner(System.in);

        System.out.print("Co bao nhieu so can tinh tong : ");
        int soluong = conso.nextInt();

        int []array = new int[soluong]; // cho so luong vao mang
        int Tong = 0; // khai bao bien tong 
        int demsoam = 0;
        //Cho người nhập từng số theo số lượng trên 
        for(int i = 0 ; i < array.length; i++)
        {
            //Vừa nhập vừa tính tổng 
            System.out.print("Nhap so vao lan "+ (i+1) + ": ");
            array[i] = conso.nextInt();
            if(array[i]<0)
            {
                demsoam++;
            }
            Tong += array[i];
        }
        for(int i = 0 ; i < array.length;i++)
        {
           System.out.println("#"+i+": "+array[i]);
        }
        System.out.println("Tong = "+ Tong);
        System.out.println("#negative = "+ demsoam);
    }

}
