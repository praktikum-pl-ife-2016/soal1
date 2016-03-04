/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmahasiswa;

/**
 *
 * @author guest-yuscDe
 */
public class MainMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mh1= new Mahasiswa();
        mh1.setNama("Imam Utomo");
        mh1.setNim("1111077");
        mh1.setKelas("E");
        mh1.setUmur(19);
        mh1.setGender("Male");
        mh1.display();
        System.out.println("====================");
        
        Mahasiswa mh2= new Mahasiswa();
        mh2.setNama("Rizqi fauzi");
        mh2.setNim("1111080");
        mh2.setKelas("E");
        mh2.setUmur(20);
        mh2.setGender("Male");
        mh2.display();
        System.out.println("====================");
        
        Mahasiswa mh3= new Mahasiswa();
        mh3.setNama("Irma Nurvianti");
        mh3.setNim("1111999");
        mh3.setKelas("E");
        mh3.setUmur(20);
        mh3.setGender("Female");
        mh3.display();
        System.out.println("====================");
    }
    
}
