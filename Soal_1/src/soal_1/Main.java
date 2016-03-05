
public class Main {
    public static void main(String[] args){
        Mahasiswa Data1 = new Mahasiswa();
        Data1.setNama("Yuri");
        Data1.setNim("155150200111061");
        Data1.setEmail("Yuri@yahoo.com");
        Data1.setTgl("15-02-1998");
        Data1.setTelp("085704326826");
        Data1.TampilData();
        System.out.println("-----------------");
        Mahasiswa Data2 = new Mahasiswa();
        Data2.setNama("Soap");
        Data2.setNim("155150200111062");
        Data2.setEmail("Soap@yahoo.com");
        Data2.setTgl("20-01-1997");
        Data2.setTelp("087876549873");
        Data2.TampilData();
        System.out.println("-----------------");
        Mahasiswa Data3 = new Mahasiswa();
        Data3.setNama("Frost");
        Data3.setNim("155150200111063");
        Data3.setEmail("Frost@yahoo.com");
        Data3.setTgl("30-12-1996");
        Data3.setTelp("081871651091");
        Data3.TampilData();
        System.out.println("-----------------");
    }
}
