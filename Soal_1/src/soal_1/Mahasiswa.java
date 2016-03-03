/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;


public class Mahasiswa {   
    private String namaMahasiswa;
    private int noAbsen;
    private String nim;
    private int usia;
    private String mataKuliah;
    
    public void setNamaMahasiswa(String s) {
        namaMahasiswa = s;
    }
    
    public void setNoAbsen(int i) {
        noAbsen = i;
    }

    public void setNIM(String s) {
        nim = s;
    }

    public void setUsia(int i) {
        usia = i;
    }

    public void setMataKuliah(String s) {
        mataKuliah = s;
    }

    public void displayMessage() {
        System.out.println("Nama\t\t: " +namaMahasiswa);
        System.out.println("Nim\t\t: " +nim);
        System.out.println("No Absen\t: " +noAbsen);
        System.out.println("Usia\t\t: "+usia);
        System.out.println("Mata kuliah\t: " +mataKuliah);
    }
    
    //Tidak usah dikasih main method
    //main method hanya pada mainClass
    
    }
