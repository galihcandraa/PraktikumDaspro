import java.util.Scanner;
public class StudiKasus1Dinamis {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gaji_pokok, jml_anak, tunjangan_anak = 150000;
        double gaji_bersih, potongan_pensiun = 0.05;

        System.out.println("Masukkan gaji pokok");
        gaji_pokok = input.nextInt();
        System.out.println("Masukkan jumlah anak");
        jml_anak = input.nextInt();

        tunjangan_anak = jml_anak * tunjangan_anak;
        potongan_pensiun = gaji_pokok * potongan_pensiun;
        gaji_bersih = gaji_pokok + tunjangan_anak - potongan_pensiun;

        System.out.println("Jumlah gaji bersih anda: " + gaji_bersih);
        input.close();
    }
}
