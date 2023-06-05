import java.util.Scanner;

public class uzduotis4kiekPasikartojanciuRaidziu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite zodi kuriame ieskosime raides :");
        String someString = scanner.nextLine();
        System.out.println("Iveskite raide kurios ieskosime :");
        char someChar = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar) {
                count++;
            }
        }  System.out.println("Raide rasta " + count + "kartu");
    }
}
