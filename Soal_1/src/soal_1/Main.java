package soal_1;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Rizki");
        mahasiswa1.setNim("155150201111086");
        mahasiswa1.setKelas("IF-E");
        mahasiswa1.setAngkatan("2015");
        mahasiswa1.setNoHp("0812345678");
        mahasiswa1.display();
        System.out.println("==========================");
         Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.setNama("Albert");
        mahasiswa2.setNim("155150201111087");
        mahasiswa2.setKelas("IF-E");
        mahasiswa2.setAngkatan("2015");
        mahasiswa2.setNoHp("081245778887");
        mahasiswa2.display();
        System.out.println("==========================");
         Mahasiswa mahasiswa3 = new Mahasiswa();
        mahasiswa3.setNama("Wunsel");
        mahasiswa3.setNim("1551502011110811");
        mahasiswa3.setKelas("IF-F");
        mahasiswa3.setAngkatan("2025");
        mahasiswa3.setNoHp("08123455678");
        mahasiswa3.display();
        System.out.println("==========================");
    }
    
}
