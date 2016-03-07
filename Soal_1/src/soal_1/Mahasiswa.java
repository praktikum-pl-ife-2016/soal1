package Mahasiswa;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String fakultas;
    private String jurusan;
    private String angkatan;
    
    
    public void setNama(String a){
        nama = a;
    }
    public void setNim(String a){
        nim = a;
    }
    public void setFakultas(String a){
        fakultas = a;
    }
    public void setJurusan(String a){
        jurusan = a;
    }
    public void setAngkatan(String a){
        angkatan = a;
    }
    public void displayMessage(){
        System.out.println("Nama anda : "+nama);
        System.out.println("Nim anda : "+nim);
        System.out.println("Fakultas anda : "+fakultas);
        System.out.println("Jurusan anda : "+jurusan);
        System.out.println("Angkatan anda : "+angkatan);
    }   
}
