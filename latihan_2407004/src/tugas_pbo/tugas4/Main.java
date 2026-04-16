package tugas_pbo.tugas4;

public class Main {
    public static void main(String[] args) {
        // Menggunakan satu tipe variabel yang sama (Polymorphism) 
        BangunDatar bd;

        // Objek Persegi
        bd = new Persegi(5.0);
        bd.tampilkan();
        System.out.println();

        // Objek Persegi Panjang
        bd = new PersegiPanjang(6.0, 4.0);
        bd.tampilkan();
        System.out.println();

        // Objek Segitiga
        bd = new Segitiga(3.0, 4.0);
        bd.tampilkan();
    }
}