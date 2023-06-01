import java.util.Scanner;

public class uzduotis3Trikampis {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskit pirma trikampio krastine :");
        double pirmaKrastine = skait.nextDouble();
        System.out.println("Antra krastine :");
        double antraKrastine = skait.nextDouble();
        System.out.println("Trecia krastine :");
        double treciaKrastine = skait.nextDouble();
        System.out.println("Trikampio perimetras yra : "+ trikampioPerimetras(
                pirmaKrastine,antraKrastine,treciaKrastine));
        System.out.println("Trikampio plotas : "+ trikampioPlotas(pirmaKrastine,
                antraKrastine,treciaKrastine));
        System.out.println("trikampis yra : "+ koksTrikampis(pirmaKrastine,antraKrastine,
                treciaKrastine));
    }
    public static double trikampioPerimetras (double a, double b, double c){
        return a + b + c ;
    }
    public static double trikampioPlotas ( double a, double b, double c){
        double p = (a+b+c)/2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static String koksTrikampis(double a,double b, double c){
        if (a==b&&a==c){
            return "Trikampis yra lygiakrastis";
        } else if (a == b && a != c|| a == c && a != b || b == c && c !=b) {
            return "trikampis yra lygiasonis";
        } return "trikampis yra paprastasis";
    }
}
