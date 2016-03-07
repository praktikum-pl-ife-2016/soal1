
public class MainMahasiswa {
    public static void main(String[] args){
        Mahasiswa Data1 = new Mahasiswa();
        
        Data1.setNama("Rusev");
        Data1.setNim("15515002007001");
        Data1.setAsal("Rusia");
        Data1.setAngkatan(1999);
        Data1.setNamadosen("Pa Candra");
        Data1.TampilData();
        System.out.println("-----------------");
        Mahasiswa Data2 = new Mahasiswa();
        
        Data2.setNama("Barett");
        Data2.setNim("15515002007002");
        Data2.setAsal("Great Britain");
        Data2.setAngkatan(2015);
        Data2.setNamadosen("Pa Afi");
        Data2.TampilData();
        System.out.println("-----------------");
        Mahasiswa Data3 = new Mahasiswa();
        
        Data3.setNama("Delrio");
        Data3.setNim("15515002007003");
        Data3.setAsal("Mexico");
        Data3.setAngkatan(2013);
        Data3.setNamadosen("Pa Edy");
        Data3.TampilData();
        System.out.println("-----------------");
    }
}
