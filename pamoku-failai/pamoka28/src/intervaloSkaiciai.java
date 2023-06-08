import java.util.Scanner;

public class intervaloSkaiciai {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("iveskite pirma skaiciu :");
        int x = skait.nextInt();
        System.out.println("Iveskite antra skaiciu :");
        int y = skait.nextInt();
        intervaloSkaiciai(x,y);
    }
    public static void intervaloSkaiciai (int x, int y){
        for (int i = x; i <= y; i++) {
            System.out.println(i);

        }
    }
}
