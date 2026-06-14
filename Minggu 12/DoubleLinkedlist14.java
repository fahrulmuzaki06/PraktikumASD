public class DoubleLinkedlist14 {
    NNode14 head;
    NNode14 tail;

    public DoubleLinkedlist14(){
        head = null;
        tail = null;

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(MmMahasiswa14 data){
        NNode14 newNode = new NNode14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;    
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(MmMahasiswa14 data){
        NNode14 newNode = new NNode14(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, MmMahasiswa14 data){
        NNode14 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        NNode14 newNode = new NNode14(data);

        // jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //node baru disisipkan ditengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);

        
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }

        NNode14 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        NNode14 current = tail;
        System.out.println("data dicetak dari belakang kedepan");
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        MmMahasiswa14 dataDihapus = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data berhasil dihapus:");
        dataDihapus.tampil();
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list masih kosong");
            return;
        }

        MmMahasiswa14 dataDihapus = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus:");
        dataDihapus.tampil();
    }


}