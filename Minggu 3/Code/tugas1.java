import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga, bulan;
        double uangMuka, bunga = 0.01, jumlah, cicilan;

        System.out.println("Masukkan harga motor ");
        harga = input.nextInt();
        System.out.println("Masukkan uang muka (DP) ");
        uangMuka = input.nextDouble();
        System.out.println("Masukkan cicilan selama berapa bulan ");
        bulan = input.nextInt();

        cicilan = harga - uangMuka;
        jumlah = (cicilan / bulan) + (cicilan * bunga);

        System.out.println("Jumlah cicilan per bulan anda adalah Rp. " + jumlah);
        input.close();
    }
}
