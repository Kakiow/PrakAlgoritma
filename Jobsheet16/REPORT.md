|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #16 Collection

## 16.2.1   Percobaan 1

kode berada di file ContohList24.java berikut adalah output nya

```
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 16.2.3 Pertanyaan
1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah
Arraylist?
Jawab:
Karena pada saat instansiasi Arraylist tidak di tentukan tipe data nya
2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe
tertentu!
Jawab:
```
List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n",l.get(0), l.size(), l.get(l.size() - 1));
```
3. Ubah kode pada baris kode 38 menjadi seperti ini
Jawab:
```
LinkedList<String> names = new LinkedList<>();
```
4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
Jawab:
```
names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());
```
5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
Jawab:
```
Elemen 0: 1 total elemen: 3 elemen terakhir: 3
Elemen 0: 2 total elemen: 3 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni
Names: [Mei-mei, My kid, Akhleema, Shannum, Uwais, Al-Qarni]
```
Menambahkan data baru, elemen linkedlist dari 5 jadi 6, mengambil data paling atas dan mengambil data paling bawah

## 16.3.1   Kegiatan Praktikum 2

kode berada di file  LoopCollection24.java berikut adalah output nya

```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 16.3.3 Pertanyaan
1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
Jawab:
Fungsi push() mengembalikan nilai elemen yang di masukkan, fungsi add() mengembalikan nilai true atau false
2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
Jawab:
Program error karena perulangan tidak bisa dilakukan karena stack kosong
3. Jelaskan fungsi dari baris 46-49?
Jawab:
Melakukan perulangan pada stack dan menampilkan semua isi stack
4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi?
Mengapa bisa demikian?
Jawab:
Method push tidak bisa dilakukan karena method push hanya dimiliki oleh stack
5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
Jawab:
```
fruits.set(fruits.size() - 1, "Strawberry");
        System.out.printf("%s " + fruits);
```
6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
Jawab:
```
fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");
        int sort = fruits.size();
        for (int i = 0; i < sort - 1; i++) {
            for (int j = 0; j < sort - i - 1; j++) {
                if (fruits.get(j).compareTo(fruits.get(j + 1)) > 0) {
                    String temp = fruits.get(j);
                    fruits.set(j, fruits.get(j + 1));
                    fruits.set(j + 1, temp);
                }
            }
        }
```

## 16.4.1   Kegiatan Praktikum 3

kode berada di file Mahasiswa24.java, ListMahasiswa24.java berikut adalah output nya

```
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 16.4.3 Pertanyaan
1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa?
Dan kelebihannya apa?
Jawab:
Menggunakan konsep variable argument, kelebihan nya bisa menambahkan objek sebanyak yang di butuhkan karena bersifat fleksibel
2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
Jawab:
```
int binarySearch(String nim) {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
        Mahasiswa24 cari = new Mahasiswa24(nim, "", "");
        int index = java.util.Collections.binarySearch(mahasiswas, cari, (m1, m2) -> m1.nim.compareTo(m2.nim));
        return index >= 0 ? index : -1;
    }
```
```
lm.update(lm.binarySearch("201235"), new Mahasiswa24("201235", "Akhleema Lela", "021xx2"));
```
3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
Jawab:
```
public void ascending() {
        int mhs = mahasiswas.size();
        for (int i = 0; i < mhs - 1; i++) {
            for (int j = 0; j < mhs - i - 1; j++) {
                if (mahasiswas.get(j).nim.compareTo(mahasiswas.get(j + 1).nim) > 0) {
                    Mahasiswa24 temp = mahasiswas.get(j);
                    mahasiswas.set(j, mahasiswas.get(j + 1));
                    mahasiswas.set(j + 1, temp);
                }
            }
        }
    }

    public void descending() {
        int mhs = mahasiswas.size();
        for (int i = 0; i < mhs - 1; i++) {
            for (int j = 0; j < mhs - i - 1; j++) {
                if (mahasiswas.get(j).nim.compareTo(mahasiswas.get(j + 1).nim) < 0) {
                    Mahasiswa24 temp = mahasiswas.get(j);
                    mahasiswas.set(j, mahasiswas.get(j + 1));
                    mahasiswas.set(j + 1, temp);
                }
            }
        }
    }
```

## 16.5   Tugas

kode berada di file Mahasiswas24.java, Nilai24.java, MataKuliah24.java, NilaiMain24.java berikut adalah output nya

```
package Jobsheet16;

public class Mahasiswas24 {
    String nim;
    String nama;
    String telf;

    public Mahasiswas24(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
}
```
```
package Jobsheet16;

public class Nilai24 {
    Mahasiswas24 mhs;
    MataKuliah24 mk;
    double nilai;

    public Nilai24(Mahasiswas24 mhs, MataKuliah24 mk, double nilai) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilai = nilai;
    }
}
```
```
package Jobsheet16;

public class MataKuliah24 {
    String kode;
    String matkul;
    int sks;

