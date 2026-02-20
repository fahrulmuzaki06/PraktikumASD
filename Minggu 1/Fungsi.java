public class Fungsi {
    static int[] harga = {75000, 50000, 60000, 10000};

    static int[][] stok = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}    
    };

    public static void main(String[] args) {
        System.out.println("Pendapatan Setiap Cabang (Jika Semua Terjual):");
        System.out.println("==============================================");
        tampilkanPendapatanDanStatus();
    }

    public static void tampilkanPendapatanDanStatus() {
        for (int i = 0; i < stok.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatanCabang += stok[i][j] * harga[j];
            }
            
            String status = (pendapatanCabang > 1500000) ? "Sangat Baik" : "Perlu Evaluasi";
            
            System.out.printf("RoyalGarden %d : Rp %,d | Status: %s\n", (i + 1), pendapatanCabang, status);
        }
    }
}