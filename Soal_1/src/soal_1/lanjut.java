package mahasiswa;
public class lanjut {
     public static void main(String[] args) {
         //instan objek bernama m1
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Riska Andriani");
        m1.setNim("155150201111080");
        m1.setKelas("IF-E");
        m1.setAbsen("21");
        m1.setFakultas("Fakultas Ilmu Komputer");
        m1.displayMessage();
        System.out.println("===============================");
        //instan objek baru bernama m2
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Diah Ayu Rita");
        m2.setNim("155150201111082");
        m2.setKelas("IF-D");
        m2.setAbsen("08");
        m2.setFakultas("Fakultas Ilmu Komputer");
        m2.displayMessage();
        System.out.println("==============================");
        //instan objek baru bernama m3
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Adinda Layli");
        m3.setNim("155150201111075");
        m3.setKelas("SI-B");
        m3.setAbsen("02");
        m3.setFakultas("Fakultas Ilmu Komputer");
        m3.displayMessage();
        System.out.println("===============================");
    }
    
}

