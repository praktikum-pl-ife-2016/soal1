package soal_1;

public class Mahasiswa {
     	public String nama;
        private String nim;
        private String jurusan;
        private int angkatan;
        private double ipk;

        public void getNama(String a){
        nama = a;
        }
        public void getNim(String b){
        nim = b;
        }
        public void getJurusan(String c){
        jurusan = c;
        }
        public void getAngkatan(int d){

        angkatan = d;
        }
        public void getIpk(double e){

        ipk = e;
        }
        public void tampilan(){
        System.out.println("Nama     : "+nama);
        System.out.println("NIM      : "+nim);
        System.out.println("Jurusan  : "+jurusan);
        System.out.println("Angkatan : "+angkatan);
        System.out.println("IPK      : "+ipk);
	}
}
