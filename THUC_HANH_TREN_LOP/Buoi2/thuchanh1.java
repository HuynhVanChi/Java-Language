package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh1 {
     public static void main(String[] args) {
         // Khoi bao bien
         double height;
         double weight;
         double bmi;

         //tinh toan GMI
                 //Gan du lieu
          height = 70;
          weight = 195;
          bmi = weight/(height*height)*703;

          //hien thi ket qua
          System.out.println("Gia tri BMI");
          System.out.println(bmi);
     }
}
