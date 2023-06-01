public class Uzduotis1 {
    public static void main(String[] args) {
        int skaicius = 25;
        int daliklis1 = 6;
        int daliklis2 = 5;
        System.out.println(arDalinasi(skaicius,daliklis1,daliklis2));
        int sk = -100;
        int d = 10;
        int d2 = -20;
        System.out.println(arDalinasi(sk,d,d2));
        int sk1 = 140;
        int da1 = 7;
        int da2 = 2;
        System.out.println(arDalinasi(sk1,da1,da2));
        int sk2 = 12;
        int dal1 = 4;
        int dal2 = 5;
        System.out.println(arDalinasi(sk2,dal1,dal2));
    }
    public static boolean arDalinasi(int skaicius, int daliklis1, int
                                     daliklis2) {
        if (skaicius % daliklis1 == 0 && skaicius % daliklis2 == 0){
            return true;
        }return false;
    }
}
