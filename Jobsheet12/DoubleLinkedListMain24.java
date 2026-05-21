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
            System.out.println("7. Tambah data di indeks tertentu");
            System.out.println("8. Hapus data setelah nim");
            System.out.println("9. Hapus data di indeks tertentu");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data terakhir");
            System.out.println("12. Tampilkan data di indeks tertentu");
            System.out.println("13. Tampilkan jumlah data");
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
                case 7:
                    System.out.println("Indeks data baru: ");
                    int index = okta.nextInt();
                    okta.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa24 Indexmhs = inputMahasiswa(okta);
                    list.add(index, Indexmhs);
                    break;
                case 8:
                    System.out.println("Masukkan NIM yang dicari : ");
                    String key = okta.nextLine();
                    list.removeAfter(key);
                    break;
                case 9:
                    System.out.println("Masukkan indeks yang ingin dihapus: ");
                    int idx = okta.nextInt();
                    okta.nextLine();
                    list.remove(idx);
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.println("Index yang dicari: ");
                    int indeks = okta.nextInt();
                    okta.nextLine();
                    list.getIndex(indeks);
                    break;
                case 13:
                    System.out.println("Jumlah data: " + list.size);
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
