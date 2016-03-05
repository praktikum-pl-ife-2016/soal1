package tester;

public class Main {
    public static void main(String[] args) {
    
           Mahasiswa m1 = new Mahasiswa();
           m1.setnama("Sutejo");
           m1.setnim("155150201111072");
           m1.setfakultas("Filkom");
           m1.setjurusan("INFORMATIKA");
           m1.setalamat("Surabaya");
           m1.displayMessage();
           
           Mahasiswa m2 = new Mahasiswa();
           m2.setnama("Supadi");
           m2.setnim("155150201111073");
           m2.setfakultas("Filkom");
           m2.setjurusan("INFORMATIKA");
           m2.setalamat("Sidoarjo");
           m2.displayMessage();
		   
           Mahasiswa m3 = new Mahasiswa();
           m3.setnama("Sukijan");
           m3.setnim("155150201111074");
           m3.setfakultas("Filkom");
           m3.setjurusan("INFORMATIKA");
           m3.setalamat("Malang");
           m3.displayMessage();
    }
    
}
