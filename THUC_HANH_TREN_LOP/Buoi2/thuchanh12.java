package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh12 {
    public static void main(String[] args) {
        line();
        bottomhalf();
        tophalt();
        line();
        tophalt();
        bottomhalf();
        line();
    }

    //Hàm in ra +---------+
    public static void line()
    {
        System.out.print("+");

        //in ra "+" 9 lần
        for(int i = 1; i <= 9;i++)
        {
            System.out.print("-");
        }

        System.out.println("+"); // in xong xuống dòng
    }

    public static void tophalt()
    {
        int so = 5;
        //Dòng
        for(int i = 1; i <= 4; i++)
        {
            if(i >= 2)
            {
                so++;
            }

            System.out.print("|");

            //In ra khoảng trắng bên trái
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //In ra ký hiệu "\"
            for(int j = 1; j <= (so-2*i);j++)
            {
                System.out.print("\\");
            }

            System.out.print("*");

            //In ra ký hiệu "/"
            for(int j = 1; j <= (so-2*i);j++)
            {
                System.out.print("/");
            }

            //In ra khoảng trắng
            for(int j = 1; j <= i;j++)
            {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }

    public static void bottomhalf()
    {
        int so = 9;
        //Dòng
        for(int i = 4; i >= 1; i--)
        {
            if(i >= 1)
            {
                so--;
            }
            
            System.out.print("|");

            //In ra khoảng trắng bên trái
            for(int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //In ra ký hiệu "\"
            for(int j = 1; j <= (so-2*i);j++)
            {
                System.out.print("/");
            }

            System.out.print("*");

            //In ra ký hiệu "/"
            for(int j = 1; j <= (so-2*i);j++)
            {
                System.out.print("\\");
            }

            //In ra khoảng trắng
            for(int j = 1; j <= i;j++)
            {
                System.out.print(" ");
            }

            System.out.println("|");
        }
    }
}
