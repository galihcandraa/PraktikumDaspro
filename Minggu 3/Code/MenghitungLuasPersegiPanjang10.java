import java.util.Scanner;

public class MenghitungLuasPersegiPanjang10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.println("Masukkan panjang ");
        panjang = input.nextInt();
        System.out.println("Masukkan lebar ");
        lebar = input.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas persegi panjang adalah " + luas);
        input.close();
    }
}
