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
public class Mahasiswa {

    private String nama;
    private int nim;
    private String kelas;
    private int semester;
    private String universitas;

    /**
     * @param args the command line arguments
     */

    public void setNama(String s) {
        nama = s;
    }

    public void setNim(int i) {
        nim = i;
    }

    public void setKelas(String s) {
        kelas = s;
    }

    public void setSemester(int i) {
        semester = i;
    }

    public void setUniversitas(String s) {
        universitas = s;
    }

    public void displayMessage() {
        System.out.println("Nama saya adalah " + nama);
        System.out.println("NIM saya adalah " + nim);
        System.out.println("Kelas saya adalah " + kelas);
        System.out.println("Saya semester " + semester);
        System.out.println("Saya kuliah di " + universitas);
    }

}
