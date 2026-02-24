import java.util.Scanner;
public class Tugas2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah jadwal (n): ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal);
        tampilkanSemua(jadwal);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        cariBerdasarkanHari(jadwal, sc.nextLine());

        System.out.print("\nCari jadwal berdasarkan nama matkul: ");
        cariBerdasarkanMatkul(jadwal, sc.nextLine());
    }

    public static void inputJadwal(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Input Jadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah: "); data[i][0] = sc.nextLine();
            System.out.print("Ruang      : "); data[i][1] = sc.nextLine();
            System.out.print("Hari       : "); data[i][2] = sc.nextLine();
            System.out.print("Jam        : "); data[i][3] = sc.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] data) {
        System.out.println("\nDAFTAR SELURUH JADWAL:");
        System.out.printf("%-20s | %-15s | %-10s | %-15s\n", "Mata Kuliah", "Ruang", "Hari", "Jam");
        for (String[] baris : data) {
            System.out.printf("%-20s | %-15s | %-10s | %-15s\n", baris[0], baris[1], baris[2], baris[3]);
        }
    }

    public static void cariBerdasarkanHari(String[][] data, String hari) {
        boolean found = false;
        for (String[] baris : data) {
            if (baris[2].equalsIgnoreCase(hari)) {
                System.out.println("- " + baris[0] + " di " + baris[1] + " jam " + baris[3]);
                found = true;
            }
        }
        if (!found) System.out.println("Tidak ada jadwal di hari " + hari);
    }

    public static void cariBerdasarkanMatkul(String[][] data, String matkul) {
        boolean found = false;
        for (String[] baris : data) {
            if (baris[0].equalsIgnoreCase(matkul)) {
                System.out.println("- Ruang: " + baris[1] + ", Hari: " + baris[2] + ", Jam: " + baris[3]);
                found = true;
            }
        }
        if (!found) System.out.println("Mata kuliah " + matkul + " tidak ditemukan.");
    }
}