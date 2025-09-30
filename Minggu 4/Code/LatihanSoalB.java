import java.util.Scanner;
public class LatihanSoalB {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int fixedCost = 50000, tarif = 1500, daya;
        double pajak = 0.10, totalBiaya;

        System.out.println("Masukkan daya listrik : ");
        daya = input.nextInt();

        daya *= tarif;
        totalBiaya = (fixedCost + daya) * pajak + fixedCost + daya;

        System.out.println(daya);
        System.out.println((fixedCost + daya) * pajak);
        System.out.println("Jumlah biaya yang harus anda bayar adalah Rp. " + totalBiaya);
        input.close();
    }
}
