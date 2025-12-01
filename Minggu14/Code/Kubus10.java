package Minggu14.Code;

public class Kubus10 {
    public static void main(String[] args) {
        System.out.println("===== PROGRAM HITUNG VOLUME & LUAS PERMUKAAN KUBUS =====");
        int sisiInput = 5;
        System.out.println("Panjang sisi kubus: 5");
        System.out.println("- Volume: " + hitungVolume(sisiInput) + "cm²");
        System.out.println("- Luas Permukaan: " + hitungLuasPermukaan(sisiInput) + "cm³");
        System.out.println("=================== PROGRAM SELESAI ====================");
    }

    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
}
