|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.2.  Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer

kode berada di file Faktorial24.java dan MainFaktorial24.java, berikut adalah output nya

```
Masukkan nilai: 
5
Nilai faktorial 5menggunakan BF: 120
Nilai faktorial 5menggunakan DC: 120
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

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
kode berada di file Pangkat24.java dan MainPangkat24.java, berikut adalah outputnya nya
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

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

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
kode berada di file sum24.java dan MainSum24.java, berikut adalah output nya
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


**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
## 5.4.3 Pertanyaan
1. Kenapa dibutuhkan variable mid pada method TotalDC()?
Jawab:
Variabel mid digunakan sebagai pembagi antara indeks bagian kiri dan indeks bagian kanan agar ke dua bagian indeks bisa dipecah menjadi lebih kecil
2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
Jawab:
double lsum = totalDC(arr, l, mid); digunakan untuk menghitung nilai indeks bagian kiri sampai indeks tengah,double rsum = totalDC(arr, mid+1, r); digunakan untuk menghitung nilai indeks bagian tengah hingga kanan
3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
Jawab:
return lsum+rsum; adalah sebuah tahap combine dimana semua hasil perhitungan nilai indeks kiri hingga tengah dan nilai indeks tengah hingga kanan di jadikan satu
4. Apakah base case dari totalDC()?
Jawab:
Base case dari totalDC() adalah ketika nilai dari indeks kiri sama dengan nilai indeks kanan
5. Tarik Kesimpulan tentang cara kerja totalDC()
Jawab:
Membagi antara nilai indeks kiri hingga tengah dan nilai indeks tengah hingga kanan, hingga nilai dari indeks kiri sama dengan nilai dari indeks kanan, kemudian menyatukan antara hasil perhitungan indeks kiri hingga tengah dan indeks tengah hingga kanan


## latihan 1
kode berada di file Nilai24.java dan MainNilai24.java, berikut adalah output nya
```
package minggu5;

public class Nilai24 {
    
    public int TertinggiDC(int[] arr, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return arr[rendah];
        }
        int mid = (rendah + tinggi) / 2;

        int l = TertinggiDC(arr, rendah, mid);
        int r = TertinggiDC(arr, mid + 1, tinggi);

        if (l > r) {
            return l;
        } else {
            return r;
        }
    }

    public int TerendahDC(int[] arr, int rendah, int tinggi) {
        if (rendah == tinggi) {
            return arr[rendah];
        }
        int mid = (rendah + tinggi) / 2;
        
        int l = TerendahDC(arr, rendah, mid);
        int r = TerendahDC(arr, mid + 1, tinggi);

        if (l < r) {
            return l;
        } else {
            return r;
        }
    }

    public double ratarataBF(int[] arr) {
        double nilai = 0;
        for (int i = 0; i < arr.length; i++) {
            nilai += arr[i];
        }
        return nilai / arr.length;
    }
}

```
```
package minggu5;

public class MainNilai24 {
    
    public static void main(String[] args) {
        int[] UTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] UAS = {82, 88, 87, 79, 95, 85, 83, 84};

        Nilai24 nilai = new Nilai24();

        int Tertinggi = nilai.TertinggiDC(UTS, 0, UTS.length - 1);
        System.out.println("Nilai UTS Tertinggi: " + Tertinggi);

        int Terendah = nilai.TerendahDC(UTS, 0, UTS.length - 1);
        System.out.println("Nilai UTS Terendah: " + Terendah);

        double rata = nilai.ratarataBF(UAS);
        System.out.println("Rata-rata UAS: " + rata);
    }
}

```
```
Nilai UTS Tertinggi: 92
Nilai UTS Terendah: 76
Rata-rata UAS: 85.375
```

**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
