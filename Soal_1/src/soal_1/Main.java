package soal_1;

public class Main {

    public static void main(String[] args) {
        Mahasiswa a1 = new Mahasiswa();
        a1.getNama("Madan");
        a1.getNim("15515020711105");
        a1.getJurusan("Informatika");
        a1.getAngkatan(2015);
        a1.getIpk(3.5);
        a1.tampilan();
        System.out.println("================");
        Mahasiswa a2 = new Mahasiswa();
        a2.getNama("Baim");
        a2.getNim("13515020711143");
        a2.getJurusan("Sistem Informasi");
        a2.getAngkatan(2013);
        a2.getIpk(3.85);
        a2.tampilan();
        System.out.println("================");
        Mahasiswa a3 = new Mahasiswa();
        a3.getNama("Alauddin");
        a3.getNim("14415020711145");
        a3.getJurusan("Sistem Komputer");
        a3.getAngkatan(2014);
        a3.getIpk(4.0);
        a3.tampilan();
        System.out.println("================");
    }
    
}
