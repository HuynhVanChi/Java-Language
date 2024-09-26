package THUC_HANH_TREN_LOP.Buoi3;

public class thuchanh4 {
    public static void main(String[] args) {
        writeChars('*', 10);
        System.out.println();
        for(int i = 1 ; i <= 3;i++)
        {
            System.out.print("*");
            writeChars(' ', 8);
            System.out.println("*");
        }
        writeChars('*', 10);
    }
    public static void writeChars(char ch , int number) {
        for(int i = 1; i <= number;i++)
        {
            System.out.print(ch);
        }
    }
}
