package Minggu9.Code;

import java.util.Scanner;;

public class PembayaranParkir10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        System.out.println("===== Program Penghitung Parkir =====");

        while (true) {
            System.out.print("\nMasukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Program Dihentikan");
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir: ");
                durasi = sc.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid");
                }
            }
        }
        System.out.println("============================");
        System.out.println("Total pembayaran: Rp " + total);
        System.out.println("============================");
        sc.close();
    }
}
