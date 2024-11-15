
import java.util.Iterator;
import java.util.LinkedList;

public class thuchanh1_LinkedListchuoi {
    
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        
        //Thêm chuỗi vào List
        list.add("Hung");
        list.add("Vuong");
        list.add("University");
        list.add("of");
        list.add("Ho");
        list.add("Chi");
        list.add("Minh");
        list.add("City");

        System.out.println("List ban dau: ");
        System.out.println(list);
        System.out.println();

        //them phan tu "hello" vao dau
        list.add(0,"Hello");//thêm phần tử đầu List
        System.out.println("List duoc cap nhat: ");
        System.out.println(list);
        System.out.println();

        //xoa chieu dai la so chan
        RemoveEvenLength(list);
        System.out.println("List da xoa chieu dai chan: ");
        System.out.println(list);
        System.out.println();

        //Tim chuoi co chieu dai lon nhat
        Iterator<String> j = list.iterator();
        int Max = 0;
        while (j.hasNext()) {
            String chieudai = j.next();
            //Kiểm tra chiều dài lớn hơn Max thì cho gán chiều dài đó cho Max
            if(chieudai.length() > Max)
            {
                Max = chieudai.length();
            }
        }
        System.out.println("chieu lon nhat la: ");
        System.out.println(Max);
        System.out.println();//cách xuống dòng

        //Hiện thị từng chuỗi và giá trị chiều dài tương ứng của nó
        String size; 
        for(int i = 0; i < list.size(); i++)
        {   
            size = list.get(i);
            System.out.println(list.get(i) + " " + size.length() );
        }
    }

    //tao ham RemoveEvenLength
    public static void RemoveEvenLength(LinkedList<String>list) {
        //Iterator là 1 đối tượng cho phép truy xuất hiệu quả các phần tử của danh sách
        Iterator<String> i = list.iterator();
        while(i.hasNext())
        {
            String element = i.next();
            if(element.length() % 2 == 0)
            {
                i.remove();
            }
        }
    }


}
