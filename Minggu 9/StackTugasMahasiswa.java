public class StackTugasMahasiswa {
    Mahasisswa14[] stack;
    int size;
    int top;

    public StackTugasMahasiswa(int size) {
        this.size = size;
        stack = new Mahasisswa14[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasisswa14 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasisswa14 pop() {
        if (!isEmpty()) {
            Mahasisswa14 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasisswa14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Tidak ada tugas di dalam tumpukan.");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }

    public Mahasisswa14 peekBottom() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        System.out.println("Stack kosong!");
        return null;
    }
    }

    public int getJumlahTugas() {
    return top + 1;
    }

    public String konversiDesimalKebiner(int nilai){
            StackKonversi14 stack = new StackKonversi14(32);
            while (nilai > 0){
                int sisa = nilai % 2;
                stack.push(sisa);
                nilai = nilai / 2;

            }
            String biner = new String();
            while (!stack.isEmpty()){
                biner +=  stack.pop();
            }
            return biner;
        }
}