package tester;

public class Mahasiswa{
   private String nama;
   private String nim;
   private String fakultas;
   private String jurusan;
   private String alamat;
   
   public void setnama(String s){
       nama = s;
   }
   
   public void setnim(String s){
       nim = s;
   }
   
   public void setfakultas(String s){
       fakultas = s;
   }
   
   public void setjurusan(String s){
       jurusan = s;
   }
   
   public void setalamat(String s){
       alamat = s;
   }
   
   public void displayMessage(){
        System.out.println("Nama Mahasiswa : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("Fakultas : "+ fakultas);
        System.out.println("Jurusan : "+jurusan);
        System.out.println("Alamat : "+alamat);
        System.out.println("_________________________");
}
}
