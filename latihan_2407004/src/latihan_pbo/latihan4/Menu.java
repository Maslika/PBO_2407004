package latihan_pbo.latihan4;

public class Menu {
    private String nama;

    public Menu(String nama) {
        this.nama = nama;
    }

    // Encapsulation: Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method hitungTotal dengan nilai default 0 (belum diketahui)
    public double hitungTotal() {
        return 0;
    }

    // Method untuk menampilkan informasi dasar
    public void tampilkan() {
        System.out.print(nama);
    }
}