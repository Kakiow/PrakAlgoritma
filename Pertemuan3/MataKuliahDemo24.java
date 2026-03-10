package Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        MataKuliah24[] arrayOfMatakuliah = new MataKuliah24[3];
        

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah24();

            arrayOfMatakuliah[i].tambahData();
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
