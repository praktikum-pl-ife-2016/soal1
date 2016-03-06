package tugaslab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-mcceWY
 */
public class Mahasiswa {

private String nama;

private String nim;

private String fakultas;
private String prodi;
private String asal;

public void setNama(String s){
nama= s;
}
public void setNim(String s){
nim= s;
}
public void setFakultas(String s){
fakultas = s;
}
public void setProdi(String i){
prodi = i;
}
public void setAsal(String j){
asal=j;

}
public void displayMessage(){
System.out.println("Nama\t: "+nama);
System.out.println("NIM\t: "+nim);
System.out.println("Fakultas\t: "+fakultas);
System.out.println("Program Studi\t: "+prodi); 
    System.out.println("Asal\t: "+asal);
}
}
