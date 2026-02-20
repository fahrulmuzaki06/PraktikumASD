import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double tugas, kuis, uts, uas;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=========================");

        System.out.print("Masukkan nilai tugas : ");
        tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis  : ");
        kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS   : ");
        uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS   : ");
        uas = sc.nextDouble();

        if (tugas < 0 || tugas > 100 ||
            kuis < 0 || kuis > 100 ||
            uts < 0 || uts > 100 ||
            uas < 0 || uas > 100) {
            System.out.println("=========================");
            System.out.println("=========================");
            System.out.println("nilai tidak valid");
            System.out.println("=========================");
            System.out.println("=========================");
            return;
        }

        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

        String nilaiHuruf;

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        System.out.println("=========================");
        System.out.println("=========================");

        System.out.println("Nilai Akhir :" + nilaiAkhir);
        System.out.println("Nilai Huruf :" + nilaiHuruf);

        System.out.println("=========================");
        System.out.println("=========================");

        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") ||
            nilaiHuruf.equals("C")) {

            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
    }
}