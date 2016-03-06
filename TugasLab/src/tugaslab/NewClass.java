package tugaslab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author guest-mcceWY
 */
public class NewClass {
   public static void main(String[] args) {
//instan objek bernama m1
Mahasiswa m1 = new Mahasiswa();
m1.setNama("Alvinanda");
m1.setNim("145100307111011");
m1.setFakultas("FTI");

m1.setProdi("Udrak - Udruk");
m1.setAsal("Ngalam");
m1.displayMessage();

System.out.println("================");

//instan objek baru bernama m2

Mahasiswa m2 = new Mahasiswa();

m2.setNama("Sugambli");
m2.setNim("15515020020202010");

m2.setFakultas("Tlengus");

m2.setProdi("CL");

m2.setAsal("Sorjem");

m2.displayMessage();

System.out.println("================");

//merubah warna dari objek m1

System.out.println("ANDA THE BEST");

m1.setNama("ABC");

//menampilkan hasil perubahan

m1.displayMessage();
System.out.println("================");
Mahasiswa m3 = new Mahasiswa();

m3.setNama("Sugambli");
m3.setNim("15515020020202010");

m3.setFakultas("Tlengus");

m3.setProdi("CL");

m3.setAsal("Sorjem");

m3.displayMessage();
}
}
