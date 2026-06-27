public class mahasisWa14 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    mahasisWa14(){
        
    }
    
    mahasisWa14(String nm, String name, String kls, double ip){
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilInformasi(){
        System.out.println("nama: " + nama);
        System.out.println("nim: " + nim);
        System.out.println("kelas: " + kelas);
        System.out.println("ipk: " + ipk);
    }
}