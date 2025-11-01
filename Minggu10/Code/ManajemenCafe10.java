package Minggu10.Code;
import java.util.Scanner;

public class ManajemenCafe10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jumlahCabang, pelanggan, itemTerjual = 0, totalPelanggan = 0, totalItemTerjual = 0;

        System.out.print("Jumlah cabang cafe: ");
        jumlahCabang = sc.nextInt();

        System.out.println("=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan: ");
            pelanggan = sc.nextInt();
            totalPelanggan += pelanggan;
            itemTerjual = 0;
            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                itemTerjual += item;
            }
            totalItemTerjual += itemTerjual;
            System.out.println("Cabang " + i + ": ");
            System.out.println("- Pelanggan: " + pelanggan);
            System.out.println("- Item terjual: " + itemTerjual);
        }

        System.out.println("\nTotal Seluruh Cabang: ");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItemTerjual + " Item");
        sc.close();
    }
}
