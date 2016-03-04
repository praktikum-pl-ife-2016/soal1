package soal_1;

public class mahasiswa {

    public String nama;
    public String nim;
    public int umur;
    public String fakultas;
    public String jurusan;

    public void setNama(String s) {
        nama = s;

    }

    public void setNim(String s) {
        nim = s;
    }

    public void setUmur(int u) {
        umur = u;
    }

    public void setFakultas(String s) {
        fakultas = s;

    }

    public void setJurusan(String s) {
        jurusan = s;
    }

    public void displayData() {
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Umur : " + umur);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Jurusan : " + jurusan);

    }
}
