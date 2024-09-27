package THUC_HANH_TREN_LOP.Buoi3;
//                                           Viết chương trình sản xuất lịch như sau
public class taolich {
    public static void main(String[] args) {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        lich();
    }
    public static void ve() {
        System.out.println("+------+------+------+------+------+------+------+");
    }
    public static void lich() {
        int i , j;
        ve();
        for(int line = 1 ; line <= 5; line++)
        {
            System.out.print("|");
            for(i = 1 ; i <= 7;i++)
            {
                if(line == 1)
                {
                    for( j = 1; j <= 6 ; j++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                else
                {
                    
                }
            }
            System.out.println();

        }
        ve();
    }
}
