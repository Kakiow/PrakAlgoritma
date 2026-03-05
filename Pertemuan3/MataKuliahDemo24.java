package Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        MataKuliah24[] arrayOfMatakuliah = new MataKuliah24[3];
        String kode, nama, dummy;
        int sks, jumlahjam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Matakuliah ke-" + (i + 1));
            System.out.print("Kode            :");
            kode = okta.nextLine();
            System.out.print("Nama            :");  
            nama = okta.nextLine();
            System.out.print("Sks             :");
            dummy = okta.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam      :");
            dummy = okta.nextLine();
            jumlahjam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah24(kode, nama, sks, jumlahjam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke- " + (i + 1));
            System.out.println("Kode              :" + arrayOfMatakuliah[i].kode);
            System.out.println("Nama              :" + arrayOfMatakuliah[i].nama);
            System.out.println("Sks               :" + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah jam        :" + arrayOfMatakuliah[i].jumlahjam);
        }
    }
}
