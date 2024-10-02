import java.util.Scanner;
/**
 * Pemilihan2Percobaan216
 */
public class Pemilihan2Percobaan216 {

    public static void main(String[] args) {
        Scanner sc16 = new Scanner(System.in);
        int pilihan_menu, harga;
        String member;
        double diskon, total_bayar;
        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih =  ");
        pilihan_menu = sc16.nextInt();
        sc16.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc16.nextLine();
        System.out.println("---------------------------------------");
        if (member.equalsIgnoreCase("y")) { //Menggunakan equalsIgnoreCase untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar Diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Bundlin = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar setelah diskon
            total_bayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);
        }
        else if (member.equalsIgnoreCase("n")) { // Menggunakan equalsIgnoreCase untuk membandingkan String
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga Paket Bundling = " + harga);

            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }
            // Menghitung total bayar
            System.out.println("Total bayar = " + harga);
        } else {
            System.out.println("Member tidak valid");
        }    
        System.out.println("------------------------------------------ ");
        }
    }