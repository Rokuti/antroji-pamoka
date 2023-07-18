package Uzduotis2;

public class Trikampis {
    public double a;
    public double b;
    public double c;
    public double ab;
    public double bc;
    public double ca;

    public Trikampis(double a, double b, double c) {
        if (canFormTriangle(a, b, c)) {
            this.a = a;
            this.b = b;
            this.c = c;
            apskaiciuotiKampa(a, b, c);
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.ab = 0;
            this.bc = 0;
            this.ca = 0;
        }
    }

    public Trikampis(double a, double b, double c, double ab, double bc, double ca) {
        if (canFormTriangle(a, b, c) && areAnglesValid(a, b, c, ab, bc, ca)) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.ab = ab;
            this.bc = bc;
            this.ca = ca;
        } else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.ab = 0;
            this.bc = 0;
            this.ca = 0;
        }
    }

    private boolean canFormTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    private boolean areAnglesValid(double a, double b, double c, double ab, double bc, double ca) {
        return Math.abs(ab - Math.acos((a * a + b * b - c * c) / (2 * a * b)) * 180 / Math.PI) < 1e-6 &&
                Math.abs(bc - Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math.PI) < 1e-6 &&
                Math.abs(ca - Math.acos((c * c + a * a - b * b) / (2 * c * a)) * 180 / Math.PI) < 1e-6;
    }

    private void apskaiciuotiKampa(double a, double b, double c) {
        ab = Math.acos((a * a + b * b - c * c) / (2 * a * b)) * 180 / Math.PI;
        bc = Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math.PI;
        ca = Math.acos((c * c + a * a - b * b) / (2 * c * a)) * 180 / Math.PI;
    }

    public Trikampis() {
    }

    public double perimetras (){
        return a+b+c;
    }
    public void sumazint (int n) {
        a /= n;
        b /= n;
        c /= n;
    }
    public double trikampioPerimetras (){
        return  a+b+c;
    }
    public double plotas (){
        double p = trikampioPerimetras()/2;
        return Math.sqrt(p*( p-a) *( p - b ) *( p - c ));
    }
    public char kuriDidziausia (){
        if (a>b&&a>c){
            return 'a';
        } else if (b>a&&b>c){
            return 'b';
        } else if (c>b&&c>a) {
            return 'c';
        } return 'a';
    }



    public boolean arGaliSuformuotTrikampi(double a, double b, double c)
    {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }


    public void apskaiciuotiKampa() {
        ab = Math.acos((((a * a) + (b * b)) - (c * c)) / (2 * a * b)) * 180 / Math.PI;
        bc = Math.acos((b * b + c * c - a * a) / (2 * b * c)) * 180 / Math.PI;
        ca = Math.acos((c * c + a * a - b * b) / (2 * c * a)) * 180 / Math.PI;
    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", ab=" + ab +
                ", bc=" + bc +
                ", ca=" + ca +
                '}';
    }

}
