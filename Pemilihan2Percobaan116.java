import java.util.Scanner;
/**
 * Pemilihan2Percobaan116
 */
public class Pemilihan2Percobaan116 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan Tahun : ");
        tahun = sc16.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0){
                if ((tahun % 400 ) == 0) {
                    System.out.println("Tahun Kabisat");
                } else 
                    System.out.println("Bukan Tahun Kabisat");
            } else
                System.out.println("Tahun Kabisat");
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}