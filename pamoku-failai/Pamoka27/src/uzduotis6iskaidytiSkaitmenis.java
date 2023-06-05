import java.util.Scanner;

public class uzduotis6iskaidytiSkaitmenis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu kuri norite isskaidyti skaimenimis :");
        int num = scanner.nextInt();
        String number = String.valueOf(num);
        System.out.println(iskaidytasSkaicius(number));
//        recursion(num);
    }
    public static int iskaidytasSkaicius (String n){
        int suma = 0;
        for(int i = 0; i < n.length(); i++) {
            int j = Character.getNumericValue(n.charAt(i));
            System.out.println(j);
            suma += j;
        } return suma;
    }
    public static void recursion(int number) {
        int sum = 0;
        if(number > 0) {
            recursion(number/10);
            System.out.printf("%d  + ", (number%10));
        }
    }
}
