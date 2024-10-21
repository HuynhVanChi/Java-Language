package THUC_HANH_TREN_LOP.Buoi8.thuchanh5;
// interface định nghĩa chu vi và diện tích 
public interface Shape {
    public double getArea(); // diện tích
    public double getPerimeter(); // chu vi
} 
//implements: một lớp thực thi (triển khai) các phương thức được định nghĩa trong interface.
class Rectangle implements Shape{ // rectangle phải triển khai dịnh nghĩa interface
    //Biến thành viên
    int width; 
    int height;
    public Rectangle(int width , int height)
    {
        //this.width là biến thành viền , "width" biếlà tham số của constructor
        this.width = width; 
        this.height = height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width + height);
    }
    //Hiện thị kết quả 
    public String toString()
    {
        String Kq = "Hinh vuong: "+"\n"+"+Chu vi: "+ getPerimeter() + "\n" + "+Dien tich: "+ getArea();
        return Kq ; 
    }
}
//Lớp hình tròn
class Circle implements Shape{
    
    int radius; // bán kính
    public Circle(int radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return Math.PI*radius; 
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;     
    }
    //Hiện thị kết quả 
    public String toString()
    {
        String Kq2 = "Hinh tron: "+"\n"+"+Chu vi: "+ getPerimeter() + "\n" + "+Dien tich: "+ getArea();
        return Kq2 ; 
    }
}
class Triangle implements Shape{
    double a;
    double b;
    double c;
    
    public Triangle(double a , double b , double c )
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getPerimeter()
    {
        return (a+b+c)/2;
    }
    public double getArea(){
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    //Hiện thị kết quả 
    public String toString()
    {
        String Kq3 = "Tam giac: "+"\n"+"+Chu vi: "+ getPerimeter() + "\n" + "+Dien tich: "+ getArea();
        return Kq3 ; 
    }
}
