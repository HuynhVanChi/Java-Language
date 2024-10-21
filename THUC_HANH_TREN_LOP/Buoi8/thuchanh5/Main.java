package THUC_HANH_TREN_LOP.Buoi8.thuchanh5;

public class Main{
    public static void main(String[] args) {
        Shape[] tinh = new Shape[3];
        
        tinh[0] = new Rectangle(18, 18);
        System.out.println(tinh[0].toString());
        System.out.println();//cách xuống dòng 
        
        tinh[1] = new Circle(12);
        System.out.println(tinh[1].toString());
        System.out.println(); // cách xuống dòng 
        
        tinh[2] = new Triangle(30, 30, 30);
        System.out.println(tinh[2].toString());
    }
}
