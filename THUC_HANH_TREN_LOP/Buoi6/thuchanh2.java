package THUC_HANH_TREN_LOP.Buoi6;

import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        //nguời dùng nhập số ngày 
        System.out.print("Ban muon nhap nhiet đo bao nhieu ngay? ");
        Scanner conso = new Scanner(System.in);
        int songay = conso.nextInt();
        
        //thực hành 2
        //Khởi động dãy 
        double []dayso = new double[songay];
    
        //-----------
        //-Sau đó người nhập lặp đi lặp lại
        //để nhập số đồng thời ta cũng tính tổng với số vừa nhập vào 

        //đặt biến tổng 
        double sum = 0;
        //-Sau đó người nhập lặp đi lặp lại 
        for(int i = 0 ; i < songay ; i++)
        {
            System.out.print("Nhiet đo ngay thu "+ (i+1) +" : ");
            int nhietdo = conso.nextInt();
            sum += nhietdo;
            dayso[i] = nhietdo; // lưu nhiệt độ
        }
        //tính trung bình
        double trungbinh = sum/songay;
        
        //Tạo biến điếm
        int cout = 0;
        //đếm số ngày có nhiệt độ lớn hơn trung bình
        for(int i = 0 ; i < songay ; i++)
        {
            if(dayso[i] > trungbinh)
            {
                cout++;
            }
        }
        System.out.println("Nhiet do trung binh = "+ trungbinh);
        System.out.println("So ngay co nhiet do lon hon trung binh la: " + cout);
    }
}
