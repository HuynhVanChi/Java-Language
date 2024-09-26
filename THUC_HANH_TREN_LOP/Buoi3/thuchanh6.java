package THUC_HANH_TREN_LOP.Buoi3;
//                                  Viết chương trình tính cạnh huyền của tam giác vuông
public class thuchanh6 {
    public static void main(String[] args) {
        System.out.println("Canh huyen can tinh là: "+cachc(12.5,15.9));
    }
    
    public static double cachc(double a,double b) {
        return Math.sqrt(a*a+b*b);
    }
}
