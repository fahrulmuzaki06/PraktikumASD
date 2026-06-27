import java.util.Scanner;
public class TugasMainSurat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasStackSurat14 st = new TugasStackSurat14(10); // Kapasitas 10 surat
        int pilih;

        do {
            System.out.println("\nMenu Layanan Surat Izin");
            System.out.println("1. Terima Surat Izin (Push)");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.println("0. Selesai");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kls = sc.nextLine();
                    System.out.print("Jenis Izin (L/P): ");
                    char jns = sc.next().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int dur = sc.nextInt();
                    
                    TugasSurat14 s = new TugasSurat14(id, nama, kls, jns, dur);
                    st.push(s);
                    break;

                case 2:
                    TugasSurat14 processed = st.pop();
                    if (processed != null) {
                        System.out.println("Surat berikut telah diproses/divalidasi:");
                        processed.tampilData();
                    }
                    break;

                case 3:
                    TugasSurat14 topSurat = st.peek();
                    if (topSurat != null) {
                        System.out.println("Surat teratas saat ini:");
                        topSurat.tampilData();
                    } else {
                        System.out.println("Belum ada surat masuk.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    st.cariSurat(cariNama);
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}