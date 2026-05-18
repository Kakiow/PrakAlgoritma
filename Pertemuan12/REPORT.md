|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #11 LINKED LIST

## 2.1   Pembuatan Single Linked List

kode berada di file Mahasiswa24.java, Node24.java, SingleLinkedList24.java, dan SLLMain24.java berikut adalah output nya

```
Linked list kosong
Isi Linked List:        Nim   : 21212203
Nama  : Dirga
Kelas : 4D
IPK   : 3.6

Isi Linked List:        Nim   : 21212203
Nama  : Dirga
Kelas : 4D
IPK   : 3.6
Nim   : 24212200
Nama  : Alvaro
Kelas : 1A
IPK   : 4.0

Isi Linked List:        Nim   : 21212203
Nama  : Dirga
Kelas : 4D
IPK   : 3.6
Nim   : 22212202
Nama  : Cintia
Kelas : 3C
IPK   : 3.5
Nim   : 23212201
Nama  : Bimon
Kelas : 2B
IPK   : 3.8
Nim   : 24212200
Nama  : Alvaro
Kelas : 1A
IPK   : 4.0
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
Jawab:
Karena fungsi print dipanggil dulu sebelum ada data yang dibuat
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
Jawab:
temp digunakan untuk menelusuri semua node untuk mencari data yang ingin di print
3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
Jawab:
```
Scanner okta = new Scanner(System.in);
        SingleLinkedList24 sll = new SingleLinkedList24();

        System.out.print("Nim: ");
        String nim = okta.nextLine();
        System.out.print("Nama: ");
        String nama = okta.nextLine();
        System.out.print("Kelas: ");
        String kelas = okta.nextLine();
        System.out.print("IPK: ");
        double ipk = okta.nextDouble();

        Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas, ipk);

        sll.addFirst(mhs);
        sll.print();
```


## 2.2.   Modifikasi Elemen pada Single Linked List

kode berada di file  Mahasiswa24.java, Node24.java, SingleLinkedList24.java, dan SLLMain24.java berikut adalah output nya

```
data index 1 :
Nim   : 22212202
Nama  : Cintia
Kelas : 3C
IPK   : 3.5
data mahasiswa an Bimon berada pada index : 2

Isi Linked List:        Nim   : 22212202
Nama  : Cintia
Kelas : 3C
IPK   : 3.5
Nim   : 23212201
Nama  : Bimon
Kelas : 2B
IPK   : 3.8

Isi Linked List:        Nim   : 23212201
Nama  : Bimon
Kelas : 2B
IPK   : 3.8
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.2.3 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
Jawab:
Untuk menghentikan perulangan ketika data yang mau dihapus sudah ditemukan
2. Jelaskan kegunaan kode dibawah pada method remove
```
temp.next = temp.next.next;
if (temp.next == null) {
tail = temp;
}
```
Jawab:
Untuk menghapus node dan mengubah posisi tail setelah ada node yang dihapus
## 2.3.   Tugas

kode berada di file QueueMahasiswa24.java, NodeQueue24.java, QueueLinked24.java dan QueueMain24.java berikut adalah output nya

```
Kapasitas queue: 
4
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
1
Nim: 
123
Nama: 
okta
Kelas: 
1F
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
1
Nim: 
125
Nama: 
okta2
Kelas: 
1F
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
2
Data : 
Nim :123
Nama :okta
Kelas :1F
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
3
Daftar antrian
Nim :125
Nama :okta2
Kelas :1F
Jumlah antrian: 1
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
4
data paling depan: 
Nim :125
Nama :okta2
Kelas :1F
data paling belakang
Nim :125
Nama :okta2
Kelas :1F
1. Menambah data
2. Memanggil antrian
3. Menampilkan antrian
4. Melihat antrian terdepan dan antrian paling belakang
-------------------------------
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
