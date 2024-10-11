package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Scanner;

public class thuchanh6 {
    public static void main(String[] args) {
        //Loi gioi thieu 
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.print("Xin moi nhap so maban muon doan: ");

        //Khoi dong so dem co dinh
        int so = 30;

        //cho phep nguoi nhap dem
        Scanner conso = new Scanner(System.in);
        int sodoan = conso.nextInt();

        //Khoi dong luot dem
        int cout = 0; // so dem
        
        //Vong lap 
        while(sodoan != so)
        {
            int hit = 0; // 1 ky tu so doan dung
            if(sodoan <= 0 || sodoan > 100)
            {
                System.out.println("(1-100)So ban nhap vuot qua cho phep!!!");
            }
            //goi y
            if(sodoan/10 == so/10 || sodoan/10 == so%10)
            {
                hit++;
            }
            if((sodoan/10 != sodoan%10) && sodoan%10 == so/10 || sodoan%10 == so%10)
            {
                hit++;
            }
            if(sodoan == 0 || sodoan <= 100)
            {
                System.out.print("Ban da doan dung "+hit+" so \n");
            }
            System.out.print("Xin moi nhap lai:");
            sodoan = conso.nextInt();
            cout++;
        }
        //Hien thi ket qua
        System.out.println("Chuc mung ban da doan dung: "+ so +".So lan ban da doan sai la "+ cout + " lan.");
    }
}
