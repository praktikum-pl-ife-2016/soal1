package mahasiswa;
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa s1 = new Mahasiswa();
        s1.setNama("Kelvin Aditya");
        s1.setNim("155150201111089");
        s1.setTinggi(175);
        s1.setBerat(60);
        s1.setHobi("Sepakbola");
        s1.displayMessage();
        System.out.println("================");
        
        Mahasiswa s2 = new Mahasiswa();
        s2.setNama("Peitra Erdi");
        s2.setNim("155150201111076");
        s2.setTinggi(178);
        s2.setBerat(55);
        s2.setHobi("Traveling");
        s2.displayMessage();
        System.out.println("================");
        
        Mahasiswa s3 = new Mahasiswa();
        s3.setNama("Alvinanda");
        s3.setNim("155150201111087");
        s3.setTinggi(173);
        s3.setBerat(68);
        s3.setHobi("Bernyanyi");
        s3.displayMessage();
        System.out.println("=================");
    }
}
