package Minggu14.Code;
import java.util.Scanner;
public class Kafe10 {
    static Scanner sc = new Scanner(System.in);
    static String lanjut;
    static int pilihanMenu, banyakItem, totalHarga = 0;

    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
        do {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Apakah ingin memesan lagi? (y/n): ");
            lanjut = sc.nextLine();
            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);
        } while (lanjut.equalsIgnoreCase("y"));

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        totalHarga = hitungiskon(totalHarga, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk seluruh pembelian");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Anda mendapat diskon 50% untuk seluruh pembelian");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Anda mendapat diskon 30% untuk seluruh pembelian");
        } else {
            System.out.println("Kode invalid");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int hitungiskon(int total, String kodePromo) {
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            total *= 0.5;
            System.out.println("Anda mendapat diskon 50% untuk seluruh pembelian");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            total *= 0.7;
            System.out.println("Anda mendapat diskon 30% untuk seluruh pembelian");
        } else {
            System.out.println("Kode invalid! tidak ada diskon");
        }
        return total;
    }
}