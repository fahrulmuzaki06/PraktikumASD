import java.util.Scanner;

public class RestoranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDouble antrian = new AntrianDouble();
        PesananDouble pesanan = new PesananDouble();
        int pilihan;

        antrian.addLast(new Pembeli("Ainra", "08224500000"));
        antrian.addLast(new Pembeli("Danra", "08224511111"));
        antrian.addLast(new Pembeli("Sanri", "08224522222"));

        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian (Manual)");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Input Pesan (Manual)");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String noHp = sc.nextLine();

                    Pembeli pembeliBaru = new Pembeli(nama, noHp);
                    antrian.addLast(pembeliBaru);
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    AntrianNode hapus = antrian.removeFirst();
                    
                    if (hapus != null) {
                        System.out.print("Kode Pesanan  : ");
                        int kodePsn = sc.nextInt();
                        sc.nextLine();
                        
                        System.out.print("Nama Pesanan  : ");
                        String namaPsn = sc.nextLine();
                        
                        System.out.print("Harga         : Rp ");
                        int hargaPsn = sc.nextInt();
                        sc.nextLine();

                        Pesanan pesananBaru = new Pesanan(kodePsn, namaPsn, hargaPsn);
                        
                        pesanan.addLast(pesananBaru);
                        
                        System.out.println("Sukses! " + hapus.data.namaPembeli + " telah memesan " + namaPsn);
                    } else {
                        System.out.println("Antrian Kosong");
                    }
                    break;
                case 4:
                    pesanan.printLaporan();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilihan != 0);
        
        sc.close();
    }
}