package Pertemuan3;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];
       String dummy;

       for (int i = 0; i < 3; i++) {
        arrayOfMahasiswa[i] = new Mahasiswa24();

        System.out.println("Masukkan data Mahasiswa ke-" + (i + 1));
        System.out.print("Nim     : ");
        arrayOfMahasiswa[i].nim = okta.nextLine();
        System.out.print("Nama    : ");
        arrayOfMahasiswa[i].nama = okta.nextLine();
        System.out.print("Kelas   : ");
        arrayOfMahasiswa[i].kelas = okta.nextLine();
        System.out.print("IPK     : ");
        dummy = okta.nextLine();
        arrayOfMahasiswa[i].Ipk = Float.parseFloat(dummy);
       }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("Nim            : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama           : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas          : " + arrayOfMahasiswa[i].kelas);
            System.out.println("Ipk            : " + arrayOfMahasiswa[i].Ipk);
            System.out.println("--------------------------------------");
        }
        
    }
}
