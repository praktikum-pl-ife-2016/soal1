/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_1;

/**
 *
 * @author Mahardika
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mh1= new Mahasiswa();
        mh1.setNama("Mahardika Yuristyawan Putra");
        mh1.setNim("155150200111060");
        mh1.setKelas("E");
        mh1.setUmur(19);
        mh1.setGender("Male");
        mh1.display();
        System.out.println("====================");
        
        Mahasiswa mh2= new Mahasiswa();
        mh2.setNama("Imam Utomo");
        mh2.setNim("155150201111077");
        mh2.setKelas("E");
        mh2.setUmur(20);
        mh2.setGender("Male");
        mh2.display();
        System.out.println("====================");
        
        Mahasiswa mh3= new Mahasiswa();
        mh3.setNama("Adi Kurniawan");
        mh3.setNim("155150200111061");
        mh3.setKelas("E");
        mh3.setUmur(20);
        mh3.setGender("Male");
        mh3.display();
        System.out.println("====================");
    }
    
}