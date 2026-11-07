public abstract class tenagaKesehatan {
    public static final String NAMA_RS = "Rumah Sakit Jenderal Soedirman";

    private final String idPegawai;
    private String nama;
    private boolean sedangSibuk;

    public tenagaKesehatan(String idPegawai) {
        this.idPegawai = idPegawai;
        this.nama = "Belum terdaftar";
        this.sedangSibuk = false;
    }

    public tenagaKesehatan(String idPegawai, String nama) {
        this.idPegawai = idPegawai;
        this.nama = nama;
        this.sedangSibuk = false;
    }

    public String getIdPegawai() { return idPegawai; }
    public String getNama() { return nama; }
    public boolean isSedangSibuk() { return sedangSibuk; }

    public void setNama(String nama) { this.nama = nama; }
    public void setSedangSibuk(boolean status) { this.sedangSibuk = status; }

    public abstract void cekJadwalJaga();

    public void infoPegawai() {
        System.out.println("ID: " + idPegawai + " | Nama: " + nama);
    }
}