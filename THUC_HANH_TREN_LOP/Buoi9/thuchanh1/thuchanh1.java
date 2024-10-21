package THUC_HANH_TREN_LOP.Buoi9.thuchanh1;

import java.util.ArrayList;

public class thuchanh1 {
    public static void main(String[] args) {
        
        //Khởi tạo 1 danh sách mảng có tên ListNam
        ArrayList<String>ListName = new ArrayList<>();
        
        //Thêm tên vào danh sách 
        ListName.add("Hoa");
        ListName.add("Mai");
        ListName.add("Dung");
        ListName.add("Hoang");
        ListName.add("Hai");
        ListName.add("Vinh");
        ListName.add("Tu");
        ListName.add("Bao");
        ListName.add("Anh");

        //In ra danh sách ban đầu 
        System.out.println("1.ArrayList Name: " + ListName);
        
        //Chèn tên "Hùng" vào giữa "Dung" và "Hoàng"
        ListName.add(3,"Hùng");
        //chèn tên "Oanh" cuối dãy
        ListName.add(10,"Oanh");
        //In ra danh sách đã thêm
        System.out.println("2.ArrayList Name: "+ ListName);

        //Hiện thị giá trị tại vị trí 7
        System.out.println("Vi tri 7: "+ ListName.get(7));
        
        //Hiện thị chiều dài của 2.ArrayList
        System.out.println("Size ArrayList: "+ListName.size());
        
        //Xóa tên tại vị trí 3 và vị trí 6
        ListName.remove(3); //xóa vị trí 3
        ListName.remove(6); // xóa vị trí 6
        System.out.println("Da xoa vi tri 3 va 6 trong ArrayList: "+ ListName);
        
        //Thay thế tên vị trí số 2 thành "Toang;"
        ListName.set(2,"Toang"); // Thay thế vị trí số 2 thành "Toang"
        System.out.println("3.ArrayList: "+ListName);

        //Hiện thị chiều dài của dãy
        System.out.println("Size ArrayList: "+ ListName.size());
    } 
}
