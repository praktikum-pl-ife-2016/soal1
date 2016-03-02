public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public String kelas;
    public String ang;
    
    public void setNama (String a) {
        nama = a;
    }
    
    public void setNim (String a) {
        nim = a;
    }
    public void setProdi (String a) {
        prodi = a;
    }
    public void setKelas (String a) {
        kelas = a;
    }
    public void setAng (String a) {
        ang = a;
    }
        
    public void Display(){
        System.out.println("Nama\t\t:" + nama);
        System.out.println("NIM\t\t:" + nim);
        System.out.println("Program Studi\t:" + prodi);
        System.out.println("Angkatan\t:" + ang);
        System.out.println("Kelas\t\t:" + kelas);   
    }
    }
