package Minggu9.Code;
import java.util.Scanner;

public class PengelolanBioskop10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket, hargaTiket = 50000, totalTiket = 0;
        double diskon = 0, totalHarga, totalPenjualan = 0;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");
        System.out.println("(Ketik 0 untuk mengakhiri input)\n");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            tiket = sc.nextInt();

            if (tiket == 0) {
                break;
            }

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan lagi.\n");
                continue;
            }

            if (tiket > 4) {
                diskon = 0.10;
            } else if (tiket > 10) {
                diskon = 0.15;
            }

            totalHarga = tiket * hargaTiket;
            totalHarga -= totalHarga * diskon;
            totalTiket += tiket;
            totalPenjualan += totalHarga;

            System.out.println("Harga yang harus dibayar: Rp " + totalHarga);
            System.out.println();
        }

        System.out.println("=================================");
        System.out.println("Total tiket terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan tiket: Rp " + totalPenjualan);
        System.out.println("=================================");
        sc.close();
    }
}
