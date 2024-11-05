package THUC_HANH_HOME.BAITAP6;

public class Quick_Sort {
    
    //Hàm main
    public static void main(String args[])
    {
        //tạo mảng
        int[] array = {10 , 5 , 3 , 1 ,2 ,9 ,7, 8 ,4 ,6};
        
        //hiện mảng chưa sắp xếp
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

        //Hàm sắp xếp Quick Sort
        QuickSort(array , 0 , array.length - 1);

        System.out.println();//cách xuống dòng
        //hiện mảng đã sắp xếp
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        } 
    }

    //Hàm lấy phần tử cuối cùng làm trục
    //Đặt phần tử trục ở đúng vị trí của nó trong mảng đã sắp xếp
    //Đặt tất cả phần tử nhỏ hơn(nhỏ hơn trục) ở bên trái
    //Đặt tất cả phần tử lớn hơn(lớn hơn trục) ở bên phải
    public static int partition(int array[] , int low , int high)
    {
        int pivot = array[high];
        int i = (low - 1);
        for(int j = low; j < high; j++)
        {
            if(array[j] < pivot)
            {
                i++;

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i+1] = array[high];
        array[high] = temp;

        return i;
    }

    //Hàm QuickSort
    public static void QuickSort(int array[], int low , int high)
    {
        if(high <= low)
        {
            return;
        }

        int pivot = partition(array, low, high);
        QuickSort(array, low, pivot - 1);
        QuickSort(array, pivot + 1, high);
    } 

}
