public class Programa2 {
    public static void main(String[] args) {
        double a = 17.35;
        double b = 18;
        double c = 20.47;
        double d = 16.37;
        double perimetras = namoPerimetras(a,b,c,d);
        System.out.println("perimetras = " + perimetras);
        double perimetras1 = namoPerimetras(2,4,2,4.1);
        System.out.println("perimetras1 = " + perimetras1);
    }
    public static double namoPerimetras(double a, double b, double c, double d){
        return a + b + c + d;
    }
}