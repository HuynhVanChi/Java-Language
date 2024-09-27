package THUC_HANH_TREN_LOP.Buoi3;
// Viết chương trình nhập số n và sao đó hiện 2 mũ từ 1 đến n

import java.util.Scanner;

public class thuchanh9 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);

        System.out.print("Nhap so n: ");
        int n = conso.nextInt();

        for(int i = 0 ; i <= n ; i++)
        {
            System.out.print((int)Math.pow(2, i) + " ");
        }
    }
}
