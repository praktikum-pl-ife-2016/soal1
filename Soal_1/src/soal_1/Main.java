package Soal_1;
public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Rasio");
        m1.setnim("12");
        m1.setfakultas("Filkom");
        m1.setjurusan("TIF");
        m1.setangkatan(2015);
        m1.displayMessage();
        System.out.println("================");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Ganang");
        m2.setnim("32323232323");
        m2.setfakultas("Filkom");
        m2.setjurusan("TIF");
        m2.setangkatan(2015);
        m2.displayMessage();
        System.out.println("================");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Atmaja");
        m3.setnim("23");
        m3.setfakultas("Filkom");
        m3.setjurusan("TIF");
        m3.setangkatan(2015);
        m3.displayMessage();
        System.out.println("================");

    }    
}
