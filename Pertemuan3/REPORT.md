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
2. Apa yang dilakukan oleh kode program berikut?
   Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[3];
3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new Mahasiswa24();
4. Apa yang dilakukan oleh kode program berikut?
        arrayOfMahasiswa[0] = new Mahasiswa24();
        arrayOfMahasiswa[0].nim = "254107020239";
        arrayOfMahasiswa[0].nama = "Okta";
        arrayOfMahasiswa[0].kelas = "TI 1F";
        arrayOfMahasiswa[0].Ipk = (float) 3.33;
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?



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
2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama
myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?

## 3.4. Constructor Berparameter
kode berada di file Mahasiswa24.java dan MahasiswaMain24.java, berikut adalah screenshot nya

![Screenshot](image/ss1per3.png)
![Screenshot](image/ss2per3.png)
![Screenshot](image/ss4per3.png)


**Penjelasan:** ada 5 tahap: 
1. Membuat Konstruktor default dan Konstruktor berparameter
2. Instansiasi object
3. Mengisi nilai atribut
4. Mengakses method
5. Output

## 2.3.3 Pertanyaan
1. Pada class Mahasiswa di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!
  Jawab:
  ![Screenshot](image/ss5per3.png)
2. Perhatikan class MahasiswaMain. Apa sebenarnya yang dilakukan pada baris program
berikut?
  Jawab:
  baris kode tersebut digunakan untuk instansiasi sebuah object menggunakan class yang menggunakan konstruktor berparameter
3. Hapus konstruktor default pada class Mahasiswa, kemudian compile dan run program.
Bagaimana hasilnya? Jelaskan mengapa hasilnya demikian!
  Jawab:
  ![Screenshot](image/ss6per3.png)
  hasilnya konstruktor is undefined karena kontruktor default tidak pernah dideklarasikan
4. Setelah melakukan instansiasi object, apakah method di dalam class Mahasiswa harus diakses
secara berurutan? Jelaskan alasannya!
   Jawab:
   method di dalam class Mahasiswa tidak harus diakses secara berurutan, method hanya perlu di akses ketika di perlukan 
5. Buat object baru dengan nama mhs<NamaMahasiswa> menggunakan konstruktor
berparameter dari class Mahasiswa!
   Jawab:
   ![Screenshot](image/ss7per3.png)
   ![Screenshot](image/ss8per3.png)


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
