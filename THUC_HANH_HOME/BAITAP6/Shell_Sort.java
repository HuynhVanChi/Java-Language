package THUC_HANH_HOME.BAITAP6;

public class Shell_Sort {
    //Hàm main
    public static void main(String[] args) {
        //Tạo mảng
        int[] array = {6, 7, 0, 2, 8, 1, 3, 9, 4, 5};

        //Hiện mảng chưa sắp xếp 
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }

        //Hàm sắp xếp Shell Sort
        Shellsort(array);
        
        System.out.println();//cách xuống dòng 
        
        //Hiện mảng đã sắp xếp
        for(int i = 0; i < array.length;i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    
    public static void Shellsort(int[] array)
    {
        int inner , outet;
        int valueToInsert;
        int interval = 1;

        while (interval <= array.length / 3) {
            interval = interval*3+1;
        }

        while(interval > 0)
        {
            for(outet = interval; outet < array.length; outet++)
            {
                valueToInsert = array[outet];
                inner = outet;
                while (inner > interval - 1 && array[inner - 1] >= valueToInsert) {
                    array[inner] = array[inner - interval];
                    inner -= interval;
                }
                array[inner] = valueToInsert;
            }
            interval = (interval - 1)/3;
        }
    }
}
