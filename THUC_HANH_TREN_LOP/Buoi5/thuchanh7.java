package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Random;
import java.util.Scanner;

public class thuchanh7 {
    public static void main(String[] args) {
        //Loi noi Khoi dau
        System.out.println("======GUESS GAME======");
        System.out.print("Xin moi nguoi dung nhap so (tu 1 - 10): ");

        //Cho phep nguoi dung nhap so
        Scanner nhap = new Scanner(System.in);
        int number = nhap.nextInt(); // nhap so
        
        //VÒNG ĐẾN KHI BẠN NHẬP ĐÚNG 1 SỐ TỪ 1 ĐẾN 10
        while(number <= 0 || number > 10)
        {
            System.out.println("Ban da nhap so qua cho phep!!!(tu 1 - 10): ");
            System.out.print("Xin moi nhap lai: ");
            number = nhap.nextInt(); //nhập số
            System.out.println();//cách dòng
        }

        //khoi tao so dem
        int cout = 0;
        
        //Khoi tao random 
        Random r = new Random();
        int maytinh = r.nextInt(10) + 1; // chay tu 1 - 10
         
        String chu;
        
        while(true)
        {
            //MÁY TÍNH SẼ RANDOM TIẾP SỐ 1-10
            maytinh = r.nextInt(10) +1;
            
            //IN RA SỐ MÁY TÍNH RANDOM
            System.out.println("No la so : "+ maytinh +"(y/n): ");
            
            //MÌNH SẼ NHẬP Y/N
            chu = nhap.next();
            
            //KIỂM MÁY TÍNH ĐOÁN SAI MÀ TRẢ LỜI ĐÚNG SẼ CẢNH CÁO VÀ DỪNG TRÒ CHƠI
            if(chu.equalsIgnoreCase("N"))
            {
                if(maytinh == number)
                {
                    System.out.println("CANH CAO!!! Khong choi gian lan. ");
                    break;
                }
            }
            
            //KIỂM TRA NẾU NHẬP Y SẼ DỪNG WHILE
            if(chu.equalsIgnoreCase("Y"))
            {
                //KIỂM TRA MÁY TÍNH ĐOÁN SAI MÀ MÌNH NÓI ĐÚNG SẼ IN CẢNH CÁO
                if(maytinh != number)
                {
                    System.out.println("May tinh chua doan dung so cua ban.Ban phai chon 'N' hay 'n' !!!");
                }
                else
                {
                    break;
                }
            }
            cout++; // + SỐ LẦN ĐOÁN 
        }
        System.out.println("May Tinh : Toi da doan dung so cua ban sau "+ cout +" lan.");
    }
}
