|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #10 QUEUE

## 2.1   Operasi Dasar Queue

kode berada di file Queue24.java, QueueMain24.java, berikut adalah output nya

```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------
4
Elemen terdepan: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------------------
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.1.3 Pertanyaan
1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size
bernilai 0?
Jawab:
Atribut front dan rear bernilai -1 karena indeks di mulai dari 0, nilai -1 berarti front dan rear tidak berada di indeks manapun,
atribut size bernilai 0 karena kita baru menentukan ukuran dari queue ketika queue baru dibuat
2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
if (rear == max - 1) {
   rear = 0;
Jawab:
Agar posisi dari rear kembali ke indeks 0 setelah rear ada di indeks paling akhir,
fungsinya untuk jika ada data baru, data baru akan berada di urutan awal
3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
if (front == max - 1) {
    front = 0;
Jawab:
Agar posisi front kembali ke indeks 0 setelah front ada di indeks paling akhir,
fungsinya untuk mengambil data lagi dari posisi awal
4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0),
melainkan int i=front?
Jawab:
Karena posisi front tidak selalu ada di posisi 0, ketika ada data yang di ambil posisi front juga berubah
5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
i = (i + 1) % max;
Jawab:
Untuk memastikan bahwa yang di print adalah data selanjutnya dan ketika sudah berada di posisi terakhir
yang di print adalah data yang ada di indeks 0
6. Tunjukkan potongan kode program yang merupakan queue overflow!
Jawab:
```
public void Enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
```
ketika size == max dan ada data baru maka akan terjadi queue overflow
7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi
queue overflow dan queue underflow, program dihentikan!
Jawab:
```
public boolean Enqueue(int dt) {
        if (isFull()) {
            System.out.println("Queue sudah penuh");
            return false;
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
            return true;
        }
    }
```
```
public void Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
            return;
        }
         int dt = data[front];
         System.out.println("Data: " + dt);
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
```


## 2.2.   Antrian Layanan Akademik

kode berada di file  Mahasiswa24.java, AntrianLayanan24.java, LayananAkademikSIAKAD24.java, berikut adalah output nya

```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
1
NIM       : 123
Nama      : Aldi
Prodi     : TI
Kelas     : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
1
NIM       : 124
Nama      : Bobi
Prodi     : TI
Kelas     : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123-Aldi-TI-1A
2. 124-Bobi-TI-1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
2
Melayani mahasiswa: 123-Aldi-TI-1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124-Bobi-TI-1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 
0
Terima kasih.
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.2.3 Pertanyaan
1. Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class
AntrianLayanan yang digunakan untuk mengecek antrian yang berada di posisi belakang. Tambahkan
pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD sehingga
method LihatAkhir dapat dipanggil!
Jawab:
```
public void LihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Antrian Belakang: ");
            data[rear].tampilkanData();
        }
    }
```
```
case 6:
 antrian.LihatAkhir();
 break;
```
## 2.3.   Tugas

kode berada di file Mahasiswa24.java, Antrian24.java dan KRSMain24.java, berikut adalah output nya

```
=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
1
NIM       : 123
Nama      : okta
Prodi     : TI
Kelas     : 1F
okta berhasil masuk ke antrian.

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
1
NIM       : 124
Nama      : okta2
Prodi     : TI
Kelas     : 1A
okta2 berhasil masuk ke antrian.

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
2
Mahasiswa ke-1
123-okta-TI-1F
Mahasiswa ke-2
124-okta2-TI-1A

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
3
Antrian kosong.

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
4
Antrian kosong.

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
5
---------------------
1. Jumlah antrian: 0
2. Total sudah KRS: 2
3. Total belum KRS: 28

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
6
Antrian Kosong.

=== Menu Antrian KRS ===
1. Tambah Mahasiswa ke Antrian
2. Proses KRS
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa Yang Belum KRS
6. Antrian Posisi Belakang
0. Keluar
Pilih menu: 
0
Terima kasih.
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
