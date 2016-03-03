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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        mahasiswa siswa1 = new mahasiswa();
        siswa1.setNama("ridwan");
        siswa1.setNim("151234289897");
        siswa1.setAlamat("malang");
        siswa1.setHobi("renang");
        siswa1.setUmur(18);
        siswa1.tampilan();
        System.out.println("==================");
        
        mahasiswa siswa2 = new mahasiswa();
        siswa2.setNama("ronaldo");
        siswa2.setNim("1512342897");
        siswa2.setAlamat("batu");
        siswa2.setHobi("sepakbola");
        siswa2.setUmur(30);
        siswa2.tampilan();
        System.out.println("==================");
        
        mahasiswa siswa3 = new mahasiswa();
        siswa3.setNama("messi");
        siswa3.setNim("151234289897");
        siswa3.setAlamat("papua");
        siswa3.setHobi("basket");
        siswa3.setUmur(18);
        siswa3.tampilan();
    }
    
}
