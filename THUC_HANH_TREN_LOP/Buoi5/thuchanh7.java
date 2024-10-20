package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Random;
import java.util.Scanner;

public class thuchanh7 {
    public static void main(String[] args) {
        //Loi noi Khoi dau
        System.out.println("======GUESS GAME======");
        System.out.print("Xin moi nguoi dung nhap so (tu 1 - 10): ");

        //Cho phep nguoi dung nhap so
        Scanner nhap = new Scanner(System.in);
        int number = nhap.nextInt(); // nhap so
        //khoi tao so dem
        int cout = 0;
        //Khoi tao random 
        Random r = new Random();
        int maytinh = r.nextInt(10) +9; // chay tu 1 - 10
        System.out.println("No la so : "+ maytinh + "(y/n): ");
        String chu = nhap.next();
        while(chu.equalsIgnoreCase("N"))
        {
            maytinh = r.nextInt(10) +1;
            System.out.println("No la so : "+ maytinh +"(y/n): ");
            chu = nhap.next();
            if(chu.equalsIgnoreCase("Y"))
            {
                break;
            }
            cout++;
        }
        System.out.println("May Tinh : Toi da doan dung so cua ban sau "+ cout +" lan.");
    }
}
