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
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    
    private String namaMahasiswa;
    private String nimMahasiswa;
    private int noAbsen;
    private int usia;
    private String status;

    public void setnamaMahasiswa(String s){
    namaMahasiswa = s;
    } 
              
    public void setnimMahasiswa(String s){
    nimMahasiswa = s;
    }
       
    public void setnoAbsen(int i){
    noAbsen = i;
    }
       
    public void setusia(int i){
    usia = i;
    }
       
    public void setstatus(String s){
    status = s;
    }
    
    public void displayMessage(){
    System.out.println("Nama Anda \t\t: "+ namaMahasiswa);
    System.out.println("NIM Anda \t\t: "+ nimMahasiswa);
    System.out.println("Nomor absen Anda \t: "+ noAbsen);
    System.out.println("Usia Anda \t\t: "+ usia);
    System.out.println("Status Anda \t\t: "+ status);
       
    }}
