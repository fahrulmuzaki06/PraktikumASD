import java.util.Scanner;
public class SSLMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SingleLinkdelist14 sll = new SingleLinkdelist14();

        MahasiswaaA14 mhs1 = new MahasiswaaA14("24212200", "Alvaro", "1A", 4.0);
        MahasiswaaA14 mhs2 = new MahasiswaaA14("23212201", "Bimon", "2B", 3.8);
        MahasiswaaA14 mhs3 = new MahasiswaaA14("22212202", "Cintia", "3C", 3.5);
        MahasiswaaA14 mhs4 = new MahasiswaaA14("21212203", "Dirga", "4D", 3.6);

        System.out.println("Masukkan Data Mahasiswa");
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("Kelas : ");
        String kelas = sc.nextLine();
        System.out.print("IPK : ");
        double ipk = sc.nextDouble();

        MahasiswaaA14 mhsBaru = new MahasiswaaA14(nim, nama, kelas, ipk);
        sll.addFirst(mhsBaru); 
        
        System.out.println("\nIsi Linked List setelah ditambah dari keyboard:");
        sll.print();

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();


        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();


        sc.close();

    }
}