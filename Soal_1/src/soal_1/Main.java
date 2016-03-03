package tugasasprak;
public class main {
    public static void main(String[] args) {
        //instan objek bernama m1
        mahasiswa m1 = new mahasiswa();
        m1.setnama("Iwi Suharti");
        m1.setnim("155150200111064");
        m1.setkelas("E");
        m1.setfakultas("Ilmu Komputer");
        m1.setjurusan("Teknik Informatika");
        m1.displayMessage();
        System.out.println("================================");
        //instan objek bernama m2
        mahasiswa m2 = new mahasiswa();
        m2.setnama("Ninda Silvia");
        m2.setnim("155150200111065");
        m2.setkelas("F");
        m2.setfakultas("Kedokteran");
        m2.setjurusan("Kebidanan");
        m2.displayMessage();
        System.out.println("================================");
        
        //merubah objek m1
        m1.setnama("Riska Andriani");
        m1.setnim("155150200111066");
        m1.displayMessage();
        System.out.println("================================");
    }
}
