package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh9 {
    public static void main(String[] args) {
        drawLine();
        tophalf();
        bottomhalf();
        drawLine();
    }
    public static void drawLine() {
        System.out.print("+");
        for(int i = 1 ; i <= 6 ; i++ )
        {
            System.out.print("-");
        }
        System.out.println("+");
    }
    public static void tophalf() {
        for(int i = 1 ; i <= 3; i++)
        {
            // in dau |
            System.out.print("|");
            
            //in khoang trang
            for(int j = 1 ; j < i;j++)
            {
                System.out.print(" ");
            }
            
            //in dau "\"
            System.out.print("\\");
            
            //in dau ky tu "."
            for(int j = 1; j <= (6-2*i); j++ )
            {
                System.out.print(".");
            }
            
            //in dau "/"
            System.out.print("/");
            
            //in khoang trang
            for(int j = 1 ; j < i;j++)
            {
                System.out.print(" ");
            }
            
            // in dau |
            System.out.print("|");
            
           System.out.println();
        }
    }
    public static void bottomhalf() {
        for(int i = 3 ; i >= 1; i--)
        {
            // in dau |
            System.out.print("|");
            
            //in khoang trang
            for(int j = 1 ; j < i;j++)
            {
                System.out.print(" ");
            }
            
            //in dau "\"
            System.out.print("/");
            
            //in dau ky tu "."
            for(int j = 1; j <= (6-2*i); j++ )
            {
                System.out.print(".");
            }
            
            //in dau "/"
            System.out.print("\\");
            
            //in khoang trang
            for(int j = 1 ; j < i;j++)
            {
                System.out.print(" ");
            }
            
            // in dau |
            System.out.print("|");
            
           System.out.println();
        }
    }
}
