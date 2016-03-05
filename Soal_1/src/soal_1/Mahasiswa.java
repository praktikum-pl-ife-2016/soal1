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
    private String kota;
    private String gender;
    private String fakultas;

    public void setNama(String s) {
        nama = s;
    }

    public void setNim(String s) {
        nim = s;
    }

    public void setkota(String s) {
        kota = s;
    }

    public void setGender(String s) {
        gender = s;
    }

    public void setFakultas(String s) {
        fakultas = s;
    }

    public void displayMessage() {
        System.out.println("Nama Mahasiswa  " + nama);
        System.out.println("NIM Mahasiswa " + nim);
        System.out.println("Umur Mahasiswa " + kota);
        System.out.println("Jenis Kelamin Mahasiswa " + gender);
        System.out.println("Fakultas Mahasiswa " + fakultas);
    }

    
}
