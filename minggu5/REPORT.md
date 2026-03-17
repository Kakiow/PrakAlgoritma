|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.2.  Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

kode berada di file Mahasiswa24.java, berikut adalah screenshot nya

```
Masukkan nilai: 
5
Nilai faktorial 5menggunakan BF: 120
Nilai faktorial 5menggunakan DC: 120
```



**Penjelasan:** ada 3 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method

## 5.2.3 Pertanyaan

1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
perbedaan bagian kode pada penggunaan if dan else!
Jawab:
Penggunaan if digunakan sebagai base case, jika nilai tersebut sudah mencapai base case maka perulangan akan berhenti, else digunakan untuk memecah masalah
menjadi lebih kecil dengan tema masalah yang sama sepeti masalah awal
2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan
for? Buktikan!
Jawab:
Karena method faktorialBF() menggunakan perulangan maka perulangan if dalam method faktorialBF() bisa di ganti dengan while atau do while
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
Jawab:
fakto *= i adalah sebuah perulangan dimana nilai dari variabel fakto akan digantikan langsung dengan nilai dari operasi tersebut. int fakto = n * faktorialDC(n-1);
adalah sebuah fungsi rekursif nilai dari variabel fakto harus menunggu hasil dari operasi faktorialDC(n-1) terlebih dulu baru nilai dari variabel fakto akan terisi
4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
Jawab:
method faktorialBF() bekerja dengan cara lansung mengalikan angka dengan angka berikut nya, method faktorialDC()! bekerja dengan cara memecah masalah menjadi lebih
kecil dulu kemudian memberi solusi kepada masalah yang telah di pecah menjadi lebih kecil tersebut


## 5.3. Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
kode berada di file MahasiswaMain24.java, berikut adalah screenshot nya
```
Masukkan jumlah elemen: 3
Masukkan nilai baris elemen ke-1: 2
Masukkan nilai pangkat elemen ke-1: 3
Masukkan nilai baris elemen ke-2: 4
Masukkan nilai pangkat elemen ke-2: 5
Masukkan nilai baris elemen ke-3: 6
Masukkan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTEFORCE:
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER
2^3: 8
4^5: 1024
6^7: 279936
```

**Penjelasan:** ada 5 tahap: 
1. Membuat class main
2. Instansiasi object
3. Input nilai atribut
4. Mengakses method
5. output

## 5.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
Jawab:
Method pangkatBF() mengalikan angka satu per satu, method pangkatDC() memecah masalah menjadi lebih kecil dulu kemudian memberi solusi kepada masalah yang sudah
dipecah
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
Jawab:
Tahap combine sudah termasuk dalam kode di dalam method pangkatDC(), angka akan di kalikan dengan basis angka tersebut sehingga akan menjadi tahap combine
3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan
dan pangkat berapa, padahal di sisi lain di class Pangkat telah ada atribut nilai dan pangkat,
apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa
jika method tersebut dibuat dengan tanpa parameter? Jika bisa, seperti apa method
pangkatBF() yang tanpa parameter?
Jawab:
Method tersebut tidak relevan untuk memiliki parameter jika kita melakukan input basis dan pangkat secara langsung karena jika menggunakan parameter maka akan terjadi
pengulangan data,method tersebut dapat dibuat dengan tanpa parameter dengan cara langsung mengakses basis dan pangkat yang telak kita input
4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
Jawab:
Method pangkatBF() bekerja dengan cara langsung mengalikan basis dengan pangkat nya secara urut, method pangkatDC() bekerja dengan cara membagi pangkat nya dulu
menjadi lebih kecil hingga sama dengan satu kemudian akan mengalikan dengan nilai pangkat itu sendiri

## 5.4. Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
kode berada di file Mahasiswa24.java dan MahasiswaMain24.java, berikut adalah screenshot nya
```
Masukkan jumlah elemen: 
5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan Bruteforce: 150.0
Total keuntungan menggunakan Divide and conquer: 150.0
```


**Penjelasan:** ada 5 tahap: 
1. Membuat Konstruktor default dan Konstruktor berparameter
2. Instansiasi object
3. Mengisi nilai atribut
4. Mengakses method
5. Output

## 5.4.3 Pertanyaan
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
4. Apakah base case dari totalDC()?
5. Tarik Kesimpulan tentang cara kerja totalDC()


## latihan 1
kode berada di file MataKuliah24.java dan MataKuliahMain24.java, berikut adalah screenshot nya
```
package Pertemuan3;

public class Dosen24 {
    String kode;
    String nama;
    Boolean JenisKelamin;
    int usia;

    public Dosen24(String kode, String nama, Boolean JenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.JenisKelamin = JenisKelamin;
        this.usia = usia;
    }
}
```
```
package Pertemuan3;

import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        String nama,kode,jeniskel;
        int usia;
        boolean JenisKelamin;

        Dosen24[] arrayDosen = new Dosen24[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen Ke- " + (i + 1));
            System.out.print("Kode                 :");
            kode = okta.nextLine();
            System.out.print("Nama                 :");
            nama = okta.nextLine();
            System.out.print("Jenis Kelamin        :");
            jeniskel = okta.nextLine();
            JenisKelamin = jeniskel.equalsIgnoreCase("Pria");
            System.out.print("Usia                 :");
            usia= okta.nextInt();
            okta.nextLine();

            arrayDosen[i] = new Dosen24(kode, nama, JenisKelamin, usia);
        }

        int i = 1;
        for (Dosen24 data : arrayDosen) {
            System.out.println("Data Dosen Ke-" + i);
            System.out.println("Kode                 :" + data.kode);
            System.out.println("Nama                 :" + data.nama);
            System.out.println("Jenis Kelamin        :" + (data.JenisKelamin ? "Pria" : "wanita"));
            System.out.println("Usia                 :" + data.usia);
            i++;
        }
    }
}
```
```
Masukkan Data Dosen Ke- 1
Kode                 :test
Nama                 :test
Jenis Kelamin        :pria
Usia                 :23
Masukkan Data Dosen Ke- 2
Kode                 :test2
Nama                 :test2
Jenis Kelamin        :wanita
Usia                 :34
Masukkan Data Dosen Ke- 3
Kode                 :test3
Nama                 :test3
Jenis Kelamin        :wanita
Usia                 :32
Data Dosen Ke-1
Kode                 :test
Nama                 :test
Jenis Kelamin        :Pria
Usia                 :23
Data Dosen Ke-2
Kode                 :test2
Nama                 :test2
Jenis Kelamin        :wanita
Usia                 :34
Data Dosen Ke-3
Kode                 :test3
Nama                 :test3
Jenis Kelamin        :wanita
Usia                 :32
```

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
