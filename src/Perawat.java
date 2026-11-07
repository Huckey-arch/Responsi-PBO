public class Perawat extends tenagaKesehatan implements tindakanMedis {
    private String ruang;

    public Perawat(String idPegawai, String nama, String ruang) {
        super(idPegawai, nama);
        this.ruang = ruang;
    }

    public String getRuang() { return ruang; }
    public void setRuang(String ruang) { this.ruang = ruang; }

    @Override
    public void infoPegawai() {
        super.infoPegawai();
        System.out.println("Jabatan: Perawat ruang " + ruang);
    }

    @Override
    public void rawatPasien() {
        System.out.println("Perawat " + getNama() + " memeriksa tensi dan mengganti infus pasien.");
    }

    @Override
    public void cekJadwalJaga() {
        System.out.println("Perawat sedang patroli di ruang " + ruang + ".");
    }
}