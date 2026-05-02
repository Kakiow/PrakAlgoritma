package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);
        Scanner okta = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Pengumpul Tugas Pertama");
            System.out.println("6. Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = okta.nextInt();
            okta.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nama: ");
                    String nama = okta.nextLine();
                    System.out.println("NIM: ");
                    String nim = okta.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = okta.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, kelas);
                    stack.push(mhs);
                    break;
                case 2:
                    Mahasiswa24 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = okta.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa24 pertama = stack.pertama();
                    if (pertama != null) {
                        System.out.println("Tugas pertama: " + pertama.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah Tugas: " + stack.JumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
    }
}
