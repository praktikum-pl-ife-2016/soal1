/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_tugas;

/**
 *
 * @author user
 */
public class MainMahasiswa {

    public static void main(String[] args) {
        Mahasiswa ms1 = new Mahasiswa();
        ms1.setNama("Fatimatuz Zahro");
        ms1.setNim("155150207111038");
        ms1.setKelas("IF - E");
        ms1.setJurusan("Informatika");
        ms1.setHobi("Programmer");
        ms1.displayMessage();
        System.out.println("===================================");

        //instan objek baru bernama m2 
        Mahasiswa ms2 = new Mahasiswa();
        ms2.setNama("Fatimah");
        ms2.setNim("155150207111111");
        ms2.setKelas("SI - A");
        ms2.setJurusan("Sistem Informasi");
        ms2.setHobi("Sistem Analyst");
        ms2.displayMessage();
        System.out.println("===================================");
        
        //instan objek baru bernama m2
        Mahasiswa ms3 = new Mahasiswa();
        ms3.setNama("Zahro");
        ms3.setNim("155150207111112");
        ms3.setKelas("PTI - B");
        ms3.setJurusan("Pendidikan TI");
        ms3.setHobi("Dosen IT");
        ms3.displayMessage();
        System.out.println("===================================");

    }
}
