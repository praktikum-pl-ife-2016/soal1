/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahasiswa;

/**
 *
 * @author guest-xrNNQ7
 */
public class MainMahasiswa {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Rezananda");
        m1.setNim(1234);
        m1.setKelas("E");
        m1.setSemester(2);
        m1.setUniversitas("Brawijaya");
        System.out.println("----------------");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Putra");
        m2.setNim(3456);
        m2.setKelas("R");
        m2.setSemester(4);
        m2.setUniversitas("Gajah Mada");
        System.out.println("Nama mahasiswa pada objek m1 dirubah menjadi nama Putra");
        m2.setNama("Putra");
        m2.displayMessage();
        System.out.println("-----------------");
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Andi");
        m3.setNim(5768);
        m3.setKelas("A");
        m3.setSemester(3);
        m3.setUniversitas("Airlangga");
        System.out.println("Nama mahasiswa pada objek m2 dirubah menjadi nama Andi");
        m3.setNama("Andi");
        m3.displayMessage();
    }
}
