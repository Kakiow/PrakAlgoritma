package Pertemuan1;

import java.util.Scanner;

public class Tugas2_24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        System.out.println("Jumlah jadwal");
        int n24 = okta.nextInt();
        okta.nextLine();

        String[][] jadwal24 = new String[n24][4];

        input24(jadwal24,n24,okta);
        tampil24(jadwal24,n24);

        System.out.println("Masukkan hari");
        String hari24 = okta.nextLine();
        tampilhari24(jadwal24,n24,hari24);

        System.out.println("Masukkan matkul");
        String matkul24 = okta.nextLine();
        tampilmatkul24(jadwal24,n24,matkul24);
    }

    public static void input24(String[][] jadwal24, int n24, Scanner okta) {
        for (int i24 = 0; i24 < n24; i24++) {
            System.out.println("jadwal ke" + (i24 + 1));
            System.out.print("Mata kuliah: ");
            jadwal24[i24][0] = okta.nextLine();
            System.out.print("ruang: ");
            jadwal24[i24][1] = okta.nextLine();
            System.out.print("hari: ");
            jadwal24[i24][2] = okta.nextLine();
            System.out.print("jam: ");
            jadwal24[i24][3] = okta.nextLine();
        }
    }

    public static void tampil24(String[][] jadwal24, int n24) {
        System.out.println("jadwal");
        System.out.println("-----------------------------------------------");
        System.out.printf(" %-3s  %-20s  %-10s  %-12s %-12s\n", "no", "Mata Kuliah", "Ruang", "Hari", "jam");
        System.out.println("-----------------------------------------------");

        for (int i24 = 0; i24 < n24; i24++) {
            System.out.printf(" %-3d  %-20s  %-10s  %-10s  %-12s \n", (i24 + 1), jadwal24[i24][0], jadwal24[i24][1],
        jadwal24[i24][2], jadwal24[i24][3]);
        }

        System.out.println("---------------------------------------------------");
    }

    public static void tampilhari24(String[][] jadwal24, int n24, String hari24) {
        System.out.println("cari hari: " + hari24);
        
        for (int i24 = 0; i24 < n24; i24++) {
            if (jadwal24[i24][2].equalsIgnoreCase(hari24)) {
                System.out.println(jadwal24[i24][0] + " " + jadwal24[i24][3] + " " + jadwal24[i24][1]);
                
            }
        }
       
    }

    public static void tampilmatkul24(String[][] jadwal24, int n24, String matkul24) {
        System.out.println("cari matkul: " + matkul24);
        
        for (int i24 = 0; i24 < n24; i24++) {
            if (jadwal24[i24][0].equalsIgnoreCase(matkul24)) {
                System.out.println(jadwal24[i24][0] + " " + jadwal24[i24][3] + " " + jadwal24[i24][1]);
                
            }
        }
        
    }
}
