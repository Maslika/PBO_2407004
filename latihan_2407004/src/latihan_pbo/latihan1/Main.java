package latihan_pbo.latihan1;

// import java.util.Scanner;

class Cafe{
    String nama;
    String alamat;

    Cafe (String nama, String alamat){
    this.nama = nama;
    this.alamat = alamat;
    System.out.println(nama);
    System.out.println(alamat);
    }

    //method
    void buka(){ 
        System.out.println("Cafe " + nama + " Sudah Buka");
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
}

public class Main {
    public static void main(String[] args) {
        
        // Scanner input = new Scanner(System.in);
        // Cafe cafe = new Cafe();

        // System.out.println("Masukkan nama cafe: ");
        // String nama = input.nextLine();

        // System.out.println("Nama yang diinput adalah : " + cafe.nama);
        // cafe.buka();

        Cafe cafe2 = new Cafe("Janji Jiwa", "Indramayu");
        cafe2.setNama("kenangan");
        cafe2.buka();
        
    }
}