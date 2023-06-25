package uzduotis1;

public class Apskritimas {
    private double spindulys;

    public double getSpindulys(){
        return spindulys;
    }
    public void setSpindulys(){
        this.spindulys = spindulys;
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
