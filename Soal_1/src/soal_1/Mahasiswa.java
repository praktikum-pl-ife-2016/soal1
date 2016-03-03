package tugasasprak;

public class mahasiswa {
public String nama;
public String nim;
public String kelas;
public String fakultas;
public String jurusan;
public void setnama(String s){
nama = s;
}
public void setnim(String s){
nim = s;
}
public void setkelas(String s){
kelas = s;
}
public void setfakultas(String i){fakultas = i;
}
public void setjurusan (String s){ jurusan = s;};
public void displayMessage(){
System.out.println("Nama anda adalah " + nama);
System.out.println("NIM anda " + nim);
System.out.println("Anda adalah anggota kelas " + kelas);
System.out.println("Fakultas " + fakultas);
System.out.println("Jurusan " + jurusan);
}}
