import java.util.Scanner;

public class RestoranMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianDouble antrian = new AntrianDouble();
        PesananDouble pesanan = new PesananDouble();
        int pilihan;

        Pesanan[] dataPesanan = {
            new Pesanan(123, "Es Teler", 5000),
            new Pesanan(124, "Mie Goreng", 34000),
            new Pesanan(125, "Es Degan", 6000),
            new Pesanan(126, "Nasi Goreng", 25000)
        };
        int indexPesanan = 0;

        do {
            System.out.println("\n======================================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("======================================");
            System.out.println("1. Tambah Antrian (Input Manual)");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan No HP Pembeli: ");
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
                        if (indexPesanan < dataPesanan.length) {
                            pesanan.addLast(dataPesanan[indexPesanan]);
                            System.out.println(hapus.data.namaPembeli + " telah memesan " + dataPesanan[indexPesanan].namaPesanan);
                            indexPesanan++;
                        } else {
                            System.out.println(hapus.data.namaPembeli + " selesai dilayani (Tidak ada data pesanan tersisa)");
                        }
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