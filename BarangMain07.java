package quiz;
import java.util.Scanner;
public class BarangMain07 {
    public static void main(String[] args) {
        Scanner sc07 =new Scanner(System.in);
        TransaksiBarang07 transaksiBarang = new TransaksiBarang07();
        Scanner sc22 = new Scanner(System.in);
        int input;
    
                do{
                    System.out.println("==========================");
                    System.out.println(" TOKO MAJU MUNDUR CANTIK ");
                    System.out.println("==========================");
                    System.out.println("1. Tampilkan Barang ");
                    System.out.println("2. Beli ");
                    System.out.println("3. Tampilkan Pembelian ");
                    System.out.println("4. Keluar ");
                    System.out.print("Pilih [1-4] : ");
                    input = sc22.nextInt();
                    sc22.nextLine();
    
                    switch(input){
                        case 1 :
                        transaksiBarang.tampilkanBarang();
                        break;
                        case 2 :
                        transaksiBarang.melakukanPembelian();
                        break;
                        case 3 :
                        transaksiBarang.tampilkanBarangPembelian();
                        break;
                        case 4 :
                        System.out.println("Terima kasih telah berbelanja!");
                        System.exit(0);
                        default :
                        System.out.println("Pilihan tidak valid!");
                    }
                } while (input != 0);
               
            
           
        
        }
    }
    