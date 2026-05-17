package P2Jobsheet10;

public class Antrian24 {
    Mahasiswa24[] data;
    int front;
    int rear;
    int size;
    int max;
    int sudah;
    int jumlah = 30;

    public Antrian24(int max) {
        this.max = max;
        this.data = new Mahasiswa24[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } else {
            System.out.print("Antrian: ");
            int jumlah;
            if (size >= 2) {
                jumlah = 2;
            } else {
                jumlah = 1;
            }
            for (int i = 0; i < jumlah; i++) {
                int index = (front + i) % max;
                System.out.println("Antrian ke-" + (i + 1) + ": ");
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa24 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public void cetak() {
        int belum = jumlah - sudah;
        System.out.println("---------------------");
        System.out.println("1. Jumlah antrian: " + size);
        System.out.println("2. Total sudah KRS: " + sudah);
        System.out.println("3. Total belum KRS: " + belum);
    }

    public void ProsesKRS() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
            return;
        }
        int jumlah;
        if (size >= 2) {
            jumlah = 2;
        } else {
            jumlah = 1;
        }
        for (int i = 0; i < jumlah; i++) {
            Mahasiswa24 mhs = data[front];
            System.out.println("Mahasiswa ke-" + (i + 1));
            mhs.tampilkanData();
            front = (front + 1) % max;
            size--;
            sudah++;
        }
    }

    public void LihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong.");
        } else {
            System.out.println("Antrian Belakang: ");
            data[rear].tampilkanData();
        }
    }
}
