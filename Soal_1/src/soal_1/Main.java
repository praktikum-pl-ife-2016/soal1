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
public class Soal_1 {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("mahendra");
        m1.setNim("15515020078");
        m1.setkota("malang");
        m1.setGender("Laki");
        m1.setFakultas("FILKOM");
        m1.displayMessage();
        System.out.println("================");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("david");
        m2.setNim("155150201012");
        m2.setkota("kediri");
        m2.setGender("Perempuan");
        m2.setFakultas("FTP");
        m2.displayMessage();
        System.out.println("================");

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("vasha");
        m3.setNim("144150201111080");
        m3.setkota("semarang");
        m3.setGender("Laki");
        m3.setFakultas("FILKOM");
        m3.displayMessage();
        System.out.println("================");

    }
}    

