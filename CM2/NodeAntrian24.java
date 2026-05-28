package CM2;

public class NodeAntrian24 {
    Pembeli24 data;
    NodeAntrian24 prev;
    NodeAntrian24 next;

    public NodeAntrian24(Pembeli24 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
