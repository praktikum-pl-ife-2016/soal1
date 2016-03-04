/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1;

/**
 *
 * @author Mahardika
 */
public class Mahasiswa {
    public String nama;
    public String nim;
    public String kelas;
    public int umur;
    public String gender;
    
    
    public void setNama(String s){
        nama = s;
    }
    public void setNim(String s){
        nim = s;
    }
    public void setKelas(String s){
        kelas = s;
    }
    public void setUmur(int i){
        umur = i;
    }
    public void setGender(String s){
        gender = s;
    }
    public void display(){
        System.out.println("Nama : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Kelas : "+kelas);
        System.out.println("Umur : "+umur);
        System.out.println("Gender : "+gender);
    }
}