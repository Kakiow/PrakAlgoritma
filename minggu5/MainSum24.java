package minggu5;

import java.util.Scanner;

public class MainSum24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen = okta.nextInt();

        Sum24 sm = new Sum24(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = okta.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and conquer: "+sm.totalDC(sm.keuntungan,0,elemen-1));
    }
}