    public MataKuliah24(String kode, String matkul, int sks) {
        this.kode = kode;
        this.matkul = matkul;
        this.sks = sks;
    }
}
```
```
package Jobsheet16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NilaiMain24 {
    List<Mahasiswas24> mhs = new ArrayList<>();
    List<MataKuliah24> mk = new ArrayList<>();
    List<Nilai24> nilaimhs = new ArrayList<>();
    Scanner okta = new Scanner(System.in);

    public void input() {
        mhs.add(new Mahasiswas24("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswas24("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswas24("20003", "Abdur-Rahman", "021xxx"));
        mhs.add(new Mahasiswas24("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswas24("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswas24("20006", "Ubaidah", "021xxx"));

        mk.add(new MataKuliah24("00001", "Internet of Things", 3));
        mk.add(new MataKuliah24("00002", "Algoritma dan Struktur Data", 2));
        mk.add(new MataKuliah24("00003", "Algoritma dan Pemrograman", 2));
        mk.add(new MataKuliah24("00004", "Praktikum Algoritma dan Struktur Data", 3));
        mk.add(new MataKuliah24("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    public void menu() {
        System.out.println("Masukkan data");
        System.out.print("Kode     : ");
        String Kode = okta.next();
        System.out.print("Nilai    : ");
        double nilai = okta.nextDouble();

        System.out.println("\nDAFTAR MAHASISWA");
        System.out.println("*****************************************");
        for (Mahasiswas24 mh : mhs) {
            System.out.printf("%-7s %-15s %-10s\n", mh.nim, mh.nama, mh.telf);
        }
        System.out.print("Pilih mahasiswa by nim: ");
        String nim = okta.next();

        System.out.println("\nDAFTAR MATA KULIAH");
        System.out.println("*****************************************");
        System.out.printf("%-7s %-40s %-3s\n", "Kode", "Mata Kuliah", "SKS");
        for (MataKuliah24 mkh : mk) {
            System.out.printf("%-7s %-40s %-3s\n", mkh.kode, mkh.matkul, mkh.sks);
        }
        System.out.print("Pilih MK by kode: ");
        String mkh = okta.next();

        Mahasiswas24 mhsPilih = null;
        for (Mahasiswas24 pilih : mhs) {
            if (pilih.nim.equals(nim)) {
                mhsPilih = pilih;
                break;
            }
        }

        MataKuliah24 mkPilih = null;
        for (MataKuliah24 pilih : mk) {
            if (pilih.kode.equals(mkh)) {
                mkPilih = pilih;
                break;
            }
        }

        if (mhsPilih != null && mkPilih != null) {
            nilaimhs.add(new Nilai24(mhsPilih, mkPilih, nilai));
        } 
    }

    public void tampilNilai() {
        System.out.println("\nDAFTAR NILAI MAHASISWA");
        System.out.println("******************************************");
        System.out.printf("%-7s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (Nilai24 nil : nilaimhs) {
            System.out.printf("%-7s %-15s %-40s %-5d %-5.2f\n", nil.mhs.nim, nil.mhs.nama, nil.mk.matkul, nil.mk.sks, nil.nilai);
        }
    }

    public void cariNilai() {
        tampilNilai();
        System.out.println("Masukkan data mahasiswa[nim]: ");
        String cari = okta.next();

        System.out.printf("%-7s %-15s %-40s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        int total = 0;
        boolean temu = false;

        for (Nilai24 nil : nilaimhs) {
            if (nil.mhs.nim.equals(cari)) {
                System.out.printf("%-7s %-15s %-40s %-5d %-5.2f\n", nil.mhs.nim, nil.mhs.nama, nil.mk.matkul, nil.mk.sks, nil.nilai);
                total += nil.mk.sks;
                temu = true;
            }
        }
        if (temu) {
            System.out.println("Total SKS " + total + " telah diambil");
        }
    }

    public void urutNilai() {
        int nil = nilaimhs.size();
        for (int i = 0; i < nil - 1; i++) {
            for (int j = 0; j < nil - i - 1; j++) {
                if (nilaimhs.get(j).nilai > nilaimhs.get(j + 1).nilai) {
                    Nilai24 temp = nilaimhs.get(j);
                    nilaimhs.set(j, nilaimhs.get(j + 1));
                    nilaimhs.set(j + 1, temp);
                }
            }
        }
        tampilNilai();
    }

    public static void main(String[] args) {
        NilaiMain24 nil = new NilaiMain24();
        nil.input();
        int pilih;

        do {
            System.out.println("\n**********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("**********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("**********************************************");
            System.out.print("Pilih: ");
            pilih = nil.okta.nextInt();

            switch (pilih) {
                case 1:
                    nil.input();
                    break;
                case 2:
                    nil.tampilNilai();
                    break;
                case 3:
                    nil.cariNilai();
                    break;
                case 4:
                    nil.urutNilai();
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        } while (pilih != 5); 
    }
}
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
