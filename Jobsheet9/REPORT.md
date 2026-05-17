|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020239|
| Nama |  Oktavian Kusuma Alghifari |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/Kakiow/PrakAlgoritma.git) |

# Labs #9 STACK

## 2.1   Mahasiswa Mengumpulkan Tugas

kode berada di file Mahasiswa24.java, StackTugasMahasiswa24.java dan MahasiswaDemo24.java, berikut adalah output nya

```
Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: 
okta
NIM: 
12345
Kelas: 
TI 1F

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 5
        at Jobsheet9.StackTugasMahasiswa24.pop(StackTugasMahasiswa24.java:41)
        at Jobsheet9.MahasiswaDemo24.main(MahasiswaDemo24.java:31)
```



**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.1.3 Pertanyaan

1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana yang perlu diperbaiki?
```
public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
```
```
case 1:
                    System.out.println("Nama: ");
                    String nama = okta.nextLine();
                    System.out.println("NIM: ");
                    String nim = okta.nextLine();
                    System.out.println("Kelas: ");
                    String kelas = okta.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nama, nim, kelas);
                    stack.push(mhs);
                    break;
```
yang perlu diperbaiki adalah nilai dari top, dan memanggil fungsi push di main nya.
2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan
kode programnya!
banyak data yang bisa di tampung dalam stack adalah 5 sesuai dengan instansiasi object nya
```
StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);
```
3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut
dihapus, apa dampaknya?
Pengecekan kondisi isFull perlu untuk memastikan stack penuh atau tidak agar tidak terjadi outofbound, jika kondisi if else di hapus akan terjadi outofbound karena akan mengisi data diluar dari batas array
4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga
pengguna juga dapat melihat mahasiswa yang pertama kali mengumpulkan tugas melalui operasi
lihat tugas terbawah!
```
public Mahasiswa24 pertama() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }
```
```
case 5:
                    Mahasiswa24 pertama = stack.pertama();
                    if (pertama != null) {
                        System.out.println("Tugas pertama: " + pertama.nama);
                    }
                    break;
```
5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat
ini, serta tambahkan operasi menunya!
```
public int JumlahTugas() {
        return top + 1;
    }
```
```
case 6:
                    System.out.println("Jumlah Tugas: " + stack.JumlahTugas());
                    break;
```
## 2.2.   Konversi Nilai Tugas ke Biner

kode berada di file  Mahasiswa24.java, StackTugasMahasiswa24.java, MahasiswaDemo24.java dan StackKonversi24.java, berikut adalah output nya

```
Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Pengumpul Tugas Pertama
6. Jumlah Tugas
Pilih: 1
Nama: 
okta
NIM: 
12345
Kelas: 
TI 1F

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Pengumpul Tugas Pertama
6. Jumlah Tugas
Pilih: 2
Menilai tugas dari okta
Masukkan nilai (0-100): 85
Nilai Tugas okta adalah 85
Nilai Biner Tugas: 1010101

Menu
1. Mengumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Pengumpul Tugas Pertama
6. Jumlah Tugas
Pilih:
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya

## 2.2.3 Pertanyaan
1. Jelaskan alur kerja dari method konversiDesimalKeBiner!
Membuat object kemudian cek kondisi jika nilai lebih dari 0, nilai akan dibagi dua hasil sisa bagi masuk ke stack, jika stack tidak kosong akan mengeluarkan isi stack
2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0),
bagaimana hasilnya? Jelaskan alasannya!
```
public String konversiDesimalKeBiner(int nilai) {
        StackKonversi24 stack = new StackKonversi24();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
```
hasilnya sama selama nilai nya positif, tapi jika nilai nya negatif maka hitung nilai tetap dilakukan dan tidak akan berhenti karena akan menjauhi dari 0

## 2.4.   Tugas

kode berada di file Surat24.java, StackSurat24.java dan SuratMain24.java, berikut adalah output nya

```
Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
Pilih: 1
Id Surat: 
1
Nama Mahasiswa: 
okta
Kelas: 
TI 1F
Jenis Izin: 
s
Durasi: 
2

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
Pilih: 3
Surat izin terakhir oleh okta

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
Pilih: 4
Nama yang dicari: okta
Data okta ada

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
Pilih: 2
Proses surat 1Dengan nama okta

Menu
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
Pilih:
```
**Penjelasan:** ada 4 tahap: 
1. Membuat class
2. Deklarasi atribut
3. Deklarasi method
4. Membuat class main nya dan mengakses method nya
