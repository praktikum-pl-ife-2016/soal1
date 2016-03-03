package mainmahasiswa;
public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa ();
        System.out.println("Mahasiswa 1");
        m1.setNama("Arif");
        m1.setNim("155150200111079");
        m1.setKelas("E");
        m1.setAsal("jakarta");
        m1.setHobi("Futsal");
        m1.displayMessage();
        System.out.println("================");
        System.out.println("Mengubah Nama Mahasiswa 1");
        m1.setNama("Riki");
        m1.displayMessage();
        System.out.println("================");
        
        Mahasiswa m2 = new Mahasiswa ();
        System.out.println("Mahasiswa 2");
        m2.setNama("Aki");
        m2.setNim("155150201098");
        m2.setKelas("A");
        m2.setAsal("Bandung");
        m2.setHobi("Basket");
        m2.displayMessage();
        System.out.println("================");
        
        Mahasiswa m3 = new Mahasiswa ();
        System.out.println("Mahasiswa 3");
        m3.setNama("Rima");
        m3.setNim("155150207098");
        m3.setKelas("C");
        m3.setAsal("Bali");
        m3.setHobi("Voli");
        m3.displayMessage();
        System.out.println("================");
    }
    
}
