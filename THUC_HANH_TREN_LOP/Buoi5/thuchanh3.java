package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Scanner;

public class thuchanh3 {
    public static void main(String[] args) {
        //Loi khoi dau
        System.out.println("Tinh tong cac so duoc nhap vao");
        
        //cho nguoi dung nhap
        Scanner conso = new Scanner(System.in);
        System.out.print("Nguoi dung nhap so de tinh tong :");
        int number = conso.nextInt(); // nhap so 
        int Sum = 0; // Tong

        //Cho nguoi dung nhap lien tuc va tinh tong va dung lai
        while (number != -1) 
        {
            Sum += number; // tinh tong
            System.out.println(".Tong :" + Sum);
            System.out.print("(Stop bam -1)Nhap so tiep: ");
            number = conso.nextInt();
        }
        System.out.println("=======> Tong tinh duoc la: "+ Sum);
    }
}
