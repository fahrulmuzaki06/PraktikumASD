public class TugasStackSurat14 {
    int size, top;
    TugasSurat14[] data;

    public TugasStackSurat14(int size) {
        this.size = size;
        this.data = new TugasSurat14[size];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(TugasSurat14 s) {
        if (!isFull()) {
            top++;
            data[top] = s;
        } else {
            System.out.println("Stack penuh! Tidak dapat menerima surat lagi.");
        }
    }

    public TugasSurat14 pop() {
        if (!isEmpty()) {
            TugasSurat14 s = data[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public TugasSurat14 peek() {
        if (!isEmpty()) {
            return data[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        if (isEmpty()) {
            System.out.println("Stack kosong.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.print("Surat ditemukan: ");
                data[i].tampilData();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}