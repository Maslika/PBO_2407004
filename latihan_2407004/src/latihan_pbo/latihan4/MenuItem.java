package latihan_pbo.latihan4;

public class MenuItem extends Menu {
    private int jumlah;
    private double harga;

    public MenuItem(String nama, int jumlah, double harga) {
        super(nama); // Memanggil constructor parent
        this.jumlah = jumlah;
        this.harga = harga;
    }

    // Override method hitungTotal: harga x jumlah
    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    // Override tampilkan sesuai format yang diinginkan
    @Override
    public void tampilkan() {
        // Mengatur tampilan agar rapi (nama makanan dan harganya)
        System.out.printf("%-15s %10.0f (x%d)\n", getNama(), harga, jumlah);
        System.out.println("Total: " + hitungTotal());
    }
}