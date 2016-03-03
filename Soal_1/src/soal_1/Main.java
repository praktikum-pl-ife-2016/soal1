/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal_1;


public class Main {
    public static void main(String[] args) {
        Mahasiswa s1 = new Mahasiswa(); 
        s1.setNamaMahasiswa("Teri Kincowati");
        s1.setNoAbsen(22);
        s1.setNIM("155150201111082");
        s1.setUsia(19);
        s1.setMataKuliah("Pemrogaman Lanjutan");
        s1.displayMessage();
        System.out.println("======================================");
        
        Mahasiswa s2 = new Mahasiswa(); 
        s2.setNamaMahasiswa("Irma Nurvianti");
        s2.setNoAbsen(24);
        s2.setNIM("155150201111084");
        s2.setUsia(18);
        s2.setMataKuliah("Pemrogaman Lanjutan");
        s2.displayMessage();
        System.out.println("======================================");
                  
        Mahasiswa s3 = new Mahasiswa(); 
        s3.setNamaMahasiswa("Riska Andriani");
        s3.setNoAbsen(20);
        s3.setNIM("155150201111080");
        s3.setUsia(19);
        s3.setMataKuliah("Pemrogaman Lanjutan");
        s3.displayMessage();
        System.out.println("======================================");
    }
}
