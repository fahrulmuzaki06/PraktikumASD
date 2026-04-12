public class MahasiswaDemo14 {
    public static void main(String[] args) {
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14();
        Mmahasiswa14 m1 = new Mmahasiswa14("123", "Jidan", "2A", 3.2);
        Mmahasiswa14 m2 = new Mmahasiswa14("124", "Ayu", "2A", 3.5);
        Mmahasiswa14 m3 = new Mmahasiswa14("125", "Sofi", "2A", 3.1);
        Mmahasiswa14 m4 = new Mmahasiswa14("126", "Sita", "2A", 3.9);
        Mmahasiswa14 m5 = new Mmahasiswa14("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Dta mahasiswa setelah sorting berdasarkan ipk (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        list.selectionSort();
        list.tampil();

    }
    
}
