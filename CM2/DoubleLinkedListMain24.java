package CM2;

import java.util.Scanner;

public class DoubleLinkedListMain24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        DoubleLinkedListAntrian24 antrian = new DoubleLinkedListAntrian24();
        DoubleLinkedListPesanan24 pesanan = new DoubleLinkedListPesanan24();
        int pilihan;

        do {
            System.out.println("=================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("=================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = okta.nextInt();
            okta.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli :");
                    String namaPembeli = okta.nextLine();
                    System.out.print("No HP        :");
                    String NoHp = okta.nextLine();
                    antrian.tambahAntrian(namaPembeli, NoHp);
                    break;
                case 2:
                    antrian.cetakAntrian();
                    break;
                case 3:
                    System.out.print("Kode Pesanan   :");
                    int kodePesanan = okta.nextInt();
                    okta.nextLine();
                    System.out.print("Nama Pesanan   :");
                    String namaPesanan = okta.nextLine();
                    System.out.print("Harga          :");
                    int harga = okta.nextInt();
                    okta.nextLine();
                    Pembeli24 antri = antrian.removeFirst();
                    pesanan.tambahPesanan(kodePesanan, namaPesanan, harga, harga);
                    System.out.println(antri.namaPembeli + " telah memesan " + namaPesanan);
                    break;
                case 4:
                    pesanan.laporPesanan();
                    break;
                case 0:
                    break;
            
                default:
                    break;
            }
        } while (pilihan != 0); 
    }
}
