package mainmahasiswa;
public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private String asal;
    private String hobi;
    
    public void setNama(String s){
        nama = s;
    }
    public void setNim  (String s){
        nim = s ;
    }
    public void setKelas(String s){
        kelas = s;
    }
    public void setAsal(String s){
        asal = s;
    }
    public void setHobi(String s){
        hobi = s;
    }
    public void displayMessage(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
        System.out.println("Asal : "+asal);
        System.out.println("Hobi : "+hobi);
    
    } 
}