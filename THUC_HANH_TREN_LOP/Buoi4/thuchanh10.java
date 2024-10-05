package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh10 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);
        
        System.out.print("Moi ban nhap so n : ");
        int n = conso.nextInt();
        double KQ = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            KQ += 1/(double)i;
        }
        System.out.println("Tong = "+ KQ);
    }
}
