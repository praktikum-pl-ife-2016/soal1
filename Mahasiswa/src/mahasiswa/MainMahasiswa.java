/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

/**
 *
 * @author guest-WKCJtk
 */
public class MainMahasiswa {

    public static void main (String[]args){
        
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Nana");
        m1.setJurusan ("Informatika");
        m1.setNim(15516);
        m1.setAlamat("Jl.Melati");
        m1.setAsalKota("Malang");
        m1.setTanggalLahir("15 Mei 1997");
        m1.displayMessage();
        System.out.println ("=================");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Tina");
        m2.setJurusan ("Informatika");
        m2.setNim(758765);
        m2.setAlamat("Jl.Kahuripan No.7");
        m2.setAsalKota("Malang");
        m2.setTanggalLahir("15 Juni 1997");
        m2.displayMessage();
        System.out.println ("=================");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Tina");
        m3.setJurusan ("Informatika");
        m3.setNim(758765);
        m3.setAlamat("Jl.Cimahi");
        m3.setAsalKota("Malang");
        m3.setTanggalLahir("15 Agustus 1997");
        m3.displayMessage();
        System.out.println ("=================");
        
        
    }
    
}

