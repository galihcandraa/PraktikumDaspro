import java.util.Scanner;

public class aksesLayananWifi10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jenisPengguna;
        int jumlahSKS;

        System.out.print("Masukkan jenis pengguna: ");
        jenisPengguna = sc.nextLine();

        if (jenisPengguna.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses Wifi diberikan (dosen)");
        } else if (jenisPengguna.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            jumlahSKS = sc.nextInt();
            if (jumlahSKS >= 12) {
                System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        sc.close();
    }
}
