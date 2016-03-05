public class MainMahasiswa {
    public static void main(String[] args) {
        //instan objek bernama m1
        Mahasiswa m1 = new Mahasiswa();
    m1.setnama("Muhammad Ali");
    m1.setnim("155150200111099");
    m1.setIP(3.2);
    m1.setJurusan("Teknik Informatika");
    m1.setAsal("Papua");
    m1.Tampilan();
    System.out.println("================");
        //instan objek bernama m2
        Mahasiswa m2 = new Mahasiswa();
    m2.setnama("Rizki Ramadhan");
    m2.setnim("155150200111059");
    m2.setIP(3.5);
    m2.setJurusan("Teknik Informatika");
    m2.setAsal("Sumatra Utara");
    m2.Tampilan();
    System.out.println("================");
        //instan objek bernama m3
        Mahasiswa m3= new Mahasiswa();        
    m3.setnama("Thareq Ibrahim");
    m3.setnim("155150200111059");
    m3.setIP(3.6);
    m3.setJurusan("Teknik Informatika");
    m3.setAsal("Depok");
    m3.Tampilan();
    System.out.println("================");
    }
}
