package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Scanner;

public class thuchanh5 {
    public static void main(String[] args) {
        //Loi gioi thieu
        System.out.println("Day la chuong trinh doan so cho truoc.");
        System.out.print("Xin moi nhap so maban muon doan: ");

        //Khoi dong so dem co dinh
        int so = 42;
        
        //Cho phep nguoi nhap dem
        Scanner conso = new Scanner(System.in);
        int sodoan = conso.nextInt();

        //Khoi dong luot dem
        int cout = 0;

        // Vong lap den khi nguoi do doan dung dung thi dung lai
        // Dong thoi dem so luot doan
        while(sodoan != so)
        {
            System.out.print("Ban da doan sai so.(");
            //goi y
            int hit = 0;
            if(sodoan/10 == so/10 || sodoan/10 == so%10)
            {
                hit++;
            }
            if((sodoan/10 != sodoan%10) && sodoan%10 == so/10 || sodoan%10 ==so%10)
            {
                hit++;
            }
            System.out.print("Ban da doan dung "+hit+" so) \n");
            System.out.print("Xin moi nhap lai:");
            sodoan = conso.nextInt();
            cout++;
        }
        //Hien thi ket qua
        System.out.println("Chuc mung ban da doan dung: "+ so +".So lan ban da doan la "+ cout + " lan.");
    }
}
