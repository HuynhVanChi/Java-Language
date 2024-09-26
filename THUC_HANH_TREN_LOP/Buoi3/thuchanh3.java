package THUC_HANH_TREN_LOP.Buoi3;

public class thuchanh3 {
    
    public static void main(String[] args) {
        writeChars('=', 20);
        System.out.println(); // cách xuống dòng
        
        for(int i = 1 ; i <= 10 ; i++)
        {
            writeChars('>', i);
            writeChars(' ', 20-2*i);
            writeChars('<', i);
            System.out.println();
        }
   }
    
    //Tạo hàm con 
    public static void writeChars(char ch , int number) {
        for(int i = 1; i <= number;i++)
        {
            System.out.print(ch);
        }
    }
}
