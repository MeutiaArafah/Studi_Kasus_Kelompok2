import java.util.Scanner;

public class pemesananCafe {
    // nama pelanggan
    static String[][] daftarPesanan = new String[100][5];
    static int jumlahPesanan = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Daftar Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahkanPesanan(scanner);
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

    static void tambahkanPesanan(Scanner scanner) {
        System.out.print("\nMasukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();
        System.out.print("Masukkan nomor meja: ");
        int nomorMeja = scanner.nextInt();

        System.out.println("\n===== MENU KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15000");
        System.out.println("2. Latte - Rp 22000");
        System.out.println("3. Teh Tarik - Rp 12000");
        System.out.println("4. Mie Goreng - Rp 18000");

        String namaMenu;
        int hargaMenu, jumlahItem, totalHarga = 0, totalSemuaPesanan = 0;

        while (true) {
            System.out.print("\nPilih menu (masukkan nomor menu, atau 0 untuk selesai): ");
            int pilihanMenu = scanner.nextInt();

            if (pilihanMenu == 0) {
                System.out.println("\nPesanan berhasil ditambahkan");
                break;
            }

            switch (pilihanMenu) {
                case 1:
                    namaMenu = "Kopi Hitam";
                    hargaMenu = 15000;
                    break;
                case 2:
                    namaMenu = "Latte";
                    hargaMenu = 22000;
                    break;
                case 3:
                    namaMenu = "Teh Tarik";
                    hargaMenu = 12000;
                    break;
                case 4:
                    namaMenu = "Mie Goreng";
                    hargaMenu = 18000;
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    continue;
            }
            System.out.print("Masukkan jumlah item untuk " + namaMenu + ": ");
            jumlahItem = scanner.nextInt();

            if (jumlahItem <= 0) {
                System.out.println("Silakan input jumlah item ulang");
                continue;
            }

            totalHarga = hargaMenu * jumlahItem;
            totalSemuaPesanan += totalHarga;

            daftarPesanan[jumlahPesanan][0] = namaPelanggan; 
            daftarPesanan[jumlahPesanan][1] = String.valueOf(nomorMeja); 
            daftarPesanan[jumlahPesanan][2] = namaMenu; 
            daftarPesanan[jumlahPesanan][3] = String.valueOf(jumlahItem); 
            daftarPesanan[jumlahPesanan][4] = String.valueOf(totalHarga); 
            jumlahPesanan++;
        }
        System.out.println("Total harga pesanan: Rp " + totalSemuaPesanan);

    }
    static void tampilkanDaftarPesanan() { 
        System.out.println("\n===== DAFTAR PESANAN ====="); 
        for (int i = 0; i < jumlahPesanan; i++) { 
            System.out.println("Nama Pelanggan: " + daftarPesanan[i][0]); 
            System.out.println("Nomor Meja: " + daftarPesanan[i][1]); 
            System.out.println("Detail Pesanan:"); 

            // Menampilkan detail pesanan 
            for (int j = i; j < jumlahPesanan; j++) { 
                if (daftarPesanan[i][0].equals(daftarPesanan[j][0])) { 
                    System.out.printf("- %s x %s = Rp %s\n", 
                        daftarPesanan[j][2], // Nama Menu
                        daftarPesanan[j][3], // Jumlah Item
                        daftarPesanan[j][4]); // Total Harga
                }
            }
            // Menghitung total harga pesanan 
            int totalHargaPesanan = 0; 
            for (int j = i; j < jumlahPesanan; j++) { 
                if (daftarPesanan[i][0].equals(daftarPesanan[j][0])) { 
                        totalHargaPesanan += Integer.parseInt(daftarPesanan[j][4]); 
                    } 
                } 
                        System.out.println("Total Harga Pesanan: Rp " + totalHargaPesanan); 
                        System.out.println("------------------------------"); 
                    } 
                }
            }   