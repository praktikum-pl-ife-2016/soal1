package mahasiswa;

public class MainMahasiswa {
    
public static void main (String[]args){
  Mahasiswa m1 = new Mahasiswa();  
  m1.setNama("Nia");
  m1.setNIM("15515020");
  m1.setJurusan("Informatika");
  m1.setJumlhSks("5 SKS");
  m1.setMatkul("Pemprograman Lanjut");
  m1.setIP(3.25);
  m1.displayMessage(); 
    System.out.println("==================");
  
  Mahasiswa m2 = new Mahasiswa();  
  m2.setNama("Mila");
  m2.setNIM("15515030");
  m2.setJurusan("Informatika");
  m2.setJumlhSks("4 SKS");
  m2.setMatkul("Probabilitas dan Statistika");
  m2.setIP(3.25);
  m2.displayMessage();
    System.out.println("======================");
    
  Mahasiswa m3 = new Mahasiswa();  
  m3.setNama("Hana");
  m3.setNIM("15515040");
  m3.setJurusan("Informatika");
  m3.setJumlhSks("3 SKS");
  m3.setMatkul("Bahasa Inggris");
  m3.setIP(3.25);
  m3.displayMessage();
  System.out.println("========================");
  
   Mahasiswa m4 = new Mahasiswa();  
  m4.setNama("Nina");
  m4.setNIM("15515050");
  m4.setJurusan("Informatika");
  m4.setJumlhSks("4 SKS");
  m4.setMatkul("Matematika Komputasi");
  m4.setIP(3.25);
  m4.displayMessage();
  System.out.println("========================");
  
  System.out.println("Nama pada m1 diubah");
  m1.setNama("Tina");

  m1.displayMessage();
   System.out.println("===================");
  }

   
}
