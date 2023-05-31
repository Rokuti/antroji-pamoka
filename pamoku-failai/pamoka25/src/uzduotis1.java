import java.util.Scanner;

public class uzduotis1 {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Isveskite apskritimo spinduli :");
        double spindulys = skait.nextDouble();
        double plotas = apskritimoPlotas(spindulys);
        System.out.println("apskritimo plotas = " + plotas);
        System.out.println("apsktitimo ilgis = " + apskritimoIlgis(spindulys));
        System.out.println("apsktitimo diametras = " + apskritimoDiametras(spindulys));
    }
    public static double apskritimoPlotas(double r){
        return Math.PI*r*r;
    }
    public static double apskritimoIlgis(double r){
        return 2 * Math.PI * r;
    }
    public static  double apskritimoDiametras(double r){
        return r * 2;
    }

}
