import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mk = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking and Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobot = new double[mk.length];

        double totalBobot = 0;

        System.out.println("=================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] >= 85) {
                nilaiHuruf[i] = "A";
                bobot[i] = 4.00;
            } else if (nilaiAngka[i] >= 75) {
                nilaiHuruf[i] = "B+";
                bobot[i] = 3.50;
            } else if (nilaiAngka[i] >= 70) {
                nilaiHuruf[i] = "B";
                bobot[i] = 3.00;
            } else if (nilaiAngka[i] >= 60) {
                nilaiHuruf[i] = "C+";
                bobot[i] = 2.50;
            } else if (nilaiAngka[i] >= 50) {
                nilaiHuruf[i] = "C";
                bobot[i] = 2.00;
            } else if (nilaiAngka[i] >= 40) {
                nilaiHuruf[i] = "D";
                bobot[i] = 1.00;
            } else {
                nilaiHuruf[i] = "E";
                bobot[i] = 0.00;
            }

            totalBobot += bobot[i];
        }

        double ip = totalBobot / mk.length;

        System.out.println("=================================");
        System.out.println("Hasl Konversi Nilai");
        System.out.println("=================================");

        System.out.printf("%-37s %-12s %-12s %-12s\n","MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-37s %-12.2f %-12s %-12.2f\n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], bobot[i]);
        }

        System.out.println("=================================");
        System.out.printf("IP : %.2f\n", ip);

        sc.close();
    }
}
