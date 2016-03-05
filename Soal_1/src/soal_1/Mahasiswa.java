/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soal_1;

/**
 *
 * @author Rizal
 */
public class Mahasiswa {

    private String nama;
    private String nim;
    private String umur;
    private String kelamin;
    private String fakultas;

    public void setNama(String s) {
        nama = s;
    }

    public void setNim(String s) {
        nim = s;
    }

    public void setUmur(String s) {
        umur = s;
    }

    public void setKelamin(String s) {
        kelamin = s;
    }

    public void setFakultas(String s) {
        fakultas = s;
    }

    public void displayMessage() {
        System.out.println("Nama Mahasiswa  " + nama);
        System.out.println("NIM Mahasiswa " + nim);
        System.out.println("Umur Mahasiswa " + umur);
        System.out.println("Jenis Kelamin Mahasiswa " + kelamin);
        System.out.println("Fakultas Mahasiswa " + fakultas);
    }

}
