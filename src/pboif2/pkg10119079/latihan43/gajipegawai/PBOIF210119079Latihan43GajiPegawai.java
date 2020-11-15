package pboif2.pkg10119079.latihan43.gajipegawai;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan43GajiPegawai {
    public static void main(String[] args) {
        GajiPegawai gaji = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU###");
        System.out.println("----------------------------------------");
        gaji.setNama("Rizki Adam Kurniawan");
        gaji.setAlamat("Jalan Semar dlm 4 No 72/66");
        gaji.setUangTransport(250000);
        gaji.setUangTunjangan(300000);
        gaji.setGajiPokok(4500000);
        gaji.setTotalGaji(gaji.totalGaji(gaji.getUangTunjangan(),
                                         gaji.getUangTransport(),
                                         gaji.getGajiPokok()));
        gaji.tampilData(gaji.getNama(),
                        gaji.getAlamat(),
                        gaji.getUangTransport(),
                        gaji.getUangTunjangan(),
                        gaji.getGajiPokok(),
                        gaji.getTotalGaji());       
    }
    
}