package THUC_HANH_HOME.BAITAP3;

public class InsertionSort {
    public static void main(String[] args) {
        //Khai bao mang
        int array[] =  {9,7,4,3,5,8,10,2,6,1};
        
        //In ra mang chua duoc sap xep 
        System.out.println("Array Chua duoc sap xep : ");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // cách xuống dòng
        
        //ham sap xep insertionSort
        insertionSort(array);
        
        //in ra ket qua da sap xep 
        System.out.println("Array duoc sap xep : ");
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }   
    }
    // Tạo hàm sắp xếp 
    public static void insertionSort(int []array) {
        //Khai báo biến tạm
        int tmp;
        //Thuật toán sắp xếp insertionSort
        for(int i = 1 ; i < array.length; i++)
        {
            tmp = array[i];
            int j = i - 1; 

            // Move elements of array[0..i-1],that are greater than key
            //to one position ahead of their current position
            while(j >= 0 && array[j] > tmp)
            {
                array[j + 1] = array[j]; // hoán đổi 
                j--; 
            }
            array[j + 1] = tmp;
        }
    }
}
