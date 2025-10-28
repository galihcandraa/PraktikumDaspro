package Minggu10.Code;
import java.util.Scanner;

public class Square10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int iOuter = 1; iOuter <= n; iOuter++) {
            for (int i = 0; i <= n; i++) {
                System.out.print("*");
            }
        }

        sc.close();
    }
}
