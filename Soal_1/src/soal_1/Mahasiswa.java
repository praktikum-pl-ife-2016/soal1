package soal_1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private int absen;
    private int angkatan;
    
    public void setNama (String s) {
        nama = s;
    }
    
    public void setNim (String s) {
        nim = s;
    }
    
    public void setKelas (String s) {
        kelas = s;
    }
    
    public void setAbsen (int x) {
        absen = x;
    }
    
    public void setAngkatan (int x) {
        angkatan = x;
    }
    
    public void displayMessage() {
        System.out.println("Nama: " +nama);
        System.out.println("NIM: " +nim);
        System.out.println("Kelas: " +kelas);
        System.out.println("Absen: " +absen);
        System.out.println("Angkatan: " +angkatan);
    }

}
