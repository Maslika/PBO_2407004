package tugas_pbo.tugas4;

public class BangunDatar {
    private double varA;
    private double varB;

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    public double getVarA() { return varA; }
    public void setVarA(double varA) { this.varA = varA; }
    public double getVarB() { return varB; }
    public void setVarB(double varB) { this.varB = varB; }

    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("============================");
        System.out.println("varA: " + this.varA);
        System.out.println("varB: " + this.varB);
        System.out.println("============================");
    }
}