/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoalNo1;

/**
 *
 * @author guest-OozuVs
 */
public class SoalNo1 {
    private String nama;
    private String nim;
    private String alamat;
    private String usia;
    private double ip;
    
    public void setnama(String n){
        nama = n;
    }
    public void setnim(String n){
        nim = n;
    }
    public void setalamat(String a){
        alamat = a;
    }
    public void setusia(String u){
        usia = u;
    }
    public void setip(double i){
        ip = i;
    }
    public void displayMessage(){
        System.out.println("nama anda adalah"+nama);
        System.out.println("nim anda adalah"+nim);
        System.out.println("alamat anda di"+alamat);
        System.out.println("usia anda adalah sekian"+usia);
        System.out.println("ip anda adalah sekian"+ip);
        
        
    }
}
