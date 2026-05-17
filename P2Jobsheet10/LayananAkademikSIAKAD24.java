package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        AntrianLayanan24 antrian = new AntrianLayanan24(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Antrian Posisi Belakang");
            System.out.println("0. Keluar");
            System.out.println("Pilih menu: ");
            pilihan = okta.nextInt(); okta.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = okta.nextLine();
                    System.out.print("Nama      : ");
                    String nama = okta.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = okta.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = okta.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa24 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 0);
    }
}
