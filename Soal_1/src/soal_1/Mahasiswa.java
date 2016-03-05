public class Mahasiswa {
    private String nama;
    private String nim;
    private String kelas;
    private int angkatan;
    private String asal;
    
    public void setnama(String s){
        nama = s;
    }
    public void setnim(String a){
        nim = a;
    }
    public void setkelas(String b){
        kelas = b;
    }
    public void setasal(String c){
        asal = c;
    }
    public void setangkatan(int d){
        angkatan = d;
    }
    public void Tampilan(){
 System.out.println("Nama anda adalah "+nama);
 System.out.println("Nim anda adalah "+nim);
 System.out.println("kelas anda "+ kelas);
 System.out.println("Angkatan anda adalah "+angkatan);
 System.out.println("Asal daerah anda adalah "+asal);   
    }
}
