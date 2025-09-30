import java.util.Scanner;
public class tugas2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarak, harga = 10000;
        double konsumBensin = 0.5, total;

        System.out.println("Masukkan jarak tempuh ");
        jarak = input.nextInt();

        total = (jarak * konsumBensin) * harga;

        System.out.println("Total biaya bensin anda adalah Rp.  " + total);
        input.close();
    }
}
