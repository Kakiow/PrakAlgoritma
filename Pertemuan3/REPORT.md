|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #3 ARRAY OF OBJECTS

## 3.2.  Membuat Array dari Object, Mengisi dan Menampilkan

kode berada di file Mahasiswa24.java, berikut adalah screenshot nya

```
Nim         :254107020239
Nama        :Okta
Kelas       :TI 1F
IPK         :3.33
---------------------------------------
Nim         :25410702023912312432
Nama        :Okta2
Kelas       :TI 1F
IPK         :3.53
---------------------------------------
Nim         :25410702023924234
Nama        :Okta3
Kelas       :TI 1F
IPK         :3.93
---------------------------------------
```



**Penjelasan:** ada 3 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method

## 3.2.3 Pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
atribut dan sekaligus method? Jelaskan!
Jawab:
Class yang akan dibuat array of object tidak harus selalu memiliki atribut method sekaligus, karena method hanya akan digunakan ketika nilai dari atribut object akan di proses lagi 
2. Apa yang dilakukan oleh kode program berikut?
   Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];
   Jawab:
   Kode program tersebut digunakan untuk melakukan deklarasi dan instansiasi array of object
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new Mahasiswa24();
Jawab:
Class mahasiswa memiliki konstruktor,tetapi konstruktor tersebut adalah kontsruktor kosong bukan konstruktor berparameter.Konstruktor bisa di panggil karena kontruktor tersebut tetap valid walaupun konstruktor tersebut adalah kontsruktor kosong bukan konstruktor berparameter
4. Apa yang dilakukan oleh kode program berikut?
        arrayOfMahasiswa[0] = new Mahasiswa24();
        arrayOfMahasiswa[0].nim = "254107020239";
        arrayOfMahasiswa[0].nama = "Okta";
        arrayOfMahasiswa[0].kelas = "TI 1F";
        arrayOfMahasiswa[0].Ipk = (float) 3.33;
   Jawab:
   Kode program tersebut melakukan instansiasi object untuk indeks 0 dan mengisi setiap atribut object indeks ke 0
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
    Jawab:
   Class Mahasiswa digunakan untuk deklarasi atribut,class mahasiswa demo digunakan untuk deklarasi dan instansiasi array kemudian instansiasi object dan mengisi setiap atribut object.



## 3.3.  Menerima Input Isian Array Menggunakan Looping
kode berada di file MahasiswaMain24.java, berikut adalah screenshot nya
```
Masukkan data Mahasiswa ke-1
Nim     : 254107020239
Nama    : okta
Kelas   : 1F   
IPK     : 3.60
Masukkan data Mahasiswa ke-2
Nim     : 23445654
Nama    : okta2
Kelas   : 1j
IPK     : 3.50
Masukkan data Mahasiswa ke-3
Nim     : 253456546
Nama    : okta3
Kelas   : 1K
IPK     : 3.42
Data Mahasiswa ke-1
Nim            : 254107020239
Nama           : okta
Kelas          : 1F
Ipk            : 3.6
--------------------------------------
Data Mahasiswa ke-2
Nim            : 23445654
Nama           : okta2
Kelas          : 1j
Ipk            : 3.5
--------------------------------------
Data Mahasiswa ke-3
Nim            : 253456546
Nama           : okta3
Kelas          : 1K
Ipk            : 3.42
--------------------------------------
```

**Penjelasan:** ada 5 tahap: 
1. Membuat class main
2. Instansiasi object
3. Input nilai atribut
4. Mengakses method
5. output

## 3.3.3 Pertanyaan
1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program
pada langkah no 3.
Jawab:
![Screenshot](gambar/ss1_3.3.png)
![Screenshot](gambar/ss2_3.3.png)
```
Masukkan data Mahasiswa ke-1
Nim     : 2345235345
Nama    : okta
Kelas   : 1F
IPK     : 3.60
Masukkan data Mahasiswa ke-2
Nim     : 23452352  
Nama    : okta2
Kelas   : 1L
IPK     : 3.20
Masukkan data Mahasiswa ke-3
Nim     : 235235345
Nama    : okta3
Kelas   : 1K
IPK     : 3.40
Data Mahasiswa ke-1
NIM: 2345235345
Nama: okta
Kelas: 1F
IPK: 3.6
Data Mahasiswa ke-2
NIM: 23452352
Nama: okta2
Kelas: 1L
IPK: 3.2
Data Mahasiswa ke-3
NIM: 235235345
Nama: okta3
Kelas: 1K
IPK: 3.4
```
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
Jawab:
Karena pada kode tersebut tidak ada instansiasi object sehingga ketika kita mmengisi nilai atribut object indeks 0 maka akan terjadi error

## 3.4. Constructor Berparameter
kode berada di file Mahasiswa24.java dan MahasiswaMain24.java, berikut adalah screenshot nya
```
Masukkan data Matakuliah ke-1
Kode            :12345
Nama            :Algoritma dan struktur data
Sks             :2
Jumlah jam      :6
-------------------------------------
Masukkan data Matakuliah ke-2
Kode            :1234567
Nama            :basis data
Sks             :2
Jumlah jam      :4
-------------------------------------
Masukkan data Matakuliah ke-3
Kode            :12345678
Nama            :dasar pemrograman
Sks             :2
Jumlah jam      :6
-------------------------------------
Data Matakuliah ke- 1
Kode              :12345
Nama              :Algoritma dan struktur data
Sks               :2
Jumlah jam        :6
Data Matakuliah ke- 2
Kode              :1234567
Nama              :basis data
Sks               :2
Jumlah jam        :4
Data Matakuliah ke- 3
Kode              :12345678
Nama              :dasar pemrograman
Sks               :2
Jumlah jam        :6
```


**Penjelasan:** ada 5 tahap: 
1. Membuat Konstruktor default dan Konstruktor berparameter
2. Instansiasi object
3. Mengisi nilai atribut
4. Mengakses method
5. Output

## 2.3.3 Pertanyaan
1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
   Jawab:
   Suatu class dapat memiliki lebih dari 1 konstruktor, contohnya pada class produk terdapat 2 konstruktor, konstruktor kosong untuk stok barang dan konstruktor
   berparameter untuk harga barang jika kita ingin memberi nilai harga barang dari awal
2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menambahkan data Matakuliah
4. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method
tersebut di class MatakuliahDemo untuk menampilkan data hasil inputan di layar
5. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari
array of object Matakuliah ditentukan oleh user melalui input dengan Scanner


## latihan 1
kode berada di file MataKuliah24.java dan MataKuliahMain24.java, berikut adalah screenshot nya

![Screenshot](image/ss1lat1.png)
![Screenshot](image/ss2lat1.png)
![Screenshot](image/ss3lat1.png)

**Penjelasan:** ada 6 tahap: 
1. Membuat class main
2. Instansiasi object
3. Input nilai atribut
4. Mengakses method
5. Menghitung jam tambahan dan pengurangan jam
6. output

## latihan 2 
kode berada di file Dosen24.java dan DosenMain24.java, berikut adalah screenshot nya

![Screenshot](image/ss1lat2.png)
![Screenshot](image/ss2lat2.png)
![Screenshot](image/ss3lat2.png)

**Penjelasan:** ada 7 tahap: 
1. Membuat class main
2. Instansiasi object
3. Input nilai atribut
4. Mengakses method
5. Memeriksa status
6. Menghitung lama kerja
7. output
