import java.util.Scanner;

public class Uzduotis2Staciakampis {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite staciakampio ilgi :");
        double ilgis = skait.nextDouble();
        System.out.println("Iveskite staciakampio ploti :");
        double plotis = skait.nextDouble();
        double plotas = staciakampioPlotas(ilgis,plotis);
        System.out.println("Staciakampio plotas yra :" + staciakampioPlotas
                (ilgis,plotis));
        System.out.println("Staciakampio perimetras yra :" +
                staciakampioPerimetras(ilgis,plotis));
        double perimetras = staciakampioPerimetras(ilgis,plotis);
        System.out.println(arPlotasArIlgis(plotas,perimetras));
    }
    public static double staciakampioPlotas(double a, double b){
        return a * b;
    }
    public static double staciakampioPerimetras(double a,double b){
        return a*2+b*2;
    }
    public static String arPlotasArIlgis(double a,double b) {
        if (a > b) {
            return "Plotas yra didesnis uz perimetra";
        } else if (a < b) {
            return "Perimetras yra didesnis uz plota";
        }
        return "Plotas ir perimetras yra vienodi";
    }
}
