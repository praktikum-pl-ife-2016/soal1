public class Mahasiswa {
    private String nama;
    private String nim;
    private double IP;
    private String jurusan;
    private String asal;
    
    public void setnama(String s){
        nama = s;
    }
    public void setnim(String a){
        nim = a;
    }
    public void setIP(double b){
        IP = b;
    }
    public void setAsal(String c){
        asal = c;
    }
    public void setJurusan(String d){
        jurusan = d;
    }
    public void Tampilan(){
 System.out.println("Nama anda adalah "+nama);
 System.out.println("Nim anda adalah "+nim);
 System.out.println("memililki IP "+IP);
 System.out.println("Jurusan anda adalah "+jurusan);
 System.out.println("Asal daerah anda adalah "+asal);   
    }
}
