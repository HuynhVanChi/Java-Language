package THUC_HANH_TREN_LOP.Buoi7.thuchanh1;

public class thuchanh1 {
    public static void main(String[] args) {
        Point p = new Point();
        p.x=10;
        p.y=5;

        System.out.println("Giai tri truoc khi dich chuyen x: "+ p.x + ". y: "+ p.y);
        p.dich(2,5);
        System.out.println("Gia tri sau khi dich chuyen x: "+p.x + ". y: "+p.y);
    }
}
