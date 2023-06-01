public class uzduotis4 {
    public static void main(String[] args) {
        double a = 12.5;
        double b = 12.5;
        double c = 12.5;
        double d = 12.5;
        System.out.println(arKvadratas(a,b,c,d));
        double a1 = 1;
        double b1 = 1;
        double c1 = 1;
        double d1 = 1;
        System.out.println(arKvadratas(a1,b1,c1,d1));
        double a2 = 13.4;
        double b2 = 13.4;
        double c2 = 13.34;
        double d2 = 13.24;
        System.out.println(arKvadratas(a2,b2,c2,d2));
    }
    public static boolean arKvadratas (double a, double b, double c,double d){
        if(a==b&&b==c&&c==d){
            return true;
        } return false;
    }
}
