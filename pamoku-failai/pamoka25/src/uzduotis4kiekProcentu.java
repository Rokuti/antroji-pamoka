import java.util.Scanner;

public class uzduotis4kiekProcentu {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu :");
        double pirmas = skait.nextDouble();
        System.out.println("Iveskite antra skaiciu");
        double antras = skait.nextDouble();
        System.out.println("Tiek procentu pasikeite :" + kiekProcentu(pirmas,
                antras));
    }
    public static String kiekProcentu(double a, double b) {
        double v = ((a - b) * 100) / a;
        if (a > b) {
            v = ((a - b) * 100) / a;
            return "sumazejo " + v;
        }
        String padidejo = "padidejo ";
        return padidejo + Math.abs(v);
    }
}

