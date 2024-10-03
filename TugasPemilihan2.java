import java.util.Scanner;
/**
 * TugasPemilihan2
 */
public class TugasPemilihan2 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        String jenis;
        double diskon, hargaDiskon;
        int jumlah, harga = 20000;
        System.out.print("Masukkan jenis buku : ");
        jenis = sc16.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlah = sc16.nextInt();
        if (jenis.equalsIgnoreCase("kamus")) {
            if (jumlah > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
        } else if (jenis.equalsIgnoreCase("novel")) {
                   if (jumlah > 3) {
                       diskon = 0.09;
                    } else if (jumlah <= 3) {
                        diskon = 0.08;
                    } else {
                        diskon = 0.07;
                    }
        } else if (jumlah > 3) {
                   diskon = 0.05;
        } else {
            diskon = 0.0;
        }
        diskon = harga * diskon;
        hargaDiskon = harga - diskon;
        System.out.println("Diskon : " + diskon);
        System.out.println("Total harga : " + hargaDiskon);
    }
}