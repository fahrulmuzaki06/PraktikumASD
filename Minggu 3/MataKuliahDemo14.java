import java.util.Scanner;
public class MataKuliahDemo14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah : ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        MataKuliah14[] arrayOfMataKuliah14 = new MataKuliah14[jumlah];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < jumlah; i++) {

            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));

            System.out.print("Kode : ");
            kode = sc.nextLine();

            System.out.print("Nama : ");
            nama = sc.nextLine();

            System.out.print("SKS : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);

            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);

            System.out.println("------------------------------");

            arrayOfMataKuliah14[i] = new MataKuliah14("", "", 0, 0);
            arrayOfMataKuliah14[i].tambahData(kode, nama, sks, jumlahJam);
        }

        System.out.println("\nDATA MATA KULIAH");

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah14[i].cetakInfo();
        }

        sc.close();
    }
}