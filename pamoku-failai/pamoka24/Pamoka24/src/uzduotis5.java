public class uzduotis5 {
    public static void main(String[] args) {
        double x = -27.327;
        System.out.println(modulis(x));
        double x1 = 258;
        System.out.println(modulis(x1));
        double x2 = -147.25;
        System.out.println(modulis(x2));
        double x3 = 154.20;
        System.out.println(modulis(x3));
    }
    public static double modulis(double x){
        if( x < 0){
            return x *-1;
        }return x;
    }
}
