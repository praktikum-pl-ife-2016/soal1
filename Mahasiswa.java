
package mahasiswa;


public class Mahasiswa {

   private String nama;
    private int nim;
    private String alamat;
    private String kelas;
    private String jurusan;
    public void setnama(String s){
        nama = s;
    }
    public void setnim(int i){
        nim = i;
    }
    public void setalamat(String s){
        alamat = s;
    }
    public void setkelas(String s){
       kelas = s;
    }
    public void setjurusan(String s){
        jurusan = s;
    }
    public void displaymessage(){
        System.out.println("Seorang mahasiswa memiliki nama " + nama);
        System.out.println("dan memiliki NIM " + nim);
        System.out.println("beralamat di " + alamat);
        System.out.println("dia berkuliah jurusan " + jurusan);
        System.out.println("dan dia adalah anggota kelas " + kelas);
    }
}
        
    
    

