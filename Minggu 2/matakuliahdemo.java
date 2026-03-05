public class matakuliahdemo {
    public static void main(String[] args) {

        matakuliah mk1 = new matakuliah("IF101", "Algoritma", 3, 6);
        matakuliah mk2 = new matakuliah("IF102", "Struktur Data", 3, 6);

        System.out.println("Data Mata Kuliah");
        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();

        // mengubah SKS
        mk1.ubahSKS(4);

        // menambah jam
        mk1.tambahJam(2);

        // mengurangi jam
        mk1.kurangiJam(1);

        System.out.println("Setelah Perubahan");
        mk1.tampilkanInformasi();
    }
}