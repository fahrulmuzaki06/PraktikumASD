public class Mmahasiswa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    //Konstraktor default
    Mmahasiswa14() {
    }

    //Konstraktor berparameter (dibuat ada yang nama var parameter inputnya sama ada atau tidak)
    Mmahasiswa14(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    
    void tampilinformasi() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK : " + ipk);
    }
    
}
