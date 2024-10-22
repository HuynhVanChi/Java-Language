package THUC_HANH_TREN_LOP.Buoi9.thuchanh3;

import java.util.ArrayList;

public class tinhtong {
    public static void main(String[] args) {
        //Khởi tạo ArrayList và tạo biến tổng
        ArrayList<Integer> chuoiso = new ArrayList<>();
        int sum = 0; //biến sum
        //Thêm số vào ArrayList của chuoiso
        chuoiso.add(13);
        chuoiso.add(47);
        chuoiso.add(15);
        chuoiso.add(9);
        chuoiso.add(5);
        chuoiso.add(2);
        chuoiso.add(89);
        //Dùng vòng lặp for tính tổng
        for(int i = 0 ; i < chuoiso.size() ; i++)
        {
            sum += chuoiso.get(i);
        }
        System.out.println("Tong = " + sum);
    }
}
