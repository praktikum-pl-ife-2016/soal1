/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Soal1;

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
    Soal1 s1 = new Soal1();
    s1.setnamaMahasiswa ("Irma Nurvianti");
    s1.setnimMahasiswa ("155150201111084");
    s1.setnoAbsen (25);
    s1.setusia (18);
    s1.setstatus ("Berpacaran");
    s1.displayMessage();
    
    System.out.println("===========================================");
    
    Soal1 s2 = new Soal1();
    s2.setnamaMahasiswa ("Teri Kincowati");
    s2.setnimMahasiswa ("155150201111082");
    s2.setnoAbsen (23);
    s2.setusia (19);
    s2.setstatus ("Jomblo");
    s2.displayMessage();
    
    System.out.println("===========================================");
    
    Soal1 s3 = new Soal1();
    s3.setnamaMahasiswa ("Fatimatuz Zahro");
    s3.setnimMahasiswa ("155150200711039");
    s3.setnoAbsen (39);
    s3.setusia (19);
    s3.setstatus ("Menikah");
    s3.displayMessage();

    }}