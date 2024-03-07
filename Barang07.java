package quiz;

public class Barang07 {
    public String kode;
    public String nama;
    public int harga;
    public int stok;

    public Barang07(){

    }

    public Barang07(String kode2, String nama2, int harga2, int stok2){
        kode = kode2;
        nama = nama2;
        harga = harga2;
        stok = stok2;

    }
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
}
