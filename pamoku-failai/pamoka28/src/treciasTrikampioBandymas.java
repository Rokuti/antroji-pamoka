import java.util.Scanner;

public class treciasTrikampioBandymas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Loop to print spaces before the number
            for (int k = i; k < n; k += 2) {
                System.out.print(" ");
            }
            // Loop to print the number
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Loop to print spaces after the number
            for (int l = i; l < n; l += 2) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
