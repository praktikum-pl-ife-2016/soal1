/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siam;

/**
 *
 * @author guest-tyhykG
 */
public class SIAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mh1 = new Mahasiswa();

        mh1.setNama("Adi Kurniawan");
        mh1.setUmur(20);
        mh1.setNim("155150200111061");
        mh1.setKelas("E");
        mh1.setFakultas("FILKOM");
        mh1.tampilan();
        System.out.println("=========================");

        Mahasiswa mh2 = new Mahasiswa();
        mh2.setNama("Imam Utomo");
        mh2.setUmur(19);
        mh2.setNim("155150200111007");
        mh2.setKelas("E");
        mh2.setFakultas("FILKOM");
        mh2.tampilan();
        System.out.println("=========================");

        Mahasiswa mh3 = new Mahasiswa();
        mh3.setNama("Muhammad Ridwan");
        mh3.setUmur(19);
        mh3.setNim("155150200111010");
        mh3.setKelas("E");
        mh3.setFakultas("FILKOM");
        
        mh3.setKelas("C");
        mh3.tampilan();
        System.out.println("=========================");

    }

}
