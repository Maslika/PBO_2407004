package tugas_pbo;

import java.util.Scanner;

// Class 1: Logika Perhitungan (Data Tersembunyi/Private)
class BangunDatar {
    // Atribut menggunakan Private (-) sesuai materi Pertemuan 3
    private double sisi;
    private double panjang;
    private double lebar;
    private double alas;
    private double tinggi;
    private double diagonal1;
    private double diagonal2;

    // Method Setter (+) untuk mengisi data (Public)
    public void setPersegi(double s) { this.sisi = s; }
    public void setPersegiPanjang(double p, double l) { this.panjang = p; this.lebar = l; }
    public void setSegitiga(double a, double t) { this.alas = a; this.tinggi = t; }
    public void setBelahKetupat(double d1, double d2, double s) { 
        this.diagonal1 = d1; 
        this.diagonal2 = d2; 
        this.sisi = s; 
    }

    // Method Getter (+) untuk Luas
    public double getLuasPersegi() { return sisi * sisi; }
    public double getLuasPersegiPanjang() { return panjang * lebar; }
    public double getLuasSegitiga() { return 0.5 * alas * tinggi; }
    public double getLuasBelahKetupat() { return 0.5 * diagonal1 * diagonal2; }

    // Method Getter (+) untuk Keliling
    public double getKelilingPersegi() { return 4 * sisi; }
    public double getKelilingPersegiPanjang() { return 2 * (panjang + lebar); }
    public double getKelilingSegitiga() { return 3 * alas; } // Asumsi Sama Sisi
    public double getKelilingBelahKetupat() { return 4 * sisi; }
}

// Class 2: Main Class (Eksekusi Program)
public class Tugas2_Maslika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BangunDatar bd = new BangunDatar();

        System.out.println("=== PROGRAM TUGAS 2 PBO: MASLIKA ===");
        System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Belah Ketupat");
        System.out.print("Pilih Menu: ");
        int menu = input.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Masukkan Sisi: ");
                bd.setPersegi(input.nextDouble());
                System.out.println("Luas: " + bd.getLuasPersegi());
                System.out.println("Keliling: " + bd.getKelilingPersegi());
                break;
            case 2:
                System.out.print("Masukkan Panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan Lebar: ");
                double l = input.nextDouble();
                bd.setPersegiPanjang(p, l);
                System.out.println("Luas: " + bd.getLuasPersegiPanjang());
                System.out.println("Keliling: " + bd.getKelilingPersegiPanjang());
                break;
            case 3:
                System.out.print("Masukkan Alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan Tinggi: ");
                double t = input.nextDouble();
                bd.setSegitiga(a, t);
                System.out.println("Luas: " + bd.getLuasSegitiga());
                System.out.println("Keliling: " + bd.getKelilingSegitiga());
                break;
            case 4:
                System.out.print("Masukkan Diagonal 1: ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan Diagonal 2: ");
                double d2 = input.nextDouble();
                System.out.print("Masukkan Sisi: ");
                double s = input.nextDouble();
                bd.setBelahKetupat(d1, d2, s);
                System.out.println("Luas: " + bd.getLuasBelahKetupat());
                System.out.println("Keliling: " + bd.getKelilingBelahKetupat());
                break;
            default:
                System.out.println("Menu tidak tersedia!");
        }
        input.close();
    }
}