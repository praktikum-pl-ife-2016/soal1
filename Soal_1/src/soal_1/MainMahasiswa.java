
public class MainMahasiswa {
    public static void main(String[] args){
        Mahasiswa Data1 = new Mahasiswa();
        
        Data1.setnama("Fauzi");
        Data1.setnim("12515002007011");
        Data1.setkelas("TIF-Z");
        Data1.setangkatan(2012);
        Data1.setasal("Madura");
        Data1.Tampilan();
        System.out.println("-----------------");
        Mahasiswa Data2 = new Mahasiswa();
        
        Data2.setnama("Rizki");
        Data2.setnim("15515002007032");
        Data2.setkelas("SI-X");
        Data2.setangkatan(2015);
        Data2.setasal("Bali");
        Data2.Tampilan();
        System.out.println("-----------------");
        Mahasiswa Data3 = new Mahasiswa();
        
        Data3.setnama("Bradd");
        Data3.setnim("135150020056712");
        Data3.setkelas("SISKOM-V");
        Data3.setangkatan(2013);
        Data3.setasal("Bogor");
        Data3.Tampilan();
        System.out.println("-----------------");
    }
}
