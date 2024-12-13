import java.util.Scanner;

public class pemesananCafe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do{
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("fungsi tambah pesanan");
                    break;
                case 2:
                    System.out.println("fungsi tampil pesanan");
                    break;
                case 3: 
                System.out.println("Terimakasih!");
                break;
            
                default:
                System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}