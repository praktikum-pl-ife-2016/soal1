package latianyau;

public class Mahasiswa {
    private String nama;
    private String nim;
    private double IP;
    private String merkhape;
    private int jajansebulan;
    
    public void setnama(String s){
        nama = s;
    }
    public void setnim(String a){
        nim = a;
    }
    public void setIP(double b){
        IP = b;
    }
    public void setmerkhape(String c){
        merkhape = c;
    }
    public void setjajansebulan(int d){
        jajansebulan = d;
    }
    public void Hasil(){
 System.out.println("Nama anda adalah "+nama);
 System.out.println("mempunyai nomor nim "+nim);
 System.out.println("serta memililki IP "+IP);
 System.out.println("dan memiliki hape "+merkhape);
 System.out.println("Jajan anda sebulan adalah "+jajansebulan);
 

   
        
    }
}
    

