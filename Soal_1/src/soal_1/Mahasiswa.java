package mahasiswa;
public class Mahasiswa {
    private String nama, nim, hobi;
    private int tinggi, berat;
    
    public void setNama (String s) {
        nama = s;
    }
    public void setNim (String s) {
        nim = s;
    }
    public void setTinggi (int i) {
        tinggi = i;
    }
    public void setBerat (int i) {
        berat = i;
    }
    public void setHobi (String s) {
        hobi = s;
    }
    public void displayMessage() {
        System.out.println("Nama Anda adalah "+nama);
        System.out.println("Anda memiliki NIM "+nim);
        System.out.println("Tinggi badan Anda "+tinggi+" cm");
        System.out.println("Berat badan Anda "+berat+" kg");
        System.out.println("Hobi Anda "+hobi);
    }
    
}
