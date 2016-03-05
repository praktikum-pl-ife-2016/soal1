/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nama;

/**
 *
 * @author Dell NB
 */
public class Main {
    public static void main(String[] args) {
    Mahasiswa m1 = new Mahasiswa();
    m1.setTanggallahir(29051997);
    m1.setNama("Boy");
    m1.setNim(155150);
    m1.setUmur(23);
    m1.setNamaortu("Men");
    m1.displayMessage();
    System.out.println("================");
//instan objek baru bernama m1
    Mahasiswa m2 = new Mahasiswa();
    m2.setTanggallahir(9021997);
    m2.setNama("Jamal");
    m2.setNim(155120);
    m2.setUmur(21);
    m2.setNamaortu("Roy");
    m2.displayMessage();
    System.out.println("================");
//merubah warna dari objek m2
    Mahasiswa m3 = new Mahasiswa();
    m3.setTanggallahir(10051997);
    m3.setNama("Bahar");
    m3.setNim(1553250);
    m3.setUmur(19);
    m3.setNamaortu("Nuwar");
    m3.displayMessage();
    System.out.println("================");
    
//menampilkan hasil perubahan
    }
}
