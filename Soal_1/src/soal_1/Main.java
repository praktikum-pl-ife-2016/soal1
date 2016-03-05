package Mahasiswa;
public class MainMahasiswa{
    public static void main(String[] args){
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Wunsel Arto Negoro");
        m1.setNim("155150201111089");
        m1.setFakultas("FILKOM");
        m1.setJurusan("Teknik Informatika");
        m1.setAngkatan("2015");
        m1.displayMessage();
        System.out.println("");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Albert Bill Alroy");
        m2.setNim("155150201111083");
        m2.setFakultas("FILKOM");
        m2.setJurusan("Teknik Informatika");
        m2.setAngkatan("2015");
        m2.displayMessage();
        System.out.println("");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Luthfi");
        m3.setNim("155150201111090");
        m3.setFakultas("FILKOM");
        m3.setJurusan("Teknik Informatika");
        m3.setAngkatan("2015");
        m3.displayMessage();
        System.out.println("");
    }
}