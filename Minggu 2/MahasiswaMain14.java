public class MahasiswaMain14 {
    
    public static void main(String[] args) {
        
        Mahasiswa14 mhs1 = new Mahasiswa14();
        
        mhs1.nama = "Fahrul Muzaki Sasmito";
        mhs1.nim = "254107020210";
        mhs1.kelas = "SI 1c";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2C");
        mhs1.updateIpk(4.11);
        mhs1.tampilkanInformasi();

        Mahasiswa14 mhs2 = new Mahasiswa14 ("Annisa Nabila","2141720160", 3.25, "T1 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa14 mhs3 = new Mahasiswa14 ("Deandra Rangga", "2541756327", 3.41, "T1 1C");
        mhs3.tampilkanInformasi();
        

        
    }
    
}
