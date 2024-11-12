package THUC_HANH_TREN_LOP.Buoi2;

public class thuchang14 {
    public static void main(String[] args) {
        bacthang();
        line();
    }

    public static void line() {
        for(int i = 1; i <= 32; i++)
        {
            System.out.print("*");
        }
    }

    public static void bacthang() {
        for(int i = 1; i <= 5;i++ )
        {
            vehinh1();

            //In khoảng trắng 
            for(int j = 1; j <= 31;j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }

    public static void vehinh1()
    {
        for(int i = 1 ; i <= 3;i++)
        {
            if(i == 1)
            {
                System.out.print("  0  ");
                for(int j = 1; j <= 6;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            if(i == 2)
            {
                System.out.print(" ");
                System.out.print("/");
                System.out.print("|");
                System.out.print("\\ ");
                System.out.println();
            }
            if(i == 3)
            {
                System.out.print(" ");
                System.out.print("/");
                System.out.print(" ");
                System.out.print("\\ ");
            }
        }
    }
}
