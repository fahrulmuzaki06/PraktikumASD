public class AntrianDouble {
    AntrianNode head;
    AntrianNode tail;
    int counterAntrian = 1;

    public AntrianDouble(){
        head = null;
        tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addLast(Pembeli data){
        AntrianNode newNode = new AntrianNode(data, counterAntrian++);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (counterAntrian -1));
    }

    public AntrianNode removeFirst(){
        if (isEmpty()) {
            return null;
        } 

        AntrianNode removeNode = head;
        
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return removeNode;

    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
            return;
        }

        System.out.println("======================================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================================");
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");

        AntrianNode current = head;
        while (current != null) {
            System.out.printf("%-15d %-15s %-15s\n", current.noAntrian, current.data.namaPembeli, current.data.noHp);
            current = current.next;
        }
    }

    

}