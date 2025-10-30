package Minggu10.Code;

import java.util.Scanner;

public class JumlahKuadrat10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahKuadrat = 0, kuadrat;

        System.out.println("=== Program Jumlah Kuadrat ===");
        System.out.print("Masukkan nilai akhir n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("n = " + i + " -> jumlah luadrat = ");
            jumlahKuadrat = 0;
            for (int j = 1; j <= i; j++) {
                kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                System.out.print(kuadrat);
                if (j < i) {
                    System.out.print(" + ");
                }
            }
            if (i > 1) {
                System.out.print(" = " + jumlahKuadrat);
            }
            System.out.println();
        }
        sc.close();
    }
}
