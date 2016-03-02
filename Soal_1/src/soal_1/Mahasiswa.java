package soal_1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private String angkatan;
    private String noHp;
    Mahasiswa(){}
    public void setNama(String s){
        nama = s;
    }
    public void setNim(String s){
        nim = s;
    }
    public void setKelas(String s){
        kelas = s;
    }
    public void setAngkatan(String s){
        angkatan = s;
    }
    public void setNoHp(String s){
        noHp = s;
    }
    public void display(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM  : "+nim);
        System.out.println("Kelas :" +kelas);
        System.out.println("Angkatan : "+ angkatan);
        System.out.println("No HP : "+ noHp);
    }
}
