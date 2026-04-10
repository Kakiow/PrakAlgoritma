|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 6.2.   Mengimplementasikan Sorting menggunakan object

a. SORTING – BUBBLE SORT

kode berada di file Sorting24.java dan SortingMain24.java, berikut adalah output nya

```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

b. SORTING – SELECTION SORT

kode berada di file Sorting24.java dan SortingMain24.java, berikut adalah output nya

```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
Data awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

c. SORTING – INSERTION SORT

kode berada di file Sorting24.java dan SortingMain24.java, berikut adalah output nya

```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
Data awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 30 20 14 8 
Data awal 3
40 10 4 9 3 
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.2.5 Pertanyaan

1. Jelaskan fungsi kode program berikut
```
if (data[j-1]>data[j]) {
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
```
Jawab:
Untuk menukar nilai jika nilai kiri lebih besar dari nilai kanan, nilai kiri akan di pindah ke nilai kanan dan nilai kanan akan di pindah ke nilai kiri
2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
Jawab:
```
for (int j = 1; j < jumData; j++) {
                if (data[j]<data[min]) {
                    min=j;
                }
            }
```
3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
```
 while (j>=0 && data[j]>temp)
```
Jawab:
Untuk memastikan indeks kiri sudah di paling kiri dan memeriksa jika elemen kiri lebih besar dari elemen yang ada di temp
4. Pada Insertion sort, apakah tujuan dari perintah
```
data[j+1]=data[j];
```
Jawab:
Untuk memindahkan elemen kiri dengan nilai lebih besar ke kanan

## 6.3.   Sorting Menggunakan Array of Object

Mengurutkan Data Mahasiswa Berdasarkan IPK (Bubble Sort)

kode berada di file Mahasiswa24.java, MahasiswaBerprestasi24.java dan MahasiswaDemo24.java, berikut adalah output nya

```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-------------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
-------------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
-------------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
-------------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
-------------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
-------------------------
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.3.4 Pertanyaan

1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
```
for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
```
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
Jawab:
Agar nilai indeks paling kanan tidak perlu di cek, karena nilai indeks paling kanan pasti nilai yang paling besar
b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
Jawab:
Agar tidak perlu mengecek lagi indeks yang sudah di cek dan ada di posisi yang benar
c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
Jawab:
Perulangan i akan di ulang 49 kali dan tahap bubble sort yang ditempuh 49 kali
2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)
yang terdiri dari nim, nama, kelas, dan ipk!
Jawab:
```
package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner okta = new Scanner(System.in);
        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();

        int Mhs = 5;
        
        for (int i = 0; i < Mhs; i++) {
            System.out.println("Data mahasiswa ke-" + (i + 1));
            System.out.print("Nama:");
            String nama = okta.nextLine();
            System.out.print("NIM:");
            String nim = okta.nextLine();
            System.out.print("IPK:");
            double ipk = okta.nextDouble();
            okta.nextLine();
            System.out.print("Kelas:");
            String kelas = okta.nextLine();

            Mahasiswa24 m = new Mahasiswa24(nim, nama, kelas, ipk);

            list.tambah(m);
        }


        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}

```
```
Data mahasiswa ke-1
Nama:okta
NIM:123
IPK:3.9
Kelas:12B
Data mahasiswa ke-2
Nama:okta2
NIM:234
IPK:3.1
Kelas:12B
Data mahasiswa ke-3
Nama:okta3
NIM:124
IPK:3.8
Kelas:12B
Data mahasiswa ke-4
Nama:okta4
NIM:135
IPK:3.2
Kelas:12B
Data mahasiswa ke-5
Nama:okta5
NIM:245
IPK:3.7
Kelas:12B
Data mahasiswa sebelum sorting: 
Nama: okta
NIM: 123
Kelas: 12B
IPK: 3.9
-------------------------
Nama: okta2
NIM: 234
Kelas: 12B
IPK: 3.1
-------------------------
Nama: okta3
NIM: 124
Kelas: 12B
IPK: 3.8
-------------------------
Nama: okta4
NIM: 135
Kelas: 12B
IPK: 3.2
-------------------------
Nama: okta5
NIM: 245
Kelas: 12B
IPK: 3.7
-------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: okta
NIM: 123
Kelas: 12B
IPK: 3.9
-------------------------
Nama: okta3
NIM: 124
Kelas: 12B
IPK: 3.8
-------------------------
Nama: okta5
NIM: 245
Kelas: 12B
IPK: 3.7
-------------------------
Nama: okta4
NIM: 135
Kelas: 12B
IPK: 3.2
-------------------------
Nama: okta2
NIM: 234
Kelas: 12B
IPK: 3.1
-------------------------
```
Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

