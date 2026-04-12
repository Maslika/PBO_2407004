package tugas_pbo.tugas3;

public class Main {
    public static void main(String[] args) {
        BangunRuang bangunRuang = new BangunRuang(10, 5, 4);

        bangunRuang.tampilkanInfoRuang();

        System.out.println("Luas Alas: " + bangunRuang.hitungLuas());
        System.out.println("Volume dari class parent: " + bangunRuang.hitungVolume());
        System.out.println("Volume dari class child: " + bangunRuang.hitungVolume2());  
    }
}