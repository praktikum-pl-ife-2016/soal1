
package Mahasiswa;

public class Mahasiswa {
    private String nama;
    private String jurusan;
    private String asalKota;
    private String alamat;
    private String tanggalLahir;
    private int nim;
    
    public void setNama (String a) {
        nama = a;
    }
    public void setJurusan (String a) {
        jurusan = a;
    }
    public void setAsalKota (String a) {
        asalKota = a;
    }
     public void setAlamat (String a) {
        alamat = a;
    }
    public void setTanggalLahir (String a) {
        tanggalLahir = a;
    }
    public void setNim (int a) {
        nim = a;
    }
   
    public void displayMessage() {
        System.out.println("Nama :"+nama);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Asal Kota :"+asalKota);
        System.out.println("Tanggal Lahir:"+tanggalLahir);
        System.out.println("Alamat :"+alamat);
        System.out.println("NIM : "+nim);
        
  }
}
    

