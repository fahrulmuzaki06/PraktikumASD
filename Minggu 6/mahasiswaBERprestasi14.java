class mahasiswaBERprestasi14 {
    mahasisWa14 [] listMhs = new mahasisWa14 [5];
    int idx;


    mahasiswaBERprestasi14(int jumlah){
        listMhs = new mahasisWa14[jumlah];
    }
    
    void tambah (mahasisWa14 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil(){
        for (mahasisWa14 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++){
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right <= left){
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk){
                return (mid);
            }
            else if (listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK: " +x+ " ditemukan pada indeks " + pos);
        }    
        else {
            System.out.println("data " +x+ "data tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1){
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
    }
}