package Jobsheet9;

import java.util.Scanner;

public class SuratMain24 {
    public static void main(String[] args) {
        StackSurat24 stack = new StackSurat24(5);
        Scanner okta = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = okta.nextInt();
            okta.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Id Surat: ");
                    String idSurat = okta.nextLine();
                    System.out.println("Nama Mahasiswa: ");
                    String namaMahasiswa = okta.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = okta.nextLine();
                    System.out.println("Jenis Izin: ");
                    char jenisIzin = okta.next().charAt(0);
                    System.out.println("Durasi: ");
                    int durasi = okta.nextInt();
                    Surat24 surat = new Surat24(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat24 hasil = stack.pop();
                    if (hasil != null) {
                        System.out.println("Proses surat " + hasil.idSurat + "Dengan nama " + hasil.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir oleh " + lihat.namaMahasiswa);
                    }
                break;
                case 4:
                    System.out.print("Nama yang dicari: ");
                    String nama = okta.nextLine();
                    stack.CariSurat(nama);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
