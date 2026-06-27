public class AntrianNode {
    Pembeli data;
    int noAntrian;
    AntrianNode next;
    AntrianNode prev;

    public AntrianNode(Pembeli data, int noAntrian){
        this.data = data;
        this.noAntrian = noAntrian;
        this.next = null;
        this.prev = null;
    }

}