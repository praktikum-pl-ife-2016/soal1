
package mahasiswa;


public class Mahasiswa {
  String nama;
  String nim;
  String jurusan;
  String jumlhSks;
  String matKul;
  double ip;
  

    public void setNama(String a) {
        nama=a;
    }
    public void setNIM(String b) {
        nim=b;
    }
    public void setJurusan(String c) {
        jurusan=c;
    }
    public void setJumlhSks(String d) {
        jumlhSks=d;
    }
    public void setMatkul(String e) {
        matKul=e;
    }
    public void setIP(double f) {
        ip=f;
    }   
    public void displayMessage(){
     System.out.println("Nama Anda adalah "+nama);
     System.out.println("NIM = "+nim);
     System.out.println("Jurusan Anda adalah "+jurusan);
     System.out.println("Jumlah SKS = "+jumlhSks);
     System.out.println("Mata Kuliah Anda = "+matKul);
     System.out.println("IP = "+ip);
    
     }

    void setMatkul() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }

    


