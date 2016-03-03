/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siam;

/**
 *
 * @author guest-tyhykG
 */
public class Mahasiswa {

    public String nama;
    public String nim;
    public String kelas;
    public int umur;
    public String fakultas;

    public void setNama(String n) {
        nama = n;
    }

    public void setNim(String NIM) {
        nim = NIM;
    }

    public void setKelas(String Kelas) {
        kelas = Kelas;
    }

    public void setUmur(int usia) {
        umur = usia;
    }

    public void setFakultas(String fak) {
        fakultas = fak;
    }

    public void tampilan() {
        System.out.println("Nama : " + nama);
        System.out.println("umur : " + umur);
        System.out.println("Kelas : " + kelas);
        System.out.println("NIM : " + nim);
        System.out.println("Fakultas : " + fakultas);
    }
}
