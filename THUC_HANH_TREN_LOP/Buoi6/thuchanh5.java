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
            System.out.println("File khong ton tai: " + file);
            return; // Thoát khỏi chương trình nếu file không tồn tại
        } else {
            System.out.println("File ton tai. Doc noi dung file...");
        }

        int [] count = new int[5]; //đếm các phần tử từ 0 - 4
        
        //Câu lệnh FileNotFoundException
        try{
            // dùng Scanner để đọc file
            Scanner docfile = new Scanner(new File(filePath));
             
            //Đọc giá trị và tăng thứ tự mảng tương ứng với giá trị đọc được ; docfile.hasNextInt() = true
            while(docfile.hasNextInt()); //kiểm tra đến phần tử cuối cùng 
            {
                int next = docfile.nextInt();
                count[next]++; // next = số thứ tự trong mảng
            }
            docfile.close();
            //hiện thị kết quả 
            System.out.println("Gia tri\tSo luong");
            for(int i = 0 ; i < count.length;i++)
            {
                System.out.println("  "+ i + "\t  " + count[i]);
            }

        }catch (FileNotFoundException docfile) //Nếu trong file không đọc được sẽ hiện lên 
        {
              System.out.println("Không thể đọc file: "+ docfile.getMessage());
        }
    }
}  
