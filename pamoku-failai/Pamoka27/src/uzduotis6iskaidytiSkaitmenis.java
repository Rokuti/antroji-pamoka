import java.util.Scanner;

public class uzduotis6iskaidytiSkaitmenis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu kuri norite isskaidyti skaimenimis :");
        int num = scanner.nextInt();
        String number = String.valueOf(num);
//        iskaidytasSkaicius(number);
        recursion(num);
    }
    public static void iskaidytasSkaicius (String n){
        for(int i = 0; i < n.length(); i++) {
            int j = Character.digit(n.charAt(i), 10);
            System.out.println("digit: " + j);
        }
    }
    public static void recursion(int number) {
        if(number > 0) {
            recursion(number/10);
            System.out.printf("%d  + ", (number%10));
        }
    }
}
