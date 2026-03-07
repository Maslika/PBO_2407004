package latihan_pbo.latihan2;

//import java.util.Scanner;

class Cafe{
    String nama;
    String alamat;

    Cafe(String nama, String alamat){
    this.nama = nama;
    this.alamat = alamat;
    System.out.println(nama);
    System.out.println(alamat);
} 

//method
void buka(){
    System.out.println("Cafe " +  nama + " Sudah Buka ");
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
    
}

public String getAlamat() {
    return alamat;
}

public void setAlamat(String alamat) {
    this.alamat = alamat;
}
// contrusctor
}
public class Main {
    public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        // //Cafe cafe = new Cafe();
        
        //System.out.printIn("Masukan nama cafe: ");
        // //cafe.nama = input.nextLine();
         
        //System.out.printIn("nama yang di input adalah : " + cafe.nama);
        //cafe.buka();
        
        Cafe cafe2 = new Cafe("Janji Jiwa",  "Indramayu");
        cafe2.setNama("kenangan");
        cafe2.buka();

 }   
}

  //Cafe cafe1 = new Cafe("Kopi Kenangan", "Indramayu"):
  //Cafe cafe2 = new Cafe("Janji Jiwa", "Jatibarang");  
  //Cafe cafe3 = new Cafe("kopte", "imkot");  

  //cafe1.buka();

  // System.out.println("Nama Cafenya adalah : " + cafe1.nama);
  // System.out.println("Alamatnya ada di : " + cafe1.alamat);

  // System.out.println("Nama Cafenya adalah : " + cafe2.nama);
  // System.out.println("Alamatnya ada di : " + cafe2.alamat);

  // System.out.println("Nama Cafenya adalah : " + cafe3.nama);
  // System.out.println("Alamatnya ada di : " + cafe3.alamat);