package THUC_HANH_TREN_LOP.Buoi3;

import java.util.Scanner;

//                                           Viết chương trình sản xuất lịch như sau
public class taolich {
    public static void main(String[] args) {
         
        //Khai bao Songay va BatDau la thu dau tien cua thang
        int Songay , BatDau ;
        
        //Khai bao phan tu nhap
        Scanner conso = new Scanner(System.in);
        
       
        System.out.print("Nhap thang co bao nhieu ngay (29 - 30 - 31):");
        //Cho phep nhap vao bien Songay
        Songay = conso.nextInt();

        System.out.print("Nhap thu dau tien cua thang : ");
        //Cho phep nhap vao bien BatDau
        BatDau = conso.nextInt();

        //Ham lich
        lich(Songay,BatDau);
    }
    
    public static void lich(int Songay , int BatDau) {
        
        
        boolean KiemTra = false ;
        int NgayBatDau = 0 , Ngay = 1;
        int SoNgayTrongTuan = 0;
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        System.out.println("+------+------+------+------+------+------+------+");
        
        for(int slot = 0 ; slot < 35; slot++) 
        {
            //System.out.print("|");
           if(SoNgayTrongTuan == 7) // Kiem tra SoNgayTrongTuan, du 7 ngay thi xuong dong
           {
                System.out.print("|");
                System.out.println();
                SoNgayTrongTuan = 1; //cho SoNgayTrongTuan ve lai ngay dau tien
           }
           else // Neu chua du bay ngay thi + len
           {
                SoNgayTrongTuan++;
           }

           if(NgayBatDau == BatDau) //Kiem tra khi nao bat dau in ngay
           {
                KiemTra = true;
           }
           else{NgayBatDau++;}

           if(Ngay - 1 == Songay) //Kiem tra du so ngay thi in khoang trong
           {
                KiemTra=false;
           }

           if(KiemTra)
           {
                if(Ngay < 10)
                {
                   System.out.print("|   "+Ngay+"  ");
                   Ngay++;
                }
                else
                {
                    System.out.print("|  "+Ngay+"  ");
                    Ngay++;
                }
           }
           else
           {
                System.out.print("|      ");
           }
        
        }
        System.out.print("|");
        System.out.println();
        System.out.println("+------+------+------+------+------+------+------+");
    }
}
