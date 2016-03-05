/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nama;

/**
 *
 * @author Dell NB
 */
public class Mahasiswa {

    private String nama;
    private int nim;
    private int umur;
    private String namaortu;
    private int tanggallahir;
    
    public void setNama (String s){
        nama = s;
    }
    public void setNim (int i){
        nim = i;
    }
    public void setUmur (int i){
        umur = i;
    }
    public void setNamaortu (String s){
        namaortu = s;
    }
    public void setTanggallahir (int i){
        tanggallahir = i;
    }
    public void displayMessage(){
    System.out.println("Nama :"+nama);
    System.out.println("NIM :"+nim);
    System.out.println("Umur :"+umur);
    System.out.println("Tanggal lahir :"+tanggallahir);    
    System.out.println("Nama Ortu :"+namaortu);
    }
    
}
