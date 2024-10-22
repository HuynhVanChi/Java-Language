package THUC_HANH_TREN_LOP.Buoi9.thuchanh4;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");

        //hiện thị trước khi sắp xếp
        System.out.println("Danh sach chua sap xep: ");
        for(int i = 0 ; i < words.size() ; i++)
        {
            System.out.print(words.get(i) + " ");
        }
        System.out.println();
        //lệnh sắp xếp Collections.Sort
        Collections.sort(words);

        //hiện thị sau khi sắp xếp
        System.out.println("Danh sach chua sap xep: ");
        for(int i = 0 ; i < words.size() ; i++)
        {
            System.out.print(words.get(i) + " ");
        }
    }
}
