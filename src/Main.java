public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM INFORMASI " + tenagaKesehatan.NAMA_RS + " ===");

        System.out.println("\n[Skenario 1: Uji Dokter]");
        Dokter drAndi = new Dokter("DKT-001", "Dr. Andi", "Penyakit Dalam");
        drAndi.infoPegawai();
        drAndi.terimaPasienDarurat(5);
        drAndi.cekJadwalJaga();
        drAndi.buatLaporan();

        System.out.println("\n[Skenario 2: Uji Perawat]");
        tindakanMedis nersSiti = new Perawat("PRW-022", "Siti Aminah", "Mawar");
        nersSiti.rawatPasien();

        if (nersSiti instanceof Perawat) {
            ((Perawat) nersSiti).infoPegawai();
            ((Perawat) nersSiti).cekJadwalJaga();
        }
    }
}