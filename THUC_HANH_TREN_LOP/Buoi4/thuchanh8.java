package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh8 {
    public static void main(String[] args) {
        //Yêu cầu người nhập 
        Scanner conso = new Scanner(System.in);

        System.out.print("Nhap chieu cao (height): ");
        double height = conso.nextDouble();

        System.out.print("Nhap can nang (weight):");
        double weight = conso.nextDouble();

        double BMI = (weight/(height*height))*703 ;
        System.out.println("BMI cua ban la : "+ BMI);
        System.out.print("Trang thai cua ban la : ");
        if(BMI < 18.5) 
        {
            System.out.println("Gay");
        }
        else if(BMI < 24.9)
        {
            System.out.println("Binh thuong");
        }
        else if(BMI < 29.9)
        {
            System.out.println("Hoi map");
        }
        else
        {
            System.out.println("Beo");
        }
    }
}
