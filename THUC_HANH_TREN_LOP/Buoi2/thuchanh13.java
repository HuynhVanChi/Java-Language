package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh13 {
    public static void main(String[] args) {
        line();
        tophalt();
        System.out.println("     ||");
        bottomhalt();
        line();
    }

    public static void line() {
        System.out.print("|");
        for(int i = 1; i <= 10;i++)
        {
            System.out.print("'");
        }
        System.out.println("|");
    }

    public static void tophalt() {
        for(int i = 1; i <= 4; i++)
        {
            //Khoảng trắng bên trái
            for(int j = 1; j <= i;j++)
            {
                System.out.print(" ");
            }

            System.out.print("\\");

            //IN ký hiệu
            for(int j = 1; j <= (10 - 2*i); j++)
            {
                System.out.print(":");
            }

            System.out.println("/");
        }
    }

    public static void bottomhalt()
    {
        for(int i = 4; i >= 1; i--)
        {
            //Khoảng trắng bên trái
            for(int j = 1; j <= i;j++)
            {
                System.out.print(" ");
            }

            System.out.print("/");

            //IN ký hiệu
            for(int j = 1; j <= (10 - 2*i); j++)
            {
                System.out.print(":");
            }

            System.out.println("\\");
        }
    }
}
