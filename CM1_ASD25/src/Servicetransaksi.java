import java.util.*;

public class Servicetransaksi {
    List<transaksi> listTransaksi = new ArrayList<>();

    public void tambahTransaksi(transaksi t) {
        listTransaksi.add(t);
    }
    public void tampilSemuaTransaksi() {
        System.out.printf("%-10s %-12s %-10s %-15s %-15s %-15s %-10s\n", 
            "Kode", "No Rekening", "Saldo", "Debit/Kredit", "Final Saldo", "Tanggal", "Type");
        for (transaksi t : listTransaksi) {
            t.tampilDataTransaksi();
        }
    }
    public void cariTransaksiNama(String nama) {
        for (transaksi t : listTransaksi) {
            if (t.bankAcc.nama.equalsIgnoreCase(nama)) {
                t.tampilDataTransaksi();
            }
        }
    }  
    public void transaksiMinimum(String tipe) {
        transaksi min = null;
        for (transaksi t : listTransaksi) {
            if (t.type.equalsIgnoreCase(tipe)) {
                if (min == null || t.inOutSaldo < min.inOutSaldo) {
                    min = t;
                }
            }
        }
        if (min != null) {
            min.tampilDataTransaksi();
        } else {
            System.out.println("Transaksi " + tipe + " tidak ditemukan.");
        }
    }
    public void urutkanFinalSaldoAsc() {
        listTransaksi.sort(Comparator.comparingDouble(t -> t.finalSaldo));
        tampilSemuaTransaksi();
    }
}