package quiz;

import java.util.Scanner;
public class TransaksiBarang07{
    public Barang07 [] barangs = new Barang07[100];
    public Barang07 [] pembelians = new Barang07[100];
    public int jumlahBarang;
    public int jumlahPembelian;

    public TransaksiBarang07(){
        barangs[jumlahBarang++] = new Barang07("K01", "Sabun", 1000, 10);
        barangs[jumlahBarang++] = new Barang07("K02", "Pasta Gigi", 2000, 15);
        barangs[jumlahBarang++] = new Barang07("K03", "Biore", 3000, 27);
        barangs[jumlahBarang++] = new Barang07("K04", "Shampoo", 4000, 60);
        barangs[jumlahBarang++] = new Barang07("K05", "Sikat Gigi", 5000, 60);
    }
   
    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("     Daftar Barang       ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%-10s%n", "Kode", "Nama", "Harga", "Stok");
        for (int i = 0; i < jumlahBarang; i++) {
            Barang07 barang = barangs[i];
            System.out.printf("%-10s%-20s%-15.2f%-10d%n", barang.getKode(), barang.getNama(), barang.getHarga(), barang.getStok());
        }
    }
    public void tampilkanBarangPembelian() {
        System.out.println("=========================");
        System.out.println("     Daftar Pembelian    ");
        System.out.println("=========================");
        System.out.printf("%-10s%-20s%-15s%n", "Kode", "Nama", "Harga");
        for (int i = 0; i < jumlahPembelian; i++) {
            Barang07 barang = pembelians[i];
            System.out.printf("%-10s%-20s%-15.2f%n", barang.getKode(), barang.getNama(), barang.getHarga());
        }
    }
    public void melakukanPembelian() {
        Scanner sc07 = new Scanner(System.in);
        System.out.print("Masukkan kode barang: ");
        String kodeBarang = sc07.nextLine();

        Barang07 barangDibeli = null;
        for (int i = 0; i < jumlahBarang; i++) {
            Barang07 barang = barangs[i];
            if (barang.getKode().equals(kodeBarang)) {
                barangDibeli = barang;
                break;
            }
        }

        if (barangDibeli != null && barangDibeli.getStok() > 0) {
            pembelians[jumlahPembelian++] = barangDibeli;
            barangDibeli.setStok(barangDibeli.getStok() - 1);
            System.out.println("Pembelian berhasil!");
            System.out.print("Apakah akan belanja kembali(Y/N)? ");
            String pilih = sc07.nextLine();
            if (pilih.equals("y")) {
                melakukanPembelian();
            } else {
                System.out.println("Terima Kasih!");
            }
        } else {
            System.out.println("Barang tidak ditemukan atau stok habis.");
            melakukanPembelian();
        }
    }
    }


