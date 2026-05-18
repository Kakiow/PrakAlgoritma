package Pertemuan12;

import java.util.Scanner;

public class QueueMain24 {
    public static void menu() {
        System.out.println("1. Menambah data");
        System.out.println("2. Memanggil antrian");
        System.out.println("3. Menampilkan antrian");
        System.out.println("4. Melihat antrian terdepan dan antrian paling belakang");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);

        System.out.println("Kapasitas queue: ");
        int n = okta.nextInt();
        okta.nextLine();

        QueueLinked24 Q = new QueueLinked24(n);
        int pilih;

        do {
            menu();
            pilih = okta.nextInt();
            okta.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Nim: ");
                    String nim = okta.nextLine();
                    System.out.println("Nama: ");
                    String nama = okta.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = okta.nextLine();
                    QueueMahasiswa24 baru = new QueueMahasiswa24(nim, nama, kelas);
                    if (!Q.enqueue(baru)) {
                        return;
                    }
                    break;
                case 2:
                    Q.dequeue();
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
            
    }
}
