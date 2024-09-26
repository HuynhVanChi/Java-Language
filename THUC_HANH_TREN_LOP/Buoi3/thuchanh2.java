package THUC_HANH_TREN_LOP.Buoi3;

// Thực hành rút gọn 

public class thuchanh2 {
    
    public static void main(String[] args) {
        drawTop();
    }
    //Tạo hàm drawTop
    public static void drawTop(){
        for(int line = 1 ; line <= 4 ; line++)
        {
            System.out.print("|");
            
            // hàm con writeSpaces (hàm này : tăng khoảng cách)
            writeSpaces(line - 1); //khoảng cách cho bên trái
            
            // in ra dấu "\"
            System.out.print("\\");
            
            //in ra ký tự "."
            for(int i = 1 ; i <= (8 - 2 * line);i++)
            {
                System.out.print(".");
            }
            //in ra dấu "/"
            System.out.print("/");
            
            //hàm con writeSpaces (hàm này : tăng khoảng cách)
            writeSpaces(line - 1); // khoảng cách cho bên phải
            
            //ỉn dấu "|"
            System.out.println("|");
        }
    }

    //Tạo hàm con 
    public static void writeSpaces(int number) {
        for(int i = 1 ; i <= number; i++)
        {
            System.out.print(" ");
        }                
    }
}
