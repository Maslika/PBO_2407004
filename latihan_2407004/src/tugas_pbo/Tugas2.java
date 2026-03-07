package tugas_pbo;

import java.util.Scanner;

// 1. Class Utama untuk Bangun Datar
class BangunDatar {
    // Atribut menggunakan private (-) sesuai prinsip enkapsulasi
    private double sisi, panjang, lebar, alas, tinggi, d1, d2;

    // Method Setters (Untuk mengisi data)
    public void setPersegi(double s) { this.sisi = s; }
    public void setPersegiPanjang(double p, double l) { this.panjang = p; this.lebar = l; }
    public void setSegitiga(double a, double t) { this.alas = a; this.tinggi = t; }
    public void setBelahKetupat(double d1, double d2, double s) { this.d1 = d1; this.d2 = d2; this.sisi = s; }

    // Method Getters/Calculators (+) bersifat public
    public double luasPersegi() { return sisi * sisi; }
    public double kelilingPersegi() { return 4 * sisi; }

    public double luasPersegiPanjang() { return panjang * lebar; }
    public double kelilingPersegiPanjang() { return 2 * (panjang + lebar); }

    public double luasSegitiga() { return 0.5 * alas * tinggi; }
    public double kelilingSegitiga() { return 3 * alas; } // Asumsi Segitiga Sama Sisi

    public double luasBelahKetupat() { return 0.5 * d1 * d2; }
    public double kelilingBelahKetupat() { return 4 * sisi; }
}

// 2. Class Main untuk menjalankan program
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();
        
        System.out.println("=== PROGRAM HITUNG BANGUN DATAR ===");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Belah Ketupat");
        System.out.print("Pilih Menu (1-4): ");
        int pilihan = input.nextInt();

        // Menggunakan Switch Case sesuai instruksi
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Sisi: ");
                double s = input.nextDouble();
                bd.setPersegi(s);
                System.out.println("Luas: " + bd.luasPersegi());
                System.out.println("Keliling: " + bd.kelilingPersegi());
                break;
            case 2:
                System.out.print("Masukkan Panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double l = input.nextDouble();
                bd.setPersegiPanjang(p, l);
                System.out.println("Luas: " + bd.luasPersegiPanjang());
                System.out.println("Keliling: " + bd.kelilingPersegiPanjang());
                break;
            case 3:
                System.out.print("Masukkan Alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan Tinggi: ");
                double t = input.nextDouble();
                bd.setSegitiga(a, t);
                System.out.println("Luas: " + bd.luasSegitiga());
                System.out.println("Keliling (Sama Sisi): " + bd.kelilingSegitiga());
                break;
            case 4:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan Sisi: ");
                double sk = input.nextDouble();
                bd.setBelahKetupat(d1, d2, sk);
                System.out.println("Luas: " + bd.luasBelahKetupat());
                System.out.println("Keliling: " + bd.kelilingBelahKetupat());
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }
        input.close();
    }
}