|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #6 SEARCHING

## 6.2.   Searching/ Pencarian Menggunakan Algoritma Sequential Search

kode berada di file Mahasiswa_24.java, MahasiswaBerprestasi_24.java dan MahasiswaDemo_24, berikut adalah output nya

```
Masukkan Data Mahasiswa ke-1
NIM     :111
Nama    :adi
Kelas   :2
IPK     :3.6
------------------------------
Masukkan Data Mahasiswa ke-2
NIM     :222
Nama    :tio
Kelas   :2
IPK     :3.8
------------------------------
Masukkan Data Mahasiswa ke-3
NIM     :333
Nama    :ila
Kelas   :2
IPK     :3.0
------------------------------
Masukkan Data Mahasiswa ke-4
NIM     :444
Nama    :lia
Kelas   :2
IPK     :3.5
------------------------------
Masukkan Data Mahasiswa ke-5
NIM     :555
Nama    :fia
Kelas   :2
IPK     :3.3
------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.6
-------------------------
Nama: tio
NIM: 222
Kelas: 2
IPK: 3.8
-------------------------
Nama: ila
NIM: 333
Kelas: 2
IPK: 3.0
-------------------------
Nama: lia
NIM: 444
Kelas: 2
IPK: 3.5
-------------------------
Nama: fia
NIM: 555
Kelas: 2
IPK: 3.3
-------------------------
-------------------------------------
Pencarian Data
-------------------------------------
masukkan ipk mahasiswa yang dicari:
IPK:
3.5
menggunakan sequential searching
data mahasiswa dengan IPK :3.5 ditemukan pada indeks 3
nim      : 444
nama     : lia
kelas    : 2
ipk      : 3.5
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.2.3 Pertanyaan

1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class
MahasiswaBerprestasi!
Jawab:
Method tampilDataSearch menampilkan data detail dari object mahasiswa dan method tampilPosisi digunakan untuk mengetahui posisi indeks data
2. Jelaskan fungsi break pada kode program di bawah ini!
```
if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
```
Jawab:
Untuk membandingkan apakah atribut ipk listMhs[j] sama dengan inputan cari
3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
Jawab:
Untuk tau apakah data yang di cari ada dan untuk mengetahui posisi indeks dari data yang dicari
4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang
dibuat di atas akan menampilkan data ke berapa? Jelaskan.
Jawab:
Data yang ditampilkan adalah data yang sama dengan indeks yang paling kecil, karena dia akan mengecek satu per satu indeks dan jika data yang dicari ada maka 
data yang dicari dengan indeks paling kecil yang akan di tampilkan
5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari
kode di atas?
Jawab:
Akan menampilkan data dengan indeks yang paling besar


## 6.3.   Searching/ Pencarian Menggunakan Algoritma Binary Search

kode berada di file Mahasiswa_24.java, MahasiswaBerprestasi_24.java dan MahasiswaDemo_24.java, berikut adalah output nya

```
Masukkan Data Mahasiswa ke-1
NIM     :111
Nama    :adi
Kelas   :2
IPK     :3.1
------------------------------
Masukkan Data Mahasiswa ke-2
NIM     :222
Nama    :ila
Kelas   :2
IPK     :3.2
------------------------------
Masukkan Data Mahasiswa ke-3
NIM     :333
Nama    :lia
Kelas   :2
IPK     :3.3
------------------------------
Masukkan Data Mahasiswa ke-4
NIM     :444
Nama    :susi
Kelas   :2
IPK     :3.5
------------------------------
Masukkan Data Mahasiswa ke-5
NIM     :555
Nama    :anita
Kelas   :2
IPK     :3.7
------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
-------------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
-------------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
-------------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
-------------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
-------------------------
-------------------------------------
Pencarian Data
-------------------------------------
masukkan ipk mahasiswa yang dicari:
IPK:
3.7
-------------------------------
menggunakan binary search
--------------------------------
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.3.3 Pertanyaan

1. Tunjukkan pada kode program yang mana proses divide dijalankan!
Jawab:
```
mid =(left+right)/2;
```
2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
Jawab:
```
return findBinarySearch(cari, left, mid-1);
```
```
return findBinarySearch(cari, mid+1, right);
```
3. Apa fungsi left, right, dan mid?
Jawab:
Untuk tau indeks paling kiri yang mana, indeks tengah yang mana dan indeks paling kanan yang mana
4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian?
Jawab:
Program tidak akan jalan karena proses perbandingan nilai indeks tidak akan pernah selesai karena nilai indeks tidak akan terurut
5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
ubahlah kode program binary seach agar hasilnya sesuai
Jawab:
```
int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, mid+1, right);
            }
            else {
                return findBinarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }
```
6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam
array.
Jawab:
Ketika nilai dari indeks kiri lebih besar dari nilai indeks kanan, karena jika nilai indeks kiri sama dengan nilai indeks kanan tidak ada data yang bisa dicek
7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan
dari keyboard.
Jawab:
```
package Praktikum06;

public class MahasiswaBerprestasi_24 {
    Mahasiswa_24 [] listMhs;
    int idx;

    public MahasiswaBerprestasi_24(int jumlah){
        listMhs = new Mahasiswa_24[jumlah];
        idx=0;
    }

    void tambah (Mahasiswa_24 m){
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa_24 m:listMhs){
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " +pos);
        }
        else {
            System.out.println("data" +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan ");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, mid+1, right);
            }
            else {
                return findBinarySearch(cari, left, mid-1);
            }
        }
        return -1;
    }
}
```
```
package Praktikum06;

import java.util.Scanner;

public class MahasiswaDemo_24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        System.out.println("Jumlah mahasiswa");
        int jumMhs=okta.nextInt();
        okta.nextLine();

        MahasiswaBerprestasi_24 list = new MahasiswaBerprestasi_24(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" +(i + 1));
            System.out.print("NIM     :");
            String nim = okta.nextLine();
            System.out.print("Nama    :");
            String nama = okta.nextLine();
            System.out.print("Kelas   :");
            String kelas = okta.nextLine();
            System.out.print("IPK     :");
            String ip = okta.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("------------------------------");
            list.tambah (new Mahasiswa_24(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.println("IPK: ");
        double cari = okta.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("menggunakan binary search");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
```
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
