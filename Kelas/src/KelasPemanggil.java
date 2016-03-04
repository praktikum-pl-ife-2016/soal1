
public class KelasPemanggil {

    public static void main(String[] args) {
        Kelas s1 = new Kelas();
        s1.setNama("Affan Alvyan");
        s1.setKelas("IF - E");
        s1.setNim("155150207111000");
        s1.setTempatLahir("Pati");
        s1.setTanggalLahir("05 Januari 1997");
        s1.diprint();
        System.out.println("==============");
        
        Kelas s2 = new Kelas();
        s2.setNama("Mujahid Baris");
        s2.setKelas("IF - E");
        s2.setNim("155150207111001");
        s2.setTempatLahir("Tangerang");
        s2.setTanggalLahir("06 Maret 1997");
        s2.diprint();
        System.out.println("==============");
        
        Kelas s3 = new Kelas();
        s3.setNama("Rizky Ramadhan");
        s3.setKelas("IF - E");
        s3.setNim("155150207111002");
        s3.setTempatLahir("Medan");
        s3.setTanggalLahir("30 Agustus 1997");
        s3.diprint();
        System.out.println("==============");
    }

}
