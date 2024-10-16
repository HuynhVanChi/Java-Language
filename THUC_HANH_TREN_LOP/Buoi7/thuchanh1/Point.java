package THUC_HANH_TREN_LOP.Buoi7.thuchanh1;
public class Point{
        int x;
        int y;
    
        public double khangcach() {
            return Math.sqrt(x*x + y*y);
        }
        public void dich(int dx, int dy)
        {
            x += dx;
            y += dy;
        }
    }
