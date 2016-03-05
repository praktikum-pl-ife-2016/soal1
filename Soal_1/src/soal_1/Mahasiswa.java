
public class Mahasiswa {
    public String nama;
    public String nim;
    public String email;
    public String telp;
    public String tglLahir;
    
    public String setNama (String a){
        nama = a;
        return nama;
    }
    
    public String setNim (String a){
        nim = a;
        return nim;
    }
    
    public String setEmail (String a){
        email = a;
        return email;
    }
    
    public String setTelp (String a){
        telp = a;
        return telp;
    }
    
    public String setTgl (String a){
        tglLahir = a;
        return tglLahir;
    }
    
    public void TampilData(){
        System.out.println("Nama anda : " + nama);
        System.out.println("Nim anda : " + nim);
        System.out.println("Email anda : " + email);
        System.out.println("Nomor Telepon anda : " + telp);
        System.out.println("Tanggal Lahir anda : " + tglLahir);
    }
}
