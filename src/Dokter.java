public class Dokter extends tenagaKesehatan implements tindakanMedis, Administrasi {
    private String spesialisasi;

    public Dokter(String idPegawai, String nama, String spesialisasi) {
        super(idPegawai, nama);
        this.spesialisasi = spesialisasi;
    }

    public String getSpesialisasi() { return spesialisasi; }
    public void setSpesialisasi(String spesialisasi) { this.spesialisasi = spesialisasi; }

    @Override
    public void infoPegawai() {
        super.infoPegawai();
        System.out.println("Jabatan: Dokter Spesialis " + spesialisasi);
    }

    @Override
    public void rawatPasien() {
        System.out.println("Dokter " + getNama() + " sedang mendiagnosis dan memberikan resep obat.");
    }

    @Override
    public void buatLaporan() {
        System.out.println("Dokter mencatat rekam medis pasien ke dalam sistem.");
    }

    public void terimaPasienDarurat(int jumlahPasien) {
        if (jumlahPasien >= 3) {
            System.out.println("IGD penuh! Dokter dialihkan ke mode sibuk.");
            setSedangSibuk(true);
        } else {
            System.out.println("Kondisi IGD masih terkendali.");
            setSedangSibuk(false);
        }
    }

    @Override
    public void cekJadwalJaga() {
        if (isSedangSibuk()) {
            System.out.println("Dokter tidak bisa diganggu, sedang menangani pasien kritis.");
        } else {
            System.out.println("Dokter bersiap di poli " + spesialisasi + ".");
        }
    }
}