package THUC_HANH_TREN_LOP.Buoi7.thuchanh2;

public class Point2 {
    int x;
    int y;
    //Hàm point khởi tạo ban đầu "Có Giá Trị"
    public Point2(int dx , int dy)
    {
        x = dx;
        y = dy;
    }
    //hàm tính khoang cách 
    public double khoangcach()
    {
        return Math.sqrt(x*x + y*y);
    }
    //lấy giá trị
    public int getX()
    {   
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setLocation(int dx , int dy)
    {
        x = dx;
        y = dy;
    }
    // Hàm toString phương thức cá thể trả về một biểu diễn Chuỗi của đối tượng.
    public String toString()
    {
        return "("+ x +" , "+ y +")";
    }
    //Hàm chuyển dịch 
    public void dich (int dx , int dy)
    {
        this.x = dx;
        this.y = dy;
    }
    //Hàm in 
    public void print()
    {
        System.out.println("Giai tri x: "+ x + ". y: "+ y);
    }
}
