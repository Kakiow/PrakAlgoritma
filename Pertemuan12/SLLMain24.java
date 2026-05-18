package Pertemuan12;

import java.util.Scanner;

public class SLLMain24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        SingleLinkedList24 sll = new SingleLinkedList24();

        System.out.print("Nim: ");
        String nim = okta.nextLine();
        System.out.print("Nama: ");
        String nama = okta.nextLine();
        System.out.print("Kelas: ");
        String kelas = okta.nextLine();
        System.out.print("IPK: ");
        double ipk = okta.nextDouble();

        Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);

        sll.addFirst(mhs);
        sll.print();

        
    }
}
