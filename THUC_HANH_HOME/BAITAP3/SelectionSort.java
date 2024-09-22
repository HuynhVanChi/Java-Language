package THUC_HANH_HOME.BAITAP3;

public class SelectionSort {
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
        selectionSort(array);
        
        //in ra mang da sap xep
        System.out.println("Array duoc sap xep : ");
        for(int i = 0 ; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
    }
    //Tao ham sap xep Selection Sort
    public static void selectionSort(int []array) {
        int tmp; // bien tam
        //Thuat toan sap sep Selection Sort
        for(int i = 0 ; i < array.length - 1;i++)
        {
            int min = i;
            for(int j = i + 1 ; j < array.length; j++)
            {
                if(array[min] > array[j])
                {
                    min = j;
                }
            }
            tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
    }
}
