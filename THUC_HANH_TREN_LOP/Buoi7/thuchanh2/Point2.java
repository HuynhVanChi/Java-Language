package THUC_HANH_TREN_LOP.Buoi7.thuchanh2;

public class Point2 {
    int x;
    int y;
    
    //Hàm point khởi tạo ban đầu "Có Giá Trị"
    public Point2(int dx , int dy)
    {
        this.x = dx;
        this.y = dy;
    }
    
    //hàm tính khoang cách 
    public double khoangcach()
    {
        return Math.sqrt( Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
    
    //lấy giá trị
    public int getX()
    {   
        return this.x;
    }
    public int getY()
    {
        return this.y;
    }
    public void setLocation(int dx , int dy)
    {
        this.x = dx;
        this.y = dy;
    }
    
    // Hàm toString phương thức cá thể trả về một biểu diễn Chuỗi của đối tượng.
    public String toString()
    {
        return ("x: " + this.x + " y: "+ this.y + " Khoang cach cua X va Y: " + khoangcach());
    }
    
    //Hàm chuyển dịch 
    public void dich(int dx , int dy)
    {
        this.x = dx;
        this.y = dy;
    }
    
}
