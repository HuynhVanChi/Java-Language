package THUC_HANH_TREN_LOP.Buoi6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class thuchanh5 {
    public static void main(String[] args) {
        
        //Gán Đường dẫn tới file cho biến filePath 
        String filePath = "THUC_HANH_TREN_LOP/Buoi6/tally.txt";
        int [] count = new int[5]; //đếm các phần tử từ 0 - 4
        
        //Câu lệnh FileNotFoundException
        try{
            File file = new File(filePath);//chỉ định đến file
            
            // dùng Scanner để đọc file
            Scanner docfile = new Scanner(file);
            
            //Đọc giá trị và tăng thứ tự mảng tương ứng với giá trị đọc được ; docfile.hasNextInt() = true
            while(docfile.hasNextInt()) //đọc file tally.txt đầu đến phần tử cuối cùng 
            {
                int next =docfile.nextInt(); // đọc từng phần tử và lưu vào biến next
                count[next]++; // next = số thứ tự trong mảng
            }
            
            // Đóng Scanner sau khi đọc file
            docfile.close();
            
            //hiện thị kết quả 
            System.out.println("Gia tri\tSo luong");
            for(int i = 0 ; i < count.length;i++)
            {
                System.out.println("  "+ i + "\t  " + count[i]);
            }
        }catch (FileNotFoundException e) //Nếu trong file không đọc được sẽ hiện lên 
        {
            System.out.println("Khong the doc file: ");
            e.printStackTrace(); // In ra thông tin chi tiết về ngoại lệ
        }
    }
}  
