package latihan_pbo.latihan3;

public class Persegi extends BangunDatar{
    
    public double LuasPersegi(){
        return getsisi()*getsisi();
    }

    public double KelilingPersegi(){
        return 4*getsisi();
    }
}
