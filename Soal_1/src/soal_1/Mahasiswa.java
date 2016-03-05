package tugas;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String fakultas;
    private String jurusan ;
    private int umur ;
    public void setNama(String s){
        nama = s;
    }
    public void setNim(String s){
        nim = s;
    }
    public void setFakultas(String s){
        fakultas = s;
    }
    public void setJurusan(String s){
        jurusan = s; 
    }
    public void setUmur(int i){
       umur = i;
    }
    public void displayMessage(){
        System.out.println("Nama Anda : "+ nama);
        System.out.println("NIM Anda :  "+nim);
        System.out.println("Fakultas Anda "+fakultas);
        System.out.println("Jurusan Anda : "+jurusan);
        System.out.println("Umur Anda : "+umur);
    }
}
