package THUC_HANH_TREN_LOP.Buoi4;

public class thuchanh11 {
    
    public static void taotamgiac(int[][] tamgiac) {
        for(int i = 0 ; i < tamgiac.length; i++) // i < 11
        {
            tamgiac[i] = new int[i + 1]; // thiết lập giá trị mảng của hàng i 
            /*Hàng 0 có 1 phần tử (0 + 1 = 1)
            Hàng 1 có 2 phần tử (1 + 1 = 2)
            Hàng 2 có 3 phần tử (2 + 1 = 3)*/
            tamgiac[i][0] = 1;// giá trị đầu của mỗi hàng 
            tamgiac[i][i] = 1;// giá trị cuối của mỗi hàng
            
            //Tạo giá trị tại hàng i dựa vào giá trị i - 1
            for(int j = 1 ; j < i ; j++)
            {
                tamgiac[i][j] = tamgiac[i-1][j-1] + tamgiac[i-1][j];
            }
        }
    }
    //Hàm in ra
    public static void inra(int[][] tamgiac) {
        
        for(int i = 0 ; i < tamgiac.length ;i++ ) // i < 11
        {
            //in ra khoang trang 
            if (tamgiac[i][0] == 1) // mỗi hàng đầu có số 1 sẽ cách vô trong
            {
                 for(int u = 11 ; u >= tamgiac[i].length;u--) // tamgiac[i].length là size của từng dòng i
                {
                    System.out.printf("%2s","");
                }
            }
            //in lần lượt ra giá trị tại hàng i
            for(int j = 0 ; j < tamgiac[i].length;j++) 
            {
                System.out.printf("%4d",tamgiac[i][j]);
            }
            //kết thúc 1 dòng xuống hàng 
            System.out.println();
        }
    }
    // hàm chính 
    public static void main(String[] args) {
        int tamgiac[][] = new int [11][]; // 11 là 11 dòng của tam giác
        taotamgiac(tamgiac);
        inra(tamgiac);
    }
}
