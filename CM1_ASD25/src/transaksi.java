public class transaksi {
    public String kode, norek, tanggal, tipe;
    public double saldoAwal, nilaiTransaksi, saldoAkhir;

    public transaksi(String kode, String norek, double saldoAwal, double nilaiTransaksi, double saldoAkhir, String tanggal, String tipe) {
        this.kode = kode;
        this.norek = norek;
        this.saldoAwal = saldoAwal;
        this.nilaiTransaksi = nilaiTransaksi;
        this.saldoAkhir = saldoAkhir;
        this.tanggal = tanggal;
        this.tipe = tipe;
    }
}