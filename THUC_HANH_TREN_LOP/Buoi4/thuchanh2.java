package THUC_HANH_TREN_LOP.Buoi4;

import java.util.Scanner;

public class thuchanh2 {
    public static void main(String[] args) {
        Scanner conso = new Scanner(System.in);

        System.out.print("Nhap diem so vao:");
        double diemso = conso.nextInt();

        String xeploai = "A" ;
        
        //Neu khong them else if 
        if(diemso >= 90)
        {
            xeploai = "A" ;
        }
        if(diemso >= 80)
        {
            xeploai = "B";
        }
        if(diemso >= 70)
        {
            xeploai = "C";
        }
        if(diemso >= 60)
        {
            xeploai = "D";
        }
        
        {
            xeploai = "F";
        }
        System.out.println("Xep loai :" + xeploai);

        //Chinh sua

        if(diemso >= 90)
        {
            xeploai = "A" ;
        }
        else if(diemso >= 80)
        {
            xeploai = "B";
        }
        else if(diemso >= 70)
        {
            xeploai = "C";
        }
        else if(diemso >= 60)
        {
            xeploai = "D";
        }
        else if(diemso < 60)
        {
            xeploai = "F";
        }
        System.out.print("Xep loai :" + xeploai);
    }
}
