public class uzduotis9koksSkaicius {
    public static void main(String[] args) {
 double x = -150000;
        System.out.println(koksSkaicius(x));
        System.out.println(koksSkaicius(0));
    }

    public static String koksSkaicius(double x) {
        if (x < -1000000) {
            return "Didelis neigiamas";
        } else if (-1000000 < x && x < 0) {
            return "Neigiamas";
        } else if (0 < x && x < 1000000) {
            return "Teigiamas";
        } else if (1000000 < x) {
            return "Didelis teigiamas";
        }
        return "Lygus 0";
    }
}
