import java.util.Scanner;

public class uzduotis5arPirminis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite skaiciu patikrinsim ar pirminis :");
        int n = scanner.nextInt();
        System.out.println(arPirminis(n));
    }
    public static String arPirminis ( int n){

        int num = n, i = 2;
        boolean flag = false;
        while (i <= num / 2) {
            if (num % i == 0) {
                flag = true;
                break;
            }

            ++i;
        }

        if (!flag)
            return " is a prime number.";
        else
            return " is not a prime number.";
    }
}
