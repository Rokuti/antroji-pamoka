package Uzduotis1;

public class Apskritimas {
    double spindulys;

    public Apskritimas(double spindulys) {
        this.spindulys = spindulys;
    }

    public Apskritimas() {
    }

    @Override
    public String toString() {
        return "Apskritimas " +
                " spindulys = " + spindulys;
    }
    public double diametras(){
        return spindulys*2;

    }
    public void padidintiApskritima (int n){
         spindulys *= n;
    }
    public double ilgis(){
        return spindulys*2*Math.PI;
    }
    public double plotas(){
        return spindulys*spindulys*Math.PI;
    }
}
