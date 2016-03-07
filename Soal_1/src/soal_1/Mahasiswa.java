
public class Mahasiswa {
    public String nama;
    public String nim;
    public String asal;
    public int angkatan;
    public String namadosen;
    
    public String setNama (String a){
        nama = a;
        return nama;
    }
    
    public String setNim (String b){
        nim = b;
        return nim;
    }
    
    public String setAsal (String c){
        asal = c;
        return asal;
    }
    
    public int setAngkatan (int d){
        angkatan = d;
        return angkatan;
    }
    
    public String setNamadosen (String e){
        namadosen = e;
        return namadosen;
    }
    
    public void TampilData(){
        System.out.println("Nama anda : " + nama);
        System.out.println("Nim anda : " + nim);
        System.out.println("Asal anda : " + asal);
        System.out.println("Angkatan anda : " + angkatan);
        System.out.println("Nama Dosen anda : " + namadosen);
    }
}
