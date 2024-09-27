package THUC_HANH_TREN_LOP.Buoi3;
//                                           Viết chương trình sản xuất lịch như sau
public class thuchanh11 {
    public static void main(String[] args) {
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
        System.out.println("|      |      |   1  |   2  |   3  |   4  |   5  |");
        System.out.println("|   6  |   7  |   8  |   9  |  10  |  11  |  12  |");
        System.out.println("|  13  |  14  |  15  |  16  |  17  |  18  |  19  |");
        System.out.println("|  20  |  21  |  22  |  23  |  24  |  25  |  26  |");
        System.out.println("|  27  |  28  |  29  |  30  |  31  |      |      |");
        System.out.println("+------+------+------+------+------+------+------+");
    }
    public static void ve() {
        System.out.println("+------+------+------+------+------+------+------+");
    }
    public static void lich() {
        for(int line = 1 ; line <= 5; line++)
        {
            System.out.print("|");

            for(int i = 1; i <= 6 ; i++)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