kode berada di file Mahasiswa24.java, MahasiswaBerprestasi24.java dan MahasiswaDemo24.java, berikut adalah output nya

```
Data mahasiswa ke-1
Nama:Ali
NIM:123
IPK:3.9
Kelas:2B
Data mahasiswa ke-2
Nama:ila
NIM:124
IPK:3.1
Kelas:2B
Data mahasiswa ke-3
Nama:agus
NIM:125
IPK:3.6
Kelas:2B
Data mahasiswa ke-4
Nama:tika
NIM:126
IPK:3.3
Kelas:2B
Data mahasiswa ke-5
Nama:udin
NIM:127
IPK:3.2
Kelas:2B
Data mahasiswa sebelum sorting: 
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
-------------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
-------------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
-------------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
-------------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
-------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
-------------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
-------------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
-------------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
-------------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
-------------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
-------------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
-------------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
-------------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
-------------------------
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
-------------------------
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.3.7 Pertanyaan

Di dalam method selection sort, terdapat baris program seperti di bawah ini:
```
int idxMin=i;
            for (int j =i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
```
Untuk apakah proses tersebut, jelaskan!
Jawab:
Untuk mencari indeks dengan nilai paling kecil, dengan cara indeks paling kiri dianggap punya nilai paling kecil dan di bandingkan
satu-satu, jika ada indeks yang nilai nya lebih kecil posisi nya akan ditukar

Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

kode berada di file Sorting24.java dan SortingMain24.java, berikut adalah output nya

```
Data mahasiswa ke-1
Nama:ayu
NIM:111
IPK:3.7
Kelas:2c
Data mahasiswa ke-2
Nama:dika
NIM:222
IPK:3.0
Kelas:2c
Data mahasiswa ke-3
Nama:ila
NIM:333
IPK:3.8
Kelas:2c
Data mahasiswa ke-4
Nama:susi
NIM:444
IPK:3.1
Kelas:2c
Data mahasiswa ke-5
Nama:yayuk
NIM:555
IPK:3.4
Kelas:2c
Data mahasiswa sebelum sorting: 
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
-------------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
-------------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
-------------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
-------------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
-------------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
-------------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
-------------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
-------------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
-------------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
-------------------------
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
-------------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
-------------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
-------------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
-------------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
-------------------------
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
-------------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
-------------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
-------------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
-------------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
-------------------------
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 6.4.3 Pertanyaan

Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.
Jawab:
```
void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa24 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk<temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
```


## latihan praktikum
kode berada di file Dosen24.java, DataDosen24.java dan DosenMain24.java, berikut adalah output nya
```
package Praktikum05;

public class Dosen24 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen24 (String kd, String name,Boolean jk, int age){
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampil(){
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }
}
```
```
package Praktikum05;

public class DataDosen24 {
    Dosen24 [] dataDosen= new Dosen24[10];
    int idx;
    
    void tambah(Dosen24 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx]=dsn;
            idx++;
        }else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Dosen24 data : dataDosen) {
            data.tampil();
            System.out.println("-----------------------");
        }
    }

    void SortingASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia>dataDosen[j-1].usia) {
                    Dosen24 tmp = dataDosen[j];
                    dataDosen[j]=dataDosen[j-1];
                    dataDosen[j-1]=tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            int idxMin=i;
            for (int j =i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia<dataDosen[idxMin].usia) {
                    idxMin=j;
                }
            }
            Dosen24 tmp = dataDosen[idxMin];
            dataDosen[idxMin]=dataDosen[i];
            dataDosen[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen24 temp = dataDosen[i];
            int j=i;
            while (j>0 && dataDosen[j-1].usia<temp.usia) {
                dataDosen[j]=dataDosen[j-1];
                j--;
            }
            dataDosen[j]=temp;
        }
    }
}

```
```
Pilih menu 
1. tambah data 
2. tampilkan data 
3. Sorting ASC data dosen termuda ke dosen tertua 
4. Sorting DSC data dosen tertua ke dosen termuda 
1
Kode: 123
Nama: dosen1
Jenis Kelamin: true
Usia: 70
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
