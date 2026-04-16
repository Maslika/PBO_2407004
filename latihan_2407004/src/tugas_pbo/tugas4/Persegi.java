package tugas_pbo.tugas4;

public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        super(sisi); // Menggunakan constructor 1 parameter [cite: 14]
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); // Sisi x Sisi [cite: 15]
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("================");
        System.out.println("Sisi: " + getVarA()); // Penyesuaian nama variabel [cite: 21]
        System.out.println("Luas: " + hitungLuas());
        System.out.println("================");
    }
}