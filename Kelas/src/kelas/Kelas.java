
public class Kelas {
    String nama, kelas, nim, tempatLahir, tanggalLahir;
    
    public void setNama(String ay){
        nama = ay;
    }
    public void setKelas (String ay){
        kelas = ay;
    }
    public void setTempatLahir (String ay){
        tempatLahir = ay;
    }
    public void setNim (String ay){
        nim = ay;
    }
    public void setTanggalLahir(String ay){
        tanggalLahir = ay;
    }
    public void diprint (){
        System.out.println("Nama \t: "+nama);
        System.out.println("Kelas \t: "+kelas);
        System.out.println("NIM \t: "+nim);
        System.out.println("Tempat Lahir : "+tempatLahir);
        System.out.println("Tangga Lahir : "+tanggalLahir);
    }
}
