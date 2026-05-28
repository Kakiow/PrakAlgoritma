package CM2;

public class DoubleLinkedListAntrian24 {
    NodeAntrian24 head;
    NodeAntrian24 tail;
    int antri = 1;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAntrian(String nama, String noHp) {
        Pembeli24 beli = new Pembeli24(nama, noHp, antri);
        NodeAntrian24 newNode = new NodeAntrian24(beli);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + antri);
        antri++;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("===============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("===============================");
        System.out.printf("%-12s  %-15s  %-15s\n", "No Antrian", "Nama", "No Hp");
        NodeAntrian24 current = head;
        while (current != null) {
            System.out.printf("%-12d  %-15s  %-15s\n", current.data.antrian, current.data.namaPembeli, current.data.NoHp);
            current = current.next;
        }
    }

    public Pembeli24 removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Pembeli24 hapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return hapus;
    }
}
