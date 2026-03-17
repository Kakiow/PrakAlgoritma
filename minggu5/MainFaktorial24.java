package minggu5;

import java.util.Scanner;

public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        System.out.println("Masukkan nilai: ");
        int nilai = okta.nextInt();

        Faktorial24 fk = new Faktorial24();
        System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + "menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
