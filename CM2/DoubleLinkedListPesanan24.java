package CM2;

public class DoubleLinkedListPesanan24 {
    NodePesanan24 head;
    NodePesanan24 tail;
    int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kodePesanan, String namaPesanan, int harga, int antrian) {
        Pesanan24 pesan = new Pesanan24(kodePesanan, namaPesanan, harga, antrian);
        NodePesanan24 newNode = new NodePesanan24(pesan);
        
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void ururtanPesanan() {
        if (isEmpty()) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            NodePesanan24 current = head;

            for (int j = 0; j < size - 1 - i; j++) {
                if (current.next != null) {
                    if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                        Pesanan24 temp = current.data;
                        current.data = current.next.data;
                        current.next.data = temp;
                    }
                    current = current.next;
                }
            }
        }
    }

    public void laporPesanan() {
        if (isEmpty()) {
            return;
        }
        ururtanPesanan();
        System.out.println("==========================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("==========================================");
        System.out.printf("%-15s  %-10s  %-10s\n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan24 current = head;
        while (current != null) {
            System.out.printf("%-15s  %-10s  %-10s\n", current.data.kodePesanan, current.data.namaPesanan, current.data.harga);
            current = current.next;
        }
    }
}
