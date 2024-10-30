package THUC_HANH_HOME.BAITAP5;

public class Hanoi_Tower {
    //Hàm doTowers
    public static void doTowers(int topN, char nguon , char trunggian , char dich)
    {
        // Trường hợp chỉ có một đĩa, di chuyển nó từ nguồn sang đích
        if(topN  == 1)
        {
            System.out.println("Di chuyen dia 1 tu "+ nguon + " sang " + dich);
            System.out.println();
            return;
        }
        else
        {   //Bước 1: Di chuyển n-1 đĩa từ nguồn sang trung gian, sử dụng đích làm đệm
            doTowers(topN - 1, nguon, dich, trunggian); // nguon --> trunggian
            
            // Bước 2: Di chuyển đĩa thứ n từ nguồn sang đích
            System.out.println("Di chuyen dia " + topN + " Tu: " + nguon + " Sang: " + dich);
            System.out.println();

            // Bước 3: Di chuyển n-1 đĩa từ trung gian sang đích, sử dụng nguồn làm đệm
            doTowers( topN - 1, trunggian, nguon , dich);//trunggian --> nguon
        }

    }

    //Hàm main
    public static void main(String[] args) {
        int soDia = 5; //Thay đổi số lượng đĩa tùy ý
        System.out.println("Gian phap cho " + soDia + " so dia: ");
        doTowers(soDia, 'A', 'B', 'C');

    }
}
