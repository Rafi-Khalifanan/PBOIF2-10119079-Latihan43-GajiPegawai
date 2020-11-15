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
public class GajiPegawai {
    private String nama,alamat;
    private int uangTransport,uangTunjangan,gajiPokok,totalGaji;
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public int getUangTransport(){
        return uangTransport;
    }
    
    public void setUangTransport(int uangTransport){
        this.uangTransport = uangTransport;
    }
    
    public int getUangTunjangan(){
        return uangTunjangan;
    }
    
    public void setUangTunjangan(int uangTunjangan){
        this.uangTunjangan = uangTunjangan;
    }
    
    public int getGajiPokok(){
        return gajiPokok;
    }
    
    public void setGajiPokok(int gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public int getTotalGaji(){
        
        return totalGaji;
    }
    
    public void setTotalGaji(int totalGaji){
        
        this.totalGaji = totalGaji;
    }
    
    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){ 
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
        return totalGaji;
    }
    
    public void tampilData(String nama, String alamat, int uangTunjangan, int uangTransport, int gajiPokok, int totalGaji){
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Uang Transport: " + uangTransport);
        System.out.println("Uang Tunjangan: "+ uangTunjangan);
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("TOTAL GAJI: " + totalGaji);
    }
}