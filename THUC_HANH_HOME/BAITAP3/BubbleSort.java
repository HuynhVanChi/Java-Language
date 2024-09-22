package THUC_HANH_HOME.BAITAP3;

public class BubbleSort {
    public static void main(String[] args) {
        
        //Khai bao mang array
        int array[] = {9,7,4,3,5,8,10,2,6,1};
        
        //In ra mang chua duoc sap xep 
        System.out.println("Array Chua duoc sap xep : ");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // cach xuong dong
        
        //ham sap xep
        bubbleSort(array);
        
        // In ra ket qua da duoc sap xep
        System.out.println("Array duoc sap xep : ");
        for(int i = 0 ; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
    //Tao ham sap xep bubbleSort
    public static void bubbleSort(int []array) {
        
        // Khai bao 1 bien tam
        int tmp;
        
        //thuat toan sap xep cua bubbleSort
        for(int i = 0 ; i < array.length - 1 ; i++) // i < 9
        {
            for(int j = 0 ; j < array.length - i - 1 ;j++) // j < (10 - i - 1) => phần tử cuối cùng chưa sắp xếp 
                                                                                /* Ví dụ, nếu bạn có một mảng với n phần tử, thì chỉ số của phần tử cuối cùng là n-1. 
                                                                                Khi bạn duyệt ngược từ cuối về đầu, chỉ số của phần tử hiện tại có thể được biểu diễn là n-i-1, 
                                                                                trong đó i là số bước bạn đã duyệt qua từ cuối mảng.*/
            {
                if(array[j] > array[j+1])
                {
                    tmp = array[j]; 
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
