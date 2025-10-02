import java.util.Scanner;

public class sistemPerpustakaan10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String kartuMhs, regist;
        System.out.print("Apakah membawa kartu mahasiswa (ya/tidak): ");
        kartuMhs = sc.nextLine();
        System.out.print("Apakah sudah registrasi (ya/tidak): ");
        regist = sc.nextLine();

        if (kartuMhs.equalsIgnoreCase("ya") || regist.equalsIgnoreCase("ya")) {
            System.out.println("Ijin masuk diberikan");
        } else if (kartuMhs.equalsIgnoreCase("tidak") || regist.equalsIgnoreCase("tidak")) {
            System.out.println("Ijin masuk ditolak karena syarat tidak terpenuhi");
        } else {
            System.out.println("Gagal, jawaban anda salah");
        }
        sc.close();
    }
}