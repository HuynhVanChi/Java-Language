package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh8 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("+---------+");
        for(i = 1 ; i <= 5;i++)
        {
            //in khoang trang
            System.out.print("|");
            for(j=1 ;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            // in ky tu *
            for(j = 1;j <= (11-2*i);j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=(i - 1);j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            // sau khoi ket thuc 1 hang xuong hang
            System.out.println();
        }
        System.out.println("+---------+");
        for(i = 1 ; i <= 5;i++)
        {
            //in khoang trang
            System.out.print("|");
            for(j=1 ;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            // in ky tu *
            for(j = 1;j <= (11-2*i);j++)
            {
                System.out.print("*");
            }
            for(j=1;j<=(i - 1);j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
            // sau khoi ket thuc 1 hang xuong hang
            System.out.println();
        }
        System.out.println("+---------+");
    }
}
