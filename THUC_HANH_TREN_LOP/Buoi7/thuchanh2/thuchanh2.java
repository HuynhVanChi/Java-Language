package THUC_HANH_TREN_LOP.Buoi7.thuchanh2;

public class thuchanh2 {
    public static void main(String[] args) {
        Point2 p = new Point2(5, 6);
        //hiện thị kết quả
        System.out.println("Truoc khi dich chuyen:");
        p.print();
        //dịch chuyển thay thế thành số mới
        p.dich(1,5 );
        //hiện thị kết quả
        System.out.println("Sau khi dich chuyen:");
        p.print();
    }
}

