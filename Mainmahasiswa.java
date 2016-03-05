package javaapplication1;

public class Mainmahasiswa {
    public static void main(String[] args) {
        mahasiswa m1 = new mahasiswa();
        m1.setnama("Andika");
        m1.setnim(155159);
        m1.setalamat("Malang");
        m1.setjurusan("Teknik Informatika");
        m1.setkelas("E");
        m1.displaymessage();
        System.out.println("==================================");
        mahasiswa m2 = new mahasiswa();
        m2.setnama("Chales");
        m2.setnim(155158);
        m2.setalamat("Surabaya");
        m2.setjurusan("Teknik Informatika");
        m2.setkelas("E");
        m2.displaymessage();
        System.out.println("==================================");
        mahasiswa m3 = new mahasiswa();
        m3.setnama("Jerry");
        m3.setnim(155151);
        m3.setalamat("Blitar");
        m3.setjurusan("Teknik Informatika");
        m3.setkelas("E");
        m3.displaymessage();
        System.out.println("==================================");
        }
    }
