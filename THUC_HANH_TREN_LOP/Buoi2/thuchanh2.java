package THUC_HANH_TREN_LOP.Buoi2;

public class thuchanh2 {
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
          System.out.println("Gia tri BMI ");
          System.out.println(bmi);

          // Khoi tao gia tri ban dau
          double height2 = 70;
          double weight2 = 195;
          double bmi2 = weight2/(height2*height2)*703;

          //hien thi ket qua 
          System.out.println("Gia tri BMI 2 :");
          System.out.println(bmi2);
          System.out.println();
          System.out.println("Gia tri BMI 2: " + bmi2);
     }
}