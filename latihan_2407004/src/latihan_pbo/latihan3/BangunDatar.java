package latihan_pbo.latihan3;

public class BangunDatar {

    public double getSisi(){
        return sisi;
    }
    // PERSEGI
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double luasPersegi() {
        return sisi * sisi;
    }

    public double kelilingPersegi() {
        return 4 * sisi;
    }

    // PERSEGI PANJANG
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luasPersegiPanjang() {
        return panjang * lebar;
    }

    public double kelilingPersegiPanjang() {
        return 2 * (panjang + lebar);
    }

    // SEGITIGA
    private double alas;
    private double tinggi;
    private double sisiMiring;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public double luasSegitiga() {
        return 0.5 * alas * tinggi;
    }

    public double kelilingSegitiga() {
        return alas + tinggi + sisiMiring;
    }

    // BELAH KETUPAT
    private double diagonal1;
    private double diagonal2;
    private double sisiBelahKetupat;

    public void setDiagonal1(double diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public void setDiagonal2(double diagonal2) {
        this.diagonal2 = diagonal2;
    }

    public void setSisiBelahKetupat(double sisiBelahKetupat) {
        this.sisiBelahKetupat = sisiBelahKetupat;
    }

    public double luasBelahKetupat() {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double kelilingBelahKetupat() {
        return 4 * sisiBelahKetupat;
    }
}