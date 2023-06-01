import java.util.Scanner;

public class uzduotis4Procentai {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite skaiciu kuri kelsim procentine dalimi :");
        double sk1 = skait.nextDouble();
        System.out.println("Iveskite kiek procentu :");
        double pro = skait.nextDouble();
        System.out.println("Gauname : "+ pakeltaProcentai(sk1,pro));
    }
    public static double pakeltaProcentai(double sk,double pro){
        return pro/100*sk;
    }
}
