package Pertemuan3;

import java.util.Scanner;

public class MataKuliahDemo24 {
    
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        int matkul24;

        System.out.println("Jumlah elemen: ");
        matkul24 = okta.nextInt();

        MataKuliah24[] arrayOfMatakuliah = new MataKuliah24[matkul24];
        

        for (int i = 0; i < matkul24; i++) {
            System.out.println("Masukkan data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah24();

            arrayOfMatakuliah[i].tambahData();
        }

        for (int i = 0; i < matkul24; i++) {
            System.out.println("Data Matakuliah ke- " + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
