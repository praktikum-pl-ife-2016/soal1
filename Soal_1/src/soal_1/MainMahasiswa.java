
package Mahasiswa;


public class MainMahasiswa {

    public static void main (String[]args){
        
        Mahasiswa m1 = new Mahasiswa();
        m1.setNama("Thalita Vanisha");
        m1.setProgramStudi("Informatika");
        m1.setseleksi("SNMPTN");
        m1.setAlamat("JL.Surabaya No.26");
        m1.setAsalKota("Jakarta");
        m1.setTanggalLahir("12 Mei 1997");
        m1.setNim(567789);
        m1.setStatus("AKTIF");
        m1.displayMessage();
        System.out.println ("=================================");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNama("Arsyta Maharani");
        m2.setProgramStudi("Sistem Informasi");
        m2.setseleksi("SNMPTN");
        m2.setAlamat("JL. Sigura-gura 3 No.30");
        m2.setAsalKota("Surabaya");
        m2.setTanggalLahir("27 April 1996");
        m2.setNim(456650);
        m2.setStatus("AKTIF");
        m2.displayMessage();
        System.out.println ("=================================");
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setNama("Bilqis Rosyida");
        m3.setProgramStudi("Informatika");
        m3.setseleksi("SBMPTN");
        m3.setAlamat("JL. Lembah Dieng No.16A");
        m3.setAsalKota("Bengkulu");
        m3.setTanggalLahir("05 Oktober 1997");
        m3.setNim(2435670);
        m3.setStatus("AKTIF");
        m3.displayMessage();
        System.out.println ("=================================");
        
        
    }
    
}


    

