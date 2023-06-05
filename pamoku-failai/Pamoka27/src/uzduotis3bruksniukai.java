import java.util.Scanner;

public class uzduotis3bruksniukai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite kiek bruksniuku norite :");
        int n = scanner.nextInt();
        System.out.println( addDashes(n));

    }
    public static String addDashes( int n)
    {
        String s_with_dashes = "";
        for(int i = 0; i < n; i++) {
                s_with_dashes += '-';
        }
        return s_with_dashes;
    }
}
