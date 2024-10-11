package THUC_HANH_TREN_LOP.Buoi5;

import java.util.Random;
import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        //loi noi khoi dau
        System.out.println("Day la chuong trinh tung 2 xuc sac");
        System.out.println("Ban bam [P] hay [p] de choi, thoat ra thi bam [Q] hay [q].");

        //tao so ngau nhien tu 1 - 7
        Random r = new Random();

        //cho phep nguoi choi nhap ky tu
        Scanner chu = new Scanner(System.in);
        String bam = chu.next();

        //Khoi dong so dem va tong
        int cout = 1;
        int sum = 0;
        while(bam.equalsIgnoreCase("P"))
        {
            int xucsac1 = r.nextInt(7) + 1;
            int xucsac2 = r.nextInt(7) + 1;

            sum = xucsac1+xucsac2;
            System.out.println("Xuc sac 1 ra: "+ xucsac1 +" diem. Xuc sac 2 ra: "+ xucsac2 +" diem. Tong 2 xuc sac la: "+ sum);
            if(sum == 7)
            {
                break;
            }
            //Cho phep nguoi choi chon lai
            System.out.println("Ban bam [P] hay [p] de choi [Q] hay [q] de thoat chuong trinh");
            bam = chu.next();
            if(bam.equalsIgnoreCase("Q"))
            {
                break;
            }
            cout++;
        }
        System.out.println("So lan ban da tung la: "+ cout +" lan.");
    }
}
