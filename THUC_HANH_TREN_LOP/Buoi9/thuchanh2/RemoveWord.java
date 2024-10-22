package THUC_HANH_TREN_LOP.Buoi9.thuchanh2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class RemoveWord {
    public static void main(String[] args) {
        //Khởi tạo ArrayList có tên là Word
        ArrayList<String> word = new ArrayList<>();
        word.add("one");
        word.add("a");
        word.add("to");
        word.add("time");
        word.add("of");
        word.add("in");
        
        //đọc file
        //1.Đường link dẫn file speech
        String filePath = "THUC_HANH_TREN_LOP\\Buoi9\\thuchanh2\\speech.txt";
        //2.Đọc file và sử lý
        try{
            File file = new File(filePath); //Chỉ định đến file
            //scanner đọc file
            Scanner docfile = new Scanner(file);
            
            // Đọc từng từ trong file
            while(docfile.hasNext())
            {
                String removeWord = docfile.next();
                
                // Kiểm tra xem từ đó có trong danh sách từ cần xóa không
                if(!word.contains(removeWord))
                {
                    System.out.print(removeWord + " ");
                }    
            }
            // Đóng Scanner sau khi đọc file
            docfile.close();

        }catch(FileNotFoundException e)
        {
            System.out.println("Khong the doc file.");
        }
    }
}
