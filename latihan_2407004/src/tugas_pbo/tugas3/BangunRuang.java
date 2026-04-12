package tugas_pbo.tugas3;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi){
        super(panjang, lebar);
        //this.panjang = panjang;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungLuas(){
        return panjang * lebar;
    }

    public double hitungVolume(){
        return super.hitungLuas() * tinggi;
    }

    public double hitungVolume2(){
        return hitungLuas() * tinggi;
    }

    public void tampilkanInfoRuang(){
        super.tampilkanHasil();
        System.out.println("Tinggi: " + tinggi);
    }
}
