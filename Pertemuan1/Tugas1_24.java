package Pertemuan1;

import java.util.Scanner;

public class Tugas1_24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        String plat24;

        String[] KODE24 = {"A", "B","'C", "D", "E", "F", "G", "H","L", "N", "T"};

        String[][] KOTA24 = {{"B", "A", "N", "T", "E", "N"},{"J", "A", "K", "A", "R", "T", "A"},
    {"B", "A", "N", "D", "U", "N", "G"},{"C", "I", "R", "E", "B", "O", "N"},{"B", "O", "G", "O", "R"},
    {"P", "E", "K", "A", "L", "O", "N", "G", "A", "N"},{"S", "E", "M", "A", "R", "A", "N" ,"G"},{"S", "U", "R", "A", "B", "A","Y","A"},
    {"M", "A", "L", "A", "N", "G"},{"T", "E", "G", "A", "L"}};

    System.out.println("Kode plat nomor: ");
    plat24 = okta.next();

    for (int i24 = 0; i24 < KODE24.length; i24++) {
        if (plat24.equalsIgnoreCase(KODE24[i24])) {
            for (int j24 = 0; j24 < KOTA24[i24].length; j24++) {
                System.out.print(KOTA24[i24][j24]);
            }

            System.out.println();
        }
    }
    }
}
