package latihan_pbo.latihan4;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Menggunakan tipe data parent untuk objek child
        Menu pesanan;

        System.out.println("--- DAFTAR PESANAN MAKANAN ---");

        // Objek 1: Nasi Goreng
        pesanan = new MenuItem("Nasi Goreng", 2, 12000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        // Objek 2: Es Teh
        pesanan = new MenuItem("Es Teh", 3, 3000);
        pesanan.tampilkan();
        System.out.println("------------------------------");

        // Objek 3: Mie Ayam
        pesanan = new MenuItem("Mie Ayam", 3, 13000);
        pesanan.tampilkan();
        System.out.println("------------------------------");
    }
}