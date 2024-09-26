package THUC_HANH_TREN_LOP.Buoi3;

public class thuchanh1 {
    
    public static void main(String [] args)
    {
        drawTop();
    }
    
    //Tao ham drawTop
    public static void drawTop(){
        for(int line = 1 ; line <= 4 ; line++ )
        {
            System.out.print("|");
            
            //Khoảng trắng bên trái
            for(int i = 1 ; i <= (line - 1) ; i++)
            {
                System.out.print(" ");
            }
            System.out.print("\\");
            
            //in dau "."
            for(int i = 1 ; i <= (8-2*line); i++)
            {
                System.out.print(".");
            }

            System.out.print("/");
            
            // in khoảngng trắng bên phải
            for(int i = 1 ;  i <= (line - 1); i++)
            {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }
}