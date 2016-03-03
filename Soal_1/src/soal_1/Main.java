package soal_1;

public class Main {

    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Albert Bill Alroy");
        m1.setNim("155150201111087");
        m1.setAbsen(28);
        m1.setKelas("TIF - E");
        m1.setAngkatan(2015);
        m1.displayMessage();
        System.out.println("=====================");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Wunsel Arto Negoro");
        m2.setNim("155150201111088");
        m2.setAbsen(29);
        m2.setKelas("TIF - E");
        m2.setAngkatan(2015);
        m2.displayMessage();
        System.out.println("=====================");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Lutfi Pratama");
        m3.setNim("155150201111089");
        m3.setAbsen(30);
        m3.setKelas("TIF - E");
        m3.setAngkatan(2015);
        m3.displayMessage();
        System.out.println("=====================");
    
    }
    
}
