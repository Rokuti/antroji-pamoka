public class Uzduotis2 {
    public static void main(String[] args) {
        double x = 21;
        double y = 12;
        System.out.println(jeigu(x, y));

    } public static double jeigu (double x, double y){
        if (x % 2 == 0){
            return x * y;
        } else {
            return y - x;
        }
    }
}
