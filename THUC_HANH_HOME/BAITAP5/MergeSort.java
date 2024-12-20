package THUC_HANH_HOME.BAITAP5;

public class MergeSort {
    public static void main(String[] args) {
        //Tạo mảng 
        int[] array = {8 , 2 , 5 , 3 , 4 , 7 , 6 , 1};

        //hàm sắp xếp 
        MergeSort(array);

        //Hàm in ra KQ
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    private static void MergeSort(int[] array) {
        int length = array.length;
        if(length <= 1)
        {
            return; 
        }

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;
        int j = 0;

        for(; i < length; i++)
        {
            if(i < middle)
            {
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }

        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray , rightArray , array);
    }
    
    private static void Merge(int[] leftArray , int[] rightArray, int[] array)
    {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0 , l = 0 , r = 0;

        while (l < leftSize && r < rightSize) {
            
            if(leftArray[l] < rightArray[r])
            {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}

