/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;


public class Soal1 {

    private String nama;
    private String nim;
    private String asal;
    private int umur;
    private String jurusan;
    
    public void setNama (String s){
    nama = s;
    }
    
    public void setNim (String s){
    nim = s;
    }
    
    public void setAsal (String s){
    asal = s;
    }
    
    public void setUmur (int i){
    umur = i;
    }
    
    public void setJurusan (String s){
    jurusan = s;
    }
    
    public void displaymessage (){
        System.out.println("Nama \t\t:"+nama);
        System.out.println("NIM \t\t:"+nim);
        System.out.println("Asal\t\t:"+asal);
        System.out.println("Umur\t\t:"+umur);
        System.out.println("Jurusan\t\t:"+jurusan);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
