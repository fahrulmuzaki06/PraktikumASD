public class TugasSurat14 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public TugasSurat14(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilData() {
        System.out.printf("ID: %s | Nama: %s | Kelas: %s | Izin: %c | Durasi: %d hari\n", 
            idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
    }
}