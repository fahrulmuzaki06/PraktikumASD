class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int denda;
    String kategoriDenda;
    int totalLamaPinjamPerMahasiswa;


    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int batas = 5;
        int tarif = 2000;

        if (lamaPinjam > batas) {
            int terlambat = lamaPinjam - batas;
            denda = terlambat * tarif;
            //Modifikasi A2 kategori denda
            kategoriDenda = denda <= 5000 ? "Ringan" : denda <= 10000 ? "Sedang" : "Berat";
        } else {
            denda = 0;
            kategoriDenda = "Tidak Ada";
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda + " | Kategori: " + kategoriDenda);
    }

    void tampilTotalLamaPinjamPerMahasiswa() {
        
        System.out.println("Total Lama Pinjam: " + totalLamaPinjamPerMahasiswa + " hari");
    }
}