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
        System.out.println(); // cach xuong dong
        
        //ham sap xep insertionSort
        insertionSort(array);
        
        //in ra ket qua da sap xep 
        System.out.println("Array duoc sap xep : ");
        for(int i = 0 ; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }   
    }
    // Tao ham sap xep 
    public static void insertionSort(int []array) {
        //Khai bao bien tam
        int tmp;
        //Thuat toan sap xep insertionSort
        for(int i = 1 ; i < array.length; i++)
        {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1],that are greater than key
            //to one position ahead of their current position
            while(j >= 0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
}
