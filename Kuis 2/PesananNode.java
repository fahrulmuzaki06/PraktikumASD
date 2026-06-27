public class PesananNode {
    Pesanan data;
    PesananNode next;
    PesananNode prev;
    
    public PesananNode(Pesanan data){
        this.data = data;
        this.next = null;
        this.prev = null;

    }
}