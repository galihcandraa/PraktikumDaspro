import java.util.Scanner;

public class LatihanSoalA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sewaMobil = 300000, SewaSopir = 200000, lamaSewa;
        double jarakTempuh, totalHargaSewa;

        System.out.print("Masukkan berapa lama sewa mobil anda (hari) : ");
        lamaSewa = input.nextInt();
        System.out.print("Masukkan jarak tempuh anda (km) : ");
        jarakTempuh = input.nextDouble();

        lamaSewa *= (sewaMobil + SewaSopir);
        jarakTempuh *= 1000;
        totalHargaSewa = lamaSewa + jarakTempuh;

        System.out.println("Total harga yang harus anda bayar adalah : " + totalHargaSewa);
        input.close();
    }
}