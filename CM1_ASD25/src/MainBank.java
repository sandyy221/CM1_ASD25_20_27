import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicetransaksi service = new Servicetransaksi();
        bank b1 = new bank("2101091001", "Tiara Putri", "Desmawati", "0823746567", "tiara@gmail.com");
        bank b2 = new bank("2101091002", "Fahmi Ramadhan", "Rina Marlina", "0822736273", "fahmi@gmail.com");
        bank b3 = new bank("2101091003", "Rara Anjani", "Susi Susanti", "08127863783", "rara@gmail.com");

        transaksi t1 = new transaksi("T001", 2000000, 500000, 2500000, "2024-01-01", "debit", b1);
        transaksi t2 = new transaksi("T002", 2500000, 1000000, 1500000, "2024-01-02", "kredit", b1);
        transaksi t3 = new transaksi("T003", 1500000, 1000000, 2500000, "2024-01-03", "debit", b2);
        transaksi t4 = new transaksi("T004", 2500000, 1500000, 1000000, "2024-01-04", "kredit", b2);
        transaksi t5 = new transaksi("T005", 1000000, 2000000, 3000000, "2024-01-05", "debit", b3);
        transaksi t6 = new transaksi("T006", 3000000, 500000, 2500000, "2024-01-06", "kredit", b3);

        service.tambahTransaksi(t1);
        service.tambahTransaksi(t2);
        service.tambahTransaksi(t3);
        service.tambahTransaksi(t4);
        service.tambahTransaksi(t5);
        service.tambahTransaksi(t6);
 
        int pilihan;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Transaksi");
            System.out.println("2. Cari Transaksi berdasarkan Nama");
            System.out.println("3. Transaksi Minimum (Debit/Kredit)");
            System.out.println("4. Urutkan Transaksi berdasarkan Final Saldo (ASC)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    service.tampilSemuaTransaksi();
                    break;
                case 2:
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();
                    service.cariTransaksiNama(nama);
                    break;
                case 3:
                    System.out.print("Cari minimal (debit/kredit): ");
                    String tipe = sc.nextLine();
                    service.transaksiMinimum(tipe);
                    break;
                case 4:
                    service.urutkanFinalSaldoAsc();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia.");
            }
        } while (pilihan !=0);
    }
}
 


