/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soal_1;

/**
 *
 * @author Rizal
 */
public class Main {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Kevin Romero");
        m1.setNim("155150201111078");
        m1.setUmur("18");
        m1.setKelamin("Laki");
        m1.setFakultas("FILKOM");
        m1.displayMessage();
        System.out.println("================");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Alvinanda");
        m2.setNim("155150201111079");
        m2.setUmur("23");
        m2.setKelamin("Perempuan");
        m2.setFakultas("FTP");
        m2.displayMessage();
        System.out.println("================");

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Peitra");
        m3.setNim("155150201111080");
        m3.setUmur("19");
        m3.setKelamin("Laki");
        m3.setFakultas("FILKOM");
        m3.displayMessage();
        System.out.println("================");

    }
}

