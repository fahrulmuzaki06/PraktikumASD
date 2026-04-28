import java.util.Scanner;
public class mahasiswaDEMO14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        mahasiswaBERprestasi14 list = new mahasiswaBERprestasi14(jumMhs);

        for(int i=0; i<jumMhs; i++){
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM : ");
            String nim = sc.nextLine();
            System.out.print("Nama : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------");
            list.tambah (new mahasisWa14(nim,nama, kelas, ipk));
        }
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("-------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list .sequentialSearching(cari);
        int pss=(int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari,pss);

        //melakukan pencarian data Binary
        System.out.println("--------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------");
        System.out.println("masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari2 = sc.nextDouble();

        System.out.println("--------------------------------");
        System.out.println("menggunakan binary searching");
        System.out.println("--------------------------------");
        double posisi2 = list.findBinarySearch(cari2,0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari2, pss2);
        list.tampilDataSearch(cari2, pss2);

        sc.close();
    }
    
}