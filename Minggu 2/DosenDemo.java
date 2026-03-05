public class DosenDemo {
    public static void main(String[] args) {

        Dosen dosen1 = new Dosen("D001", "Aisyah Kamila", true, 2018, "Algoritma");
        Dosen dosen2 = new Dosen();
        dosen2.idDosen = "D002";
        dosen2.nama = "Akmal Ahmad Ghozali";
        dosen2.statusAktif = true;
        dosen2.tahunBergabung = 2020;
        dosen2.bidangKeahlian = "Basis Data";

        dosen1.tampilkanInformasi();
        dosen2.tampilkanInformasi();
        dosen2.setStatusAktif(false);
        int masaKerja = dosen1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja " + dosen1.nama + " : " + masaKerja + " tahun");
        dosen1.ubahKeahlian("Struktur Data");

        System.out.println("\nSetelah perubahan:");
        dosen1.tampilkanInformasi();
    }
}