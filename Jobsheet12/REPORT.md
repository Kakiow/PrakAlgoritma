|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #12 Double Linked List

## 12.2   Operasi Penambahan pada Double Linked List

kode berada di file Mahasiswa24.java, Node24.java, DoubleLinkedList24.java, dan DoubleLinkedListMain24.java berikut adalah output nya

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 2
Masukkan NIM    : 
123005
Masukkan Nama   : 
Harry
Masukkan Kelas  : 
1A
Masukkan IPK    : 
3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru: 
Masukkan NIM    : 
123010
Masukkan Nama   : 
Potter
Masukkan Kelas  : 
1B
Masukkan IPK    : 
3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
NIM   : 123005
Nama  : Harry
Kelas : 1A
IPK   : 3.76
NIM   : 123010
Nama  : Potter
Kelas : 1B
IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 0
Program selesai.
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 12.2.3 Pertanyaan
1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan
Double Linked List!
Jawab:
Struktur single linked list hanya memiliki 2 bagian yaitu bagian data dan bagian pointer next, double linked list
memiliki 3 bagian yaitu bagian pointer prev, bagian data, dan bagian pointer next. traversal single linked list
hanya bisa traversal maju ke node berikut nya, traversal double linked list bisa maju ke node berikut nya atau
kembali ke node sebelumnya
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi
masing-masing atribut tersebut pada proses traversal dan manipulasi node!
Jawab:
Atribut next digunakan untuk menghubungkan node saat ini dengan node setelahnya, atribut next digunakan untuk
melakukan traversal ke node setelahnya. Atribut prev digunakan untuk menghubungkan node saat ini dengan node
sebelumnya, atribut prev digunakan untuk melakukan traversal ke node sebelumnya
3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut
terhadap kondisi awal linked list!
Jawab:
Untuk memberi tanda bahwa linked list masih kosong
4. Perhatikan potongan kode berikut:
```
if (isEmpty()) {
            head = tail = newNode;
        }
```
Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
Jawab:
Karena ketika ada data baru yang masuk, data baru itu adalah node satu satunya yang ada di linked list
5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika
tidak terdapat data pada linked list!
Jawab:
```
public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
```
6. Modifikasi kode program dengan menambahkan method printReverse() untuk
menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail
menuju head!
Jawab:
```
public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node24 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
```


## 12.3   Operasi Penghapusan pada Double Linked List

kode berada di file  Mahasiswa24.java, Node24.java, DoubleLinkedList24.java, dan DoubleLinkedListMain24.java berikut adalah output nya

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 5

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
NIM   : 123005
Nama  : Harry
Kelas : 1A
IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 0
Program selesai.
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 12.3.3 Pertanyaan
1. Perhatikan potongan kode berikut pada method removeFirst():
```
head = head.next;
head.prev = null;
```
Jelaskan fungsi masing-masing statement tersebut pada proses penghapusan node!
Jawab:
head = head.next; digunakan untuk menggeser posisi head ke node setelahnya
head.prev = null; digunakan untuk menghilangkan prev node baru ke node sebelumnya
2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data
yang berhasil dihapus!
Jawab:
```
public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data yang dihapus: ");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }
```
```
public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        System.out.println("Data yang dihapus: ");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
```

## 12.5   Tugas

kode berada di file Mahasiswa24.java, Node24.java, DoubleLinkedList24.java, dan DoubleLinkedListMain24.java berikut adalah output nya

```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 1
Masukkan NIM    : 
123
Masukkan Nama   : 
okta
Masukkan Kelas  : 
1F
Masukkan IPK    : 
3.7

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 2
Masukkan NIM    : 
124 
Masukkan Nama   : 
okta2
Masukkan Kelas  : 
1F
Masukkan IPK    : 
3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 7
Indeks data baru: 
1
Masukkan data baru: 
Masukkan NIM    : 
125
Masukkan Nama   : 
okta3
Masukkan Kelas  : 
1F
Masukkan IPK    : 
3.8

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 8
Masukkan NIM yang dicari : 
123

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 9
Masukkan indeks yang ingin dihapus: 
1

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 10
NIM   : 123
Nama  : okta
Kelas : 1F
IPK   : 3.7

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 11
NIM   : 124
Nama  : okta2
Kelas : 1F
IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 12
Index yang dicari: 
0
NIM   : 123
Nama  : okta
Kelas : 1F
IPK   : 3.7

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 13
Jumlah data: -1

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tambah data di indeks tertentu
8. Hapus data setelah nim
9. Hapus data di indeks tertentu
10. Tampilkan data pertama
11. Tampilkan data terakhir
12. Tampilkan data di indeks tertentu
13. Tampilkan jumlah data
0. Keluar
Pilih menu : 0
Program selesai.
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
