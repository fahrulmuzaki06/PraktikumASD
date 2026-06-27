public class MahasiswaaA14 {
    String nim, nama, kelas;
    double ipk;

    public MahasiswaaA14(){

    }

    public MahasiswaaA14(String nm, String name, String kls, double ip ){
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilkanInformasi(){
      System.out.println(nama + "\t\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}