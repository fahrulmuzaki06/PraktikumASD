public class ProdukDemo14 {
    public static void main(String[] args) {
        Produk14 [] arrayOfProduk = new Produk14[4];
        arrayOfProduk[0] = new Produk14();
        arrayOfProduk[0].nama14 = "Beras";
        arrayOfProduk[0].harga14 = 75000;
        arrayOfProduk[0].stok14 = 23;
        arrayOfProduk[0].diskon14 = 5;

        arrayOfProduk[1] = new Produk14();
        arrayOfProduk[1].nama14 = "Gula";
        arrayOfProduk[1].harga14 = 17500;
        arrayOfProduk[1].stok14 = 58;
        arrayOfProduk[1].diskon14 = 5;

        arrayOfProduk[2] = new Produk14();
        arrayOfProduk[2].nama14 = "Roti";
        arrayOfProduk[2].harga14 = 22000;
        arrayOfProduk[2].stok14 = 26;
        arrayOfProduk[2].diskon14 = 2;

        arrayOfProduk[3] = new Produk14();
        arrayOfProduk[3].nama14 = "Susu";
        arrayOfProduk[3].harga14 = 12000;
        arrayOfProduk[3].stok14 = 64;
        arrayOfProduk[3].diskon14 = 3;

        for (int i =0; i < 4; i++) {
            arrayOfProduk[i].tampilkanInfo();
            arrayOfProduk[i].hitungHargaDiskon();
            System.out.println("------------------------------------");
        }

    }

}
