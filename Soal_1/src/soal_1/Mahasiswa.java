package soal_1;
public class Mahasiswa {

    public String nama;
    public String nim;
    public String fakultas;
    public String jurusan;
    public int angkatan;

    public void setNama(String s) {
        nama = s;
    }

    public void setnim(String s) {
        nim = s;
    }

    public void setfakultas(String s) {
        fakultas = s;
    }

    public void setjurusan(String s) {

        jurusan = s;
    }

    public void setangkatan(int i) {

        angkatan = i;
    }

    public void displayMessage() {
        System.out.println("Nama     :" + nama);
        System.out.println("NIM      :" + nim);
        System.out.println("Fakultas :" + fakultas);
        System.out.println("Jurusan  :" + jurusan);
        System.out.println("Angkatan :" + angkatan);
    }
}
