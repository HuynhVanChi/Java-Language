package THUC_HANH_TREN_LOP.Buoi8.thuchanh5;
// interface định nghĩa chu vi và diện tích 
public interface Shape {
    public double getArea(); // diện tích
    public double getPerimeter(); // chu vi
} 
//implements: một lớp thực thi (triển khai) các phương thức được định nghĩa trong interface.
class Rectangle implements Shape{ // rectangle phải triển khai dịnh nghĩa interface
    double width;
    double height;
    public Rectangle(double w , double h)
    {
        w = width;
        h = height;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPerimeter()
    {
        return 2*(width + height);
    }
}
//Lớp hình tròn
class Circle implements Shape{
    
    int radius; // bán kính
    public Circle(int r)
    {
        r = radius;
    }
    public double getArea()
    {
        return Math.PI*radius; 
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;     
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
        return (a+b+c)/2 ;
    }
    //double s = getPerimeter();
    
    public double getArea(){
        return Math.sqrt(getPerimeter()*(getPerimeter()-a)*(getPerimeter()-b)*(getPerimeter()-c));
    }
    public String toString()
    {
        
    }
}
