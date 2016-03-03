/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_tugas;

public class Mahasiswa {
    private String nama; 
    private String nim; 
    private String kelas; 
    private String jurusan;
    private String hobi;
     
    public void setNama(String a){ 
        nama = a; 
    } 
    public void setNim(String b){ 
        nim = b; 
    } 
    public void setKelas(String c){ 
        kelas = c; 
    } 
    public void setJurusan(String d){ 
       jurusan = d; 
    } 
    public void setHobi(String e){ 
       hobi = e; 
    }
    public void displayMessage(){ 
        System.out.println("Nama Mahasiswa    : "+nama); 
        System.out.println("NIM Mahasiswa     : "+nim);
        System.out.println("Kelas Mahasiswa   : "+kelas);
        System.out.println("Jurusan Mahasiswa : "+jurusan);
        System.out.println("Hobi Mahasiswa    : "+hobi);
       
    }
    
}