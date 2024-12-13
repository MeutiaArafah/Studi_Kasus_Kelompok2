import java.util.Scanner;

public class pemesananCafe {
    
    static String[][] daftarPesanan = new String[100][5];
    static int jumlahPesanan = 0;

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
                    System.out.println("tambah pesan");;
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


    static void tambahkanPesanan(Scanner scanner) {
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan nomor meja: ");
        int nomorMeja = scanner.nextInt();

        int totalHargaPesanan = 0;
        while (true) {
            System.out.println("\n===== MENU KAFE =====");
            System.out.println("1. Kopi Hitam - Rp 15000");
            System.out.println("2. Latte - Rp 22000");
            System.out.println("3. Teh Tarik - Rp 12000");
            System.out.println("4. Mie Goreng - Rp 18000");
            System.out.print("Pilih menu (masukkan nomor menu, atau 0 untuk selesai): ");

            int pilihanMenu = Integer.parseInt(scanner.nextLine());

            if (pilihanMenu == 0) {
                break;
            }

            String namaMenu = "";
            int hargaMenu = 0;

            if (pilihanMenu == 1) {
                namaMenu = "Kopi Hitam";
                hargaMenu = 15000;
            } else if (pilihanMenu == 2) {
                namaMenu = "Latte";
                hargaMenu = 22000;
            } else if (pilihanMenu == 3) {
                namaMenu = "Teh Tarik";
                hargaMenu = 12000;
            } else if (pilihanMenu == 4) {
                namaMenu = "Mie Goreng";
                hargaMenu = 18000;
            } else {
                System.out.println("Menu tidak valid.");
                continue;
            }
            System.out.print("Masukkan jumlah item untuk " + namaMenu + ": ");
            int jumlahItem = Integer.parseInt(scanner.nextLine());

            if (jumlahItem <= 0) {
                System.out.println("Jumlah item harus lebih dari 0.");
                continue;
            }

        }
    }

}
}