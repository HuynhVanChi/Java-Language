package THUC_HANH_TREN_LOP.Buoi6;

import java.util.Scanner;

public class thuchanh1 {
    public static void main(String[] args) {
        //nguời dùng nhập số ngày 
        System.out.print("Ban muon nhap nhiet đo bao nhieu ngay? ");
        Scanner conso = new Scanner(System.in);
        int songay = conso.nextInt();

        //-----------
        //-Sau đó người nhập lặp đi lặp lại
        //để nhập số đồng thời ta cũng tính tổng với số vừa nhập vào 

        //đặt biến tổng 
        double sum = 0;
        //-Sau đó người nhập lặp đi lặp lại 
        for(int i = 1 ; i <= songay ; i++)
        {
            System.out.print("Nhiet đo ngay thu "+ i +" : ");
            int next = conso.nextInt();
            sum += next;
        }
        //tính trung bình
        double trungbinh = sum/songay;
        System.out.println("Nhiet do trung binh = "+ trungbinh);
    }

}
