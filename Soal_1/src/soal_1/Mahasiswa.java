
package Mahasiswa;

public class Mahasiswa {
    private String nama;
    private String programStudi;
    private String seleksi;
    private String alamat;
    private String asalKota;
    private String tanggalLahir;
    private int nim;
    private String status;
    
    public void setNama (String a) {
        nama = a;
    }
    public void setProgramStudi (String a) {
        programStudi = a;
    }
    public void setseleksi (String a) {
        seleksi = a;
    }
     public void setAlamat (String a) {
        alamat = a;
    }
     public void setAsalKota (String a){
         asalKota = a;
    }
    public void setTanggalLahir (String a) {
        tanggalLahir = a;
    }
    public void setNim (int a) {
        nim = a;
    }
    public void setStatus (String a){
        status = a;
    }
    
    public void displayMessage() {
        System.out.println("Nama :"+nama);
        System.out.println("ProgramStudi:"+programStudi);
        System.out.println("Seleksi:"+seleksi);
        System.out.println("Alamat :"+alamat);
        System.out.println("AsalKota:"+asalKota);
        System.out.println("TnggalLahir :"+tanggalLahir);
        System.out.println("NIM : "+nim);
        System.out.println("Status: "+status);
    }

}


    


        
    