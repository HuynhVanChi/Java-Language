package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh9 {
    public static void main(String[] args) {
        Scanner chu = new Scanner(System.in);

        System.out.print("Moi ban chon loai mau (B - G - R ): ");
        String mau = chu.next();

        if(mau.equalsIgnoreCase("B"))
        {
            System.out.println("Ban da chon mau Blue.");
        }
        else if(mau.equalsIgnoreCase("G"))
        {
            System.out.println("Ban da chon mau Green.");
        }
        else if(mau.equalsIgnoreCase("R"))
        {
            System.out.println("Ban da chon mau Red");
        }
        else
        {
            System.out.println("Loi Khong co mau do!!!!");
        }
    }
}
