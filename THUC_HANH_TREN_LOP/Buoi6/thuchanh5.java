package THUC_HANH_TREN_LOP.Buoi6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class thuchanh5 {
    public static void main(String[] args) {
        
        // Đường dẫn tới file
        String filePath = "THUC_HANH_TREN_LOP/Buoi6/tally.txt";
        
        // Kiểm tra file tồn tại
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("File khong ton tai: " + filePath);
            return;  // Thoát khỏi chương trình nếu file không tồn tại
        } else {
            System.out.println("File ton tai. Đoc noi dung file...");
        }
        
        int [] count = new int[5]; //đếm các phần tử từ 0 - 4
        try{
            Scanner docfile = new Scanner(filePath);
            while(docfile.hasNextInt());
            {
                int next = docfile.nextInt();
                count[next]++; // next = số thứ tự trong mảng
            }
            docfile.close();
        }catch (FileNotFoundException e) {
              System.out.println("Không thể đọc file: "+ e.getMessage());
        }
        
        //hiện thị kết quả 
        System.out.println("Gia trị\tSo luong");
        for(int i = 0 ; i < count.length;i++)
        {
            System.out.println(i + "\t" + count[i]);
        }
    }
}
