public class transaksi {
    public class Transaksi {
        String kodeTransaksi;
        double saldo;
        double inOutSaldo;
        double finalSaldo;
        String tanggalTransaksi;
        String type;
        bank bankAcc;
    
        public Transaksi(String kodeTransaksi, double saldo, double inOutSaldo, double finalSaldo, 
                         String tanggalTransaksi, String type, bank bankAcc) {
            this.kodeTransaksi = kodeTransaksi;
            this.saldo = saldo;
            this.inOutSaldo = inOutSaldo;
            this.finalSaldo = finalSaldo;
            this.tanggalTransaksi = tanggalTransaksi;
            this.type = type;
            this.bankAcc = bankAcc;
        }
    
        public void tampilDataTransaksi() {
            System.out.printf("%-10s %-15s %-10.2f %-10.2f %-10.2f %-15s %-10s\n",
                kodeTransaksi, bankAcc.noRekening, saldo, inOutSaldo, finalSaldo, tanggalTransaksi, type);
        }
    }
}
