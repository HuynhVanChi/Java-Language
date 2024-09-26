package THUC_HANH_TREN_LOP.Buoi3;

public class thuchanh2_2 {
    public static void main(String[] args) {
        drawTop();       
    }
    //Tạo hàm drawTop
    public static void drawTop() {
        System.out.print("*");
        writeSpaces(3);
        System.out.println("*");
        
        System.out.print("!");
        writeSpaces(5);
        System.out.println("!");

        System.out.print("'");
        writeSpaces(8);
        System.out.println("'");

        System.out.print("<");
        writeSpaces(10);
        System.out.println(">");
    }
    //Tạo hàm con 
    public static void writeSpaces(int number) {
        //Khoảng trắng
        for(int i = 1 ; i <= number; i++ )
        {
            System.out.print(" ");
        } 
    }
}
