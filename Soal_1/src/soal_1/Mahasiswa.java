/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author praktikum
 */
public class mahasiswa {
    String nama;
    String nim;
    String alamat;
    String hobi;
    int umur;
    
    public void setNama(String n){
        nama = n;
    }
    public void setNim (String NIM){
        nim = NIM;
    }
    public void setAlamat(String almt){
        alamat = almt;
    }
    public void setHobi (String p){
        hobi = p;
    }
    public void setUmur (int umr){
        umur = umr;
    }
    public void tampilan(){
        System.out.println("Nama mahasiswa  : "+nama);
        System.out.println("NIM             : "+nim);
        System.out.println("Alamat di       : "+alamat);
        System.out.println("Hobi            : "+hobi);
        System.out.println("Umur            : "+umur);
    }
}
