package THUC_HANH_TREN_LOP.Buoi6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text {
    public static void main(String[] args) {
        String filePath = "THUC_HANH_TREN_LOP/Buoi6/tally.txt"; // Thay đường dẫn file tại đây
        int [] count = new int[5];
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);

            // Đọc từng phần tử trong file
            while (scanner.hasNextInt()) {
                // Kiểm tra nếu phần tử là số nguyên
                int next =scanner.nextInt();
                count[next]++;
            }

            scanner.close();

           //hiện thị kết quả 
           System.out.println("Gia tri\tSo luong");
           for(int i = 0 ; i < count.length;i++)
           {
               System.out.println("  "+ i + "\t  " + count[i]);
           }

        } catch (FileNotFoundException e) {
            System.out.println("File không được tìm thấy: " + filePath);
            e.printStackTrace();
        }
    }
}
