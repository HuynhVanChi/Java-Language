package THUC_HANH_HOME.BAITAP4;

class Node 
{   // Biến thành viên
    int Data; // dữ liệu bên trong nút 
    Node next; // con trỏ đến nút tiếp theo 
    
    // Constructor để khởi tạo nút với dữ liệu 
    public Node(int Data)
    {   // 'this.data' là biến thành viên, 'Data' là tham số của constructor
        this.Data = Data; //this.data gán giá trị của tham số data cho biến thành viên data của đối tượng Node hiện tại
        this.next = null;
    }
}

public class SinglyLinked 
{
    Node first; // Đầu của danh sách liên kết đơn 
    
    // Constructor để khởi tạo danh sách rỗng
    public SinglyLinked()
    {
        this.first = null;
    }
    
    //insert at start of list
    public void insertFirst(int Data)
    {   // newNode = nút mới 
        Node newNode = new Node(Data) ; // làm nút mới 
        newNode.next = first; // nút mới trỏ tới first
        first = newNode; // first trỏ tới nút mới 
    }
    
    // delete first item
    public Node deleteFirst()
    {   // (Giả định đầu không trống)
        Node temp = first; // Lưu tham chiếu tới link
        first = first.next; // xóa nó : first --> old next
        return temp ; // trả lại nút xóa 
    }
    
    // Hàm in các dữ liệu bên trong Nút 
    public void displayList()
    {
        System.out.print("List (first --> last): ");
        Node current = first; // 
        while(current != null)
        {
            System.out.print(current.Data + " -> ");
            current = current.next; // gán current tiếp theo 
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        SinglyLinked list = new SinglyLinked(); //khởi tạo một danh sách liên kết đơn mới và gán nó cho biến list
        
        list.insertFirst(10); // hàm chèn vào
        list.insertFirst(20); // hàm chèn vào
        list.insertFirst(30); // hàm chèn vào 
        list.insertFirst(40); // hàm chèn vào 
        list.insertFirst(50); // hàm chèn vào 
        list.insertFirst(60); // hàm chèn vào 

        System.out.println("Danh sách sau khi chèn phần tử:");
        list.displayList(); // hàm in ra

        list.deleteFirst(); // hàm xóa 
        System.out.println("Danh sách sau khi xóa phần tử đầu tiên:");
        list.displayList(); // hàm in ra 
    }
}
