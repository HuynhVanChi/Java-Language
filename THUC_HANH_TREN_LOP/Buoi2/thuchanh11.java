package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh11 {
    public static void main(String[] args) {
        
        //Hàm line
        line();
        
        //Hàm tophalt
        tophalt();
        tophalt();
        
        //Hàm line
        line();

        //bottomhalt
        bottomhalf();
        bottomhalf();

        //hàm line
        line();

    }

    //Hàm in ra "+------+"
    public static void line()
    {
        System.out.print("+");
        
        //In ra "-" 6 lần
        for(int i = 1; i <= 6; i++ )
        {
            System.out.print("-");
        }

        System.out.println("+");
    }

    public static void tophalt()
    {
        for(int i = 3; i >= 1; i--)
        {
            System.out.print("|");
            
            //in ra khoảng trắng trái
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            
            //in ra ký hiệu "^"
            System.out.print("^");
            
            //in khoảng trắng giữa
            for(int j = 1; j <= (6-2*i); j++)
            {
                System.out.print(" ");
            }

            //In ra ký hiệu "^"
            System.out.print("^");

            //in ra khoảng trắng phải
            for(int j = 1; j < i;j++)
            {
                System.out.print(" ");
            }
            
            //in ra dấu "|"
            System.out.println("|");
        }
    }

    public static void bottomhalf() 
    {
        for(int i = 3; i >= 1; i--)
        {
            System.out.print("|");
            
            //in ra khoảng trắng trái
            for(int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            
            //in ra ký hiệu "V"
            System.out.print("V");
            
            //in khoảng trắng giữa
            for(int j = 1; j <= (6-2*i); j++)
            {
                System.out.print(" ");
            }

            //In ra ký hiệu "V"
            System.out.print("V");

            //in ra khoảng trắng phải
            for(int j = 1; j < i;j++)
            {
                System.out.print(" ");
            }
            
            //in ra dấu "|"
            System.out.println("|");
        }
    }
}
