package THUC_HANH_TREN_LOP.Buoi10;

import java.util.Collections;
import java.util.LinkedList;

public class thuchanh2_LinkedListdulieu {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //Thêm dữ liệu vào list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        //Hiện List
        System.out.println("List ban dau: ");
        System.out.println(list);
        System.out.println();
        
        //xóa dữ liệu đầu dãy
        list.remove(0);
        System.out.println("List da bi xoa du lieu dau tien: ");
        System.out.println(list);
        System.out.println();

        //Thêm dữ liệu vào đầu dãy
        list.add(0,50);

        //Sắp xếp dữ liệu từ bé đến lớn
        Collections.sort(list);
        System.out.println("List da sap xep: ");
        System.out.println(list);
        System.out.println();

        //Tìm giá trị lớn nhất
        //Tìm giá trị nhỏ nhất
        int Max = 0;
        int Min = 0;
        for(int i = 0; i < list.size();i++)
        {
            if(list.get(i) > Max)
            {
                Max = list.get(i);
            }
            if(Min == 0)
            {
                Min = list.get(i);
            }
            if(list.get(i) < Min)
            {
                Min = list.get(i);
            }

        }
        System.out.println("So lon nhat la: " + Max + "\nSo nho nhat la: " + Min);

        //Thay đổi 2 số ở vị trí 1 và 3 cho nhau
        swap(list, 1 , 3);
        System.out.println(list);
    }
    public static void swap(LinkedList<Integer> list , int a ,int b) {
        int tmp = list.get(a);
        list.add(a,list.get(b));
        list.remove(a+1);
        list.add(b,tmp);
        list.remove(b+1);
    }
}

