/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

public class Mahasiswa {
private String nama;
    private String nim;
    private String kelas;
    private String absen;
    private String fakultas;
    
    public void setNama(String r) {
        nama = r;
    }
    public void setNim(String s) { 
        nim = s;
    }
    public void setKelas(String t) {
        kelas = t;
    }
    public void setAbsen(String u) {
        absen = u;
    }
    public void setFakultas(String v) {
        fakultas = v;
    }
    public void displayMessage() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Kelas     : " + kelas);
        System.out.println("Absen     : " + absen);
        System.out.println("Fakultas  : " + fakultas);
    }
}
   

