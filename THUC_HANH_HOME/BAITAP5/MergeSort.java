package THUC_HANH_HOME.BAITAP5;

public class MergeSort {
    public static void main(String[] args) {
        //Tạo mảng 
        int [] array = {8 , 2 , 5 , 3 , 4 , 7 , 6 , 1};

        //hàm sắp xếp 
        recMergeSort(array);

        //Hàm in ra KQ
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    private static void recMergeSort(int[] array , int lowerBound , int upperBound) {
        if(lowerBound == upperBound)
        {
            
        }
    }
}
