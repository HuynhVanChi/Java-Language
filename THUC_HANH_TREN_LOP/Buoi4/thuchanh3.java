package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        Scanner chu = new Scanner(System.in);

        System.out.println("Xin moi nhap [yes] hay [no]");
        String nhap = chu.next();
        // Neu khong su dung equals no se luon hien thi sai 
        if (nhap == "yes") {
            System.out.println("Ban da nhap Yes.");
        }
        else if (nhap == "no") {
            System.out.println("Ban da nhap no.");
        }
        else
        {
            System.out.println("Ban da nhap Khong nhap Yes hay No.");
        }
        System.out.println();
        // chinh sua lai
        System.out.println("Ket Qua khi them equals :");
        if (nhap.equals("yes")) {
            System.out.println("Ban da nhap Yes.");
        }
        else if (nhap.equals("no")) {
            System.out.println("Ban da nhap No.");
        }
        else
        {
            System.out.println("Ban da nhap Khong nhap Yes hay No.");
        }
        System.out.println();
        //Su dung equalsIgnoreCase này giúp người nhập chữ đa dạng hơn VD : "Yes" , "YES" , "yES" mà vẫn hiện đúng kết quả 
        System.out.println("Ket Qua equalsIgnoreCase:");
        if (nhap.equalsIgnoreCase("yes")) {
            System.out.println("Ban da nhap Yes.");
        }
        else if (nhap.equalsIgnoreCase("no")) {
            System.out.println("Ban da nhap No.");
        }
        else
        {
            System.out.println("Ban da nhap Khong nhap Yes hay No.");
        }
    }
}
