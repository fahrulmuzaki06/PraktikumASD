public class Produk14 {
    public String nama14;
    public double harga14;
    public int stok14;
    public double diskon14;

    void tampilkanInfo() {
        System.out.println("Nama Produk     : " + nama14);
        System.out.println("Harga           : " + harga14);
        System.out.println("Stok            : " + stok14);
        System.out.println("Diskon          : " + diskon14 + "%");
    }
    void hitungHargaDiskon() {
        double hargaDiskon14 = harga14 - (harga14 * diskon14 / 100);
        System.out.println("Harga Diskon    : " + hargaDiskon14);
    }
}

