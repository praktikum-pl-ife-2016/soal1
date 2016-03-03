package soal_1;

public class mahasiswa {
    private String nama;
    private String nim;
    private String gender;
    private String kelas;
    private int angkatan;
    
    public void setNama(String a){
        nama = a;
    }
    public void setNim(String a){
        nim = a;
    }
    public void setGender(String a){
        gender = a;
    }
    public void setKelas(String a){
        kelas = a;
    }
    public void setAngkatan(int b){
        angkatan = b;
    }
    public void display(){
     
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jenis Kelamin : " + gender);
        System.out.println("Kelas : " + kelas);
        System.out.println("Angkatan Tahun : " + angkatan);
        System.out.println("");
    }
            
}


