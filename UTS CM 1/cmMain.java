import java.util.Scanner;
public class cmMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        Mahasiswa mhs[] = {
                new Mahasiswa("22001", "Andi", "Teknik Informatika"),
                new Mahasiswa("22002", "Budi", "Teknik Informatika"),
                new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku buku[] = {
                new Buku("B001", "Algoritma", 2020),
                new Buku("B002", "BasisData", 2019),
                new Buku("B003", "Pemrograman", 2021),
                new Buku("B004", "Fisika", 2024)
        };

        Peminjaman pinjam[] = {
                new Peminjaman(mhs[0], buku[0], 7),
                new Peminjaman(mhs[1], buku[1], 3),
                new Peminjaman(mhs[2], buku[2], 10),
                new Peminjaman(mhs[2], buku[3], 6),
                new Peminjaman(mhs[0], buku[1], 4)
        };

        do {
            System.out.println();
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan Judul Buku");
            System.out.println("6. Total Lama Peminjaman");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("\nDaftar Mahasiswa: ");
                    for (Mahasiswa m : mhs) {
                        m.tampil();
                    }
                    break;

                case 2:
                    System.out.println("\nDaftar Buku: ");
                    for (Buku b : buku) {
                        b.tampil();
                    }
                    break;

                case 3:
                    System.out.println("\nData Peminjaman: ");
                    for (Peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 4:
                    for (int i = 0; i < pinjam.length - 1; i++) {
                        for (int j = 0; j < pinjam.length - i - 1; j++) {
                            if (pinjam[j].denda < pinjam[j + 1].denda) {
                                Peminjaman temp = pinjam[j];
                                pinjam[j] = pinjam[j + 1];
                                pinjam[j + 1] = temp;
                            }
                        }
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for (Peminjaman p : pinjam) {
                        p.tampil();
                    }
                    break;

                case 5:
                    System.out.print("\nMasukkan Judul Buku: ");
                    String cari = input.next();

                    boolean ketemu = false;
                    for (Peminjaman p : pinjam) {
                        //Modifikasi B2 pencarian berdasarkan judu buku
                        if (p.buku.judul.equals(cari)) {
                            p.tampil();
                            ketemu = true;
                        }
                    }

                    if (!ketemu) {
                        System.out.println("Data tidak ketemu");
                    }
                    break;
                
                //Modifikasi C2 total lama peminjaman per mahasisw
                case 6:
                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals("22001")) {
                            p.totalLamaPinjamPerMahasiswa += p.lamaPinjam;
                        } else if (p.mhs.nim.equals("22002")) {
                            p.totalLamaPinjamPerMahasiswa += p.lamaPinjam;
                        } else if (p.mhs.nim.equals("22003")) {
                            p.totalLamaPinjamPerMahasiswa += p.lamaPinjam;
                        }
                    }
                    for (Peminjaman p : pinjam) {
                        if (p.mhs.nim.equals("22001")) {
                            p.tampilTotalLamaPinjamPerMahasiswa();
                            break;
                        }if (p.mhs.nim.equals("22002")) {
                            p.totalLamaPinjamPerMahasiswa += p.lamaPinjam;
                        } else if (p.mhs.nim.equals("22002")) {
                            p.tampilTotalLamaPinjamPerMahasiswa();
                            break;
                        } else if (p.mhs.nim.equals("22003")) {
                            p.totalLamaPinjamPerMahasiswa += p.lamaPinjam;
                        } else if (p.mhs.nim.equals("22003")) {
                            p.tampilTotalLamaPinjamPerMahasiswa();
                            break;
                        }
                    }
                    break;
            }

        } while (pilih != 0);
    input.close();
    }
}