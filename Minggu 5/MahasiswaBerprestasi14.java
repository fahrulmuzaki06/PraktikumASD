public class MahasiswaBerprestasi14 {
    Mmahasiswa14 [] listMhs = new Mmahasiswa14 [5];
    int idx;
    void tambah(Mmahasiswa14 m){
        if (idx<listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");

        }
    }

    void tampil(){
        for (Mmahasiswa14 m : listMhs){
            m.tampilinformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i=0; i<listMhs.length-1; i++){
            for (int j=1; j<listMhs.length-i; j++){
                if (listMhs[j].ipk > listMhs[j - 1].ipk){
                    Mmahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxMin].ipk) {
                    idxMin = j;
                }
            }
            Mmahasiswa14 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
}
