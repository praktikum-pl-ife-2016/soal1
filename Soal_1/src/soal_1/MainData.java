
package soal_1;

public class MainData {
    public static void main(String[] args) {
        mahasiswa d1=new mahasiswa();
        d1.setNama("Michael");
        d1.setNim("155150207111033");
        d1.setUmur(16);
        d1.setFakultas("Teknik");
        d1.setJurusan("T.Mesin");
        d1.displayData();
        System.out.println("");
        
        mahasiswa d2=new mahasiswa();
        d2.setNama("Junaedi");
        d2.setNim("155150207111036");
        d2.setUmur(25);
        d2.setFakultas("Teknik");
        d2.setJurusan("T.Industri");
        d2.displayData();
        System.out.println("");
        System.out.println("");
        
        
        mahasiswa d3=new mahasiswa();
        d3.setNama("Alexander Slamet");
        d3.setNim("155152207110031");
        d3.setUmur(21);
        d3.setFakultas("Filkom");
        d3.setJurusan("T.Informatika");
        d3.displayData();
        System.out.println("");
    }
}
