package THUC_HANH_HOME.BAITAP2;

/*Question? 
Modify the Binary search algorithm for a descending array */

import java.util.Scanner;

public class BAI1 {
    public static int find(int []nElems , long searchKey)
    {
        int lowerBound = 0; // lower : trái 
        int upperBound = nElems.length - 1; // upper : phải 
        int curIn;
        while(true)
        {
            curIn = (lowerBound + upperBound) / 2;
            
            if(nElems[curIn] == searchKey)
            {
                return curIn;
            }
            else if (lowerBound > upperBound)
            {
                return -1;
            }
            else
            {
                if(nElems[curIn] < searchKey)
                {
                    upperBound = curIn - 1;
                }
                else
                {
                    lowerBound = curIn + 1;
                }
            }
        }
    }
    public static void main(String[] argn)
    {
        // Khởi tạo 1 đối tuongwh scanner
        Scanner sc = new Scanner(System.in);
        //cho phép người dùng nhập
        System.out.println("Moi nhap So tim kim :");
        int searchKey = sc.nextInt();
        // tạo mảng
        int []nElems = {10,9,8,7,6,5,4,3,2,1};
        int result = find(nElems,searchKey);
        if (result != -1)
        {
            System.out.println("Phan tu : " + searchKey + " duoc tim thay o index : " + result);
        }
        else
        {
            System.out.println("Phan tu : " + searchKey + " Khong tim thay trong mang");
        }
    }
}
