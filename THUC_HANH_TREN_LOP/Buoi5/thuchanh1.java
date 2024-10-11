package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Random;
import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        //lời giới thiệu 
        System.out.println("Day la chuong trinh tro choi doan chu");
        System.out.println("Sinh vien thuc hien: ");

        //tao so ngau nhien
        Random r = new Random();
        int soao = r.nextInt(10) + 1; // tao so ngau nhien tu 1 - 10

        //cho phep nguoi dung tao so
        System.out.println("Xin moi nguoi dung nhap so ma ban doan: ");
        Scanner conso = new Scanner(System.in);
        int sodoan = conso.nextInt() ;
        
        int cout = 1; // tao so dem sai
        while(soao != sodoan)
        {
            System.out.println("Rat tiet ban da doan sai.");
            System.out.println("Xin moi nhap so ma ban doan: ");
            
            sodoan = conso.nextInt();
            if(soao != sodoan) // so lan doan sai
            {
                cout++;
            }
        }
        System.out.println("=========================");
        System.out.println("Chuc mung ban da doan dung so la so: "+ soao +".Ban doan sai " + cout + "lan");
    }
}
