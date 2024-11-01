package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh5 {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 10 ; i++)
        {
            System.out.println("+--------+"); // NÓ IN RA 10 LẦN
        }
        
        System.out.println();//XUỐNG DÒNG
        
        for(int i = 1; i <= 10 ; i++)
        {
            System.out.println("**********"); //IN RA 10 LẦN
        }
        
        System.out.println();//XUỐNG DÒNG
        
        for(int i = 1; i <=6 ;i++)
        {
            //CHẠY VÒNG LẶP NÀY 6 LẦN  
            for(int j = 1 ; j <= 3; j++)
            {
                System.out.println(j + " "); //NÓ SẼ IN RA 1,2,3
            }
        }
    }
}
