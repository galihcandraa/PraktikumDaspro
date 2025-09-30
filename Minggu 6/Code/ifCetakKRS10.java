import java.util.Scanner;
public class ifCetakKRS10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD---");
        System.out.print("Apakah UKT sudah lunas? (True/False): ");
        boolean uktLunas = sc.nextBoolean();
        if (uktLunas) {
            System.out.println("Pembayaran terverifikasi.");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak");
            System.out.println("Silahkan lunasi UKT terlebih dahulu");
        }
        sc.close();
    }
}