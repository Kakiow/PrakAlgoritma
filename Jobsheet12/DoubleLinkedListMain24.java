package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain24 {

    public static Mahasiswa24 inputMahasiswa(Scanner okta) {
        System.out.println("Masukkan NIM    : ");
        String nim = okta.nextLine();
        System.out.println("Masukkan Nama   : ");
        String nama = okta.nextLine();
        System.out.println("Masukkan Kelas  : ");
        String kelas = okta.nextLine();
        System.out.println("Masukkan IPK    : ");
        double ipk = okta.nextDouble();
        okta.nextLine();
        return new Mahasiswa24(nim, nama, kelas, ipk);
    }
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        DoubleLinkedList24 list = new DoubleLinkedList24();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = okta.nextInt();
            okta.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa24 mhsAwal = inputMahasiswa(okta);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa24 mhsAkhir = inputMahasiswa(okta);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = okta.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa24 dataBaru = inputMahasiswa(okta);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}
