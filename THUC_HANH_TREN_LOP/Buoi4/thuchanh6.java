package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh6 {
    public static void main(String[] args) {
        //Yêu cầu người nhập số lượng cần nhập
        Scanner conso = new Scanner(System.in);

        System.out.print("Co bao nhieu so can tinh tong : ");
        int soluong = conso.nextInt();

        int []array = new int[soluong]; // cho so luong vao mang
        int Tong = 0; // khai bao bien tong 
        int Max = 0 , Min = 0;
        
        //Cho người nhập từng số theo số lượng trên 
        for(int i = 0 ; i < array.length; i++)
        {
            //Vừa nhập vừa tính tổng 
            System.out.print("Nhap so vao lan "+ (i+1) + ": ");
            array[i] = conso.nextInt();
            if(Min == 0)
            {
                Min = array[i];
            }
            if(array[i] > Max)
            {
                Max=array[i];
            }
            if(array[i] < Min)
            {
                Min = array[i]; 
            }
            Tong += array[i];
        }
        for(int i = 0 ; i < array.length;i++)
        {
           System.out.println("#"+i+": "+array[i]);
        }
        System.out.println("Max ="+ Max);
        System.out.println("Min = "+ Min);
        System.out.println("Tong = "+ Tong);
    }
}
