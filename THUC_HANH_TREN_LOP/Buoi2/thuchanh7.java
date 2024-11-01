package THUC_HANH_TREN_LOP.Buoi2;
                                    //VẼ HÌNH BẰNG FOR CỦA FOR
public class thuchanh7 {
    public static void main(String[] args) {
        //Đặt i là dòng ; j là biến chạy
        int i,j;
        for(i = 1 ; i <= 5;i++) //CHẠY DÒNG
        {
            //in khoang trang
            for(j=1 ;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            // in ky tu *
            for(j = 1;j <= (11-2*i);j++)
            {
                System.out.print("*");
            }
            // sau khi kết thúc 1 hàng xuống hàng
            System.out.println();
        }
        System.out.println();//CÁCH XUỐNG DÒNG
        //=================================================================================
        for(i = 5 ; i>=1;i--) // CHẠY DÒNG
        {
            // in khaong trang
            for(j=1 ; j <=(i-1);j++)
            {
                System.out.print(" ");
            }
            //in ky tu *
            for(j=1;j <= (11 -2 * i);j++)
            {
                System.out.print("*");
            }
            // sau khi kết thúc 1 hàng xuống hàng
            System.out.println();
        }
    }
}
