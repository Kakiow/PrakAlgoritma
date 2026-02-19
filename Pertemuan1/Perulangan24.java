package Pertemuan1;

import java.util.Scanner;

public class Perulangan24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        int n24;
        long nim24;

        System.out.println("masukkan nim");
        nim24 = okta.nextLong();

        n24 = (int) (nim24 % 100);

        if (n24 < 10) {
            n24 += 10;
        }

        for (int i24 = 0; i24 <= n24; i24++) {
            if (i24 != 10 && i24 != 15) {
                if (i24 % 3 == 0) {
                    System.out.println("#");
                } else if (i24 % 2 == 0 ) {
                    System.out.println(i24 + " ");
                } else {
                    System.out.println("* ");
                }
            }
        }
    }
}
