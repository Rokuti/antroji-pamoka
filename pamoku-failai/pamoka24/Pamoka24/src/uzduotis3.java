public class uzduotis3 {
    public static void main(String[] args) {
        double a = 25;
        double b = 14;
        double c = 10;
        System.out.println(arTrikampis(a,b,c));
        double a1 = 1;
        double b1 = 1;
        double c1 = 1;
        System.out.println(arTrikampis(a1,b1,c1));
        double a2 = 12;
        double b2 = 5;
        double c2 = 7;
        System.out.println(arTrikampis(a2,b2,c2));
        double a3 = 123.451;
        double b3 = 146.541;
        double c3 = 100.2257;
        System.out.println(arTrikampis(a3,b3,c3));
    }
    public static boolean arTrikampis(double a, double b, double c){
         if (a<b+c&&b<a+b&&c<a+b){
             return true;
         } return false;
    }
}
