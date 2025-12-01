package Minggu14.Code;

public class PengunjungCafe10 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
        daftarPengunjung();
    }

    public static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }
}
