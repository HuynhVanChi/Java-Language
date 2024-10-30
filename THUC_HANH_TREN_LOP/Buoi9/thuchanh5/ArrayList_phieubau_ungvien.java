package THUC_HANH_TREN_LOP.Buoi9.thuchanh5;

//Thư viện
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_phieubau_ungvien {
    public static void main(String[] args) {
        
        //Tạo danh sách ứng viên
        ArrayList<String> ungvien = new ArrayList<>();
        
        //Tạo danh sách phiếu bầu
        ArrayList<String> phieubau = new ArrayList<>();
        
        //Tạo list demphieu
        int []demphieu = new int[4];
        
        //Tạo Scanner để đọc file phieu.txt
        try{
            Scanner input = new Scanner(new File("phieu.txt"));

            while(input.hasNext()){ //đọc đến ký tự cuối cùng
                
                String name = input.next();
                
                //Lưu từng dữ liệu vào list phiếu bầu
                phieubau.add(name);
                
                //Loại bỏ các thành phần lặp lại 
                if(!ungvien.contains(name)) // false khi nó không xuất hiện lần 2 VD: B != B 
                {
                    ungvien.add(name);
                }
            }
            System.out.println("List = " + ungvien);
            
            //Sắp xếp từ A - z của list ứng viên 
            Collections.sort(ungvien);
            System.out.println("List da sap xep: " + ungvien);
            
            //xem phiếu bầu có bao nhiêu phiếu bầu cho ứng viên
            for(int i = 0 ; i < phieubau.size(); i++)
            {
                if(phieubau.get(i).equals("A"))
                {
                    demphieu[0]++;
                }
                else if(phieubau.get(i).equals("B"))
                {
                    demphieu[1]++;
                }
                else if(phieubau.get(i).equals("C"))
                {
                    demphieu[2]++;
                }
                else if(phieubau.get(i).equals("D"))
                {
                    demphieu[3]++;
                }
            }              
            //Tìm người chiến thắng
            String tmp = " ";
            int Max = 0;
            for(int i = 0 ; i < ungvien.size(); i++)
            {
                if(demphieu[i] > Max)
                {
                    Max = demphieu[i];
                    if(i == 0)
                    {
                        tmp = "A";
                    }
                    else if(i == 1)
                    {
                        tmp = "B";
                    }
                    else if(i == 2)
                    {
                        tmp = "C";
                    }
                    else if(i == 3)
                    {
                        tmp = "D";
                    }
                }
                else if(demphieu[i] == Max)
                {
                    tmp = "Hoà";
                }
            }
            System.out.println();//cách dòng
            
            //Hiện thị kết quả
            System.out.println("Ung vien      So phieu      Ty le bau(%)");
            for(int i = 0; i < ungvien.size(); i++)
            {
                double tylebau = ((phieubau.size()/ungvien.size())/phieubau.size())*100;
                System.out.println("   "+ungvien.get(i)+"            "+demphieu[i]+"            "+tylebau);
            }
            
            //hiện thị kết quả người thắng 
            System.out.println("ket qua phieu bau la: "+tmp);
            
            // Đóng Scanner sau khi đọc file
            input.close();
        
        }catch(FileNotFoundException e){
            System.out.println("Khong the doc file");
        }
    }
}
