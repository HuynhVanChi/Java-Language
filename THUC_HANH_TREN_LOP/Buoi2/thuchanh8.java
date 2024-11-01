package THUC_HANH_TREN_LOP.Buoi2;
                                    //VẼ HÌNH = FOR CỦA FOR
public class thuchanh8 {
    public static void main(String[] args) {
        // I LÀ DÒNG , J LÀ CHẠY
        int i,j;

        //IN RA
        System.out.println("+---------+");
        
        for(i = 1 ; i <= 5;i++)//CHẠY DÒNG
        {
            //IN RA
            System.out.print("|");
            
            //IN RA KHOẢNG TRẮNG
            for(j=1 ;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            
            //IN RA KÝ TỰ *
            for(j = 1;j <= (11-2*i);j++)
            {
                System.out.print("*");
            }
            
            //IN RA KHOẢNG TRẮNG 
            for(j=1;j<=(i - 1);j++)
            {
                System.out.print(" ");
            }

            System.out.print("|");
            
            // sau khi ket thuc 1 hang xuong hang
            System.out.println();
        }
        System.out.println("+---------+");
        //===============================================================================================
        for(i = 5 ; i >= 1;i--)//CHẠY DÒNG
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
            //IN RA KHOẢNG TRẮNG 
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
