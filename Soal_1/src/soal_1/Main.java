public class Main {
    
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Agung Firdaus");
        m1.setNim("155150200111054");
        m1.setProdi("Teknik Informatika");
        m1.setAng("2015");
        m1.setKelas("TIF-E");
        m1.Display();
        System.out.println("====================================");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Vasha Farizi");
        m2.setNim("155150200111053");
        m2.setProdi("Teknik Informatika");
        m2.setAng("2015");
        m2.setKelas("TIF-D");
        m2.Display();
        System.out.println("====================================");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Willy Aditya Pratama");
        m3.setNim("155150200111264");
        m3.setProdi("Sistem Informasi");
        m3.setAng("2015");
        m3.setKelas("SI-E");
        m3.Display();
        System.out.println("====================================");
    }

}
