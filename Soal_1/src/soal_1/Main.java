package tugas;


public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Jerry Eko Widianto");
        m1.setNim("155150201111110");
        m1.setFakultas("Filkom");
        m1.setJurusan("Teknik Informatika");
        m1.setUmur(18);
        m1.displayMessage();
        System.out.println("================");

        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("X -Silent");
        m2.setNim("155150201156410");
        m2.setFakultas("Filkom");
        m2.setJurusan("Sistem Informasi");
        m2.setUmur(17);
        m2.displayMessage();
        System.out.println("================");

        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Andika");
        m3.setNim("155150201256410");
        m3.setFakultas("Filkom");
        m3.setJurusan("PTI");
        m3.setUmur(30);
        m3.displayMessage();
    } 
}
