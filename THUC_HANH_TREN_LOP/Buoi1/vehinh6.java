public class vehinh6 {
    
    public static void main(String[] args) {
       hinh1();
       hinh2();
    }
    public static void hinh1() {
        ve1();
        ve2();
        ve3();
    }
    public static void hinh2() {
        ve1();
        System.out.println("|    STOP    | ");
        ve2();
        ve1();
        ve3();
    }

    public static void ve1() {
        System.out.println("  __________  ");
        System.out.println(" /          \\ ");
        System.out.println("/            \\");
    }
    
    public static void ve2() {
        System.out.println("\\            /");
        System.out.println(" \\__________/");
    }
    
    public static void ve3() {
        System.out.println("+------------+");
    }
}
