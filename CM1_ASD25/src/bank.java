public class bank {
    String noRekening;
    String nama;
    String namaIbu;
    String noHp;
    String email;

    public bank(String noRekening, String nama, String namaIbu, String noHp, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.noHp = noHp;
        this.email = email;
    }

    public void tampilDataNorek() {
        System.out.printf("%-15s %-10s %-12s %-15s %-20s\n", noRekening, nama, namaIbu, noHp, email);
    }
}