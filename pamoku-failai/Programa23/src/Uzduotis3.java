public class Uzduotis3 {
    public static void main(String[] args) {
    double x = 50;
    double y = 25;
        System.out.println(arKartotinis(x,y));
    }

    public static boolean arKartotinis (double x, double y){
        if (x % y == 0){
            return true;
        }
        return false;
    }
}
