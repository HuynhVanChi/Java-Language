package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);

        System.out.print("Xin moi nguoi nhap so tien minh co:");
        int Money = conso.nextInt();

        if(Money < 500)
        {
            System.out.println("Cash is dangerously low.Bet carefully.");
        }
        else if(Money < 1000)
        {
            System.out.println("Cash is samewhat low.Bet moderately.");
        }
        else
        {
            System.out.println("Cash is in good shape.Bet liberally");
        }
    }
}
