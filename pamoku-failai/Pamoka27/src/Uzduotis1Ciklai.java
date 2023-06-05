import java.util.Scanner;

public class Uzduotis1Ciklai {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite nuo kokio skaiciaus vesti seka :");
        int pradzia = skait.nextInt();
        System.out.println("iki kokio :");
        int pabaiga = skait.nextInt();
        skaiciaiNuoIki(pradzia,pabaiga);
        System.out.println("Iveskite nuo kokio skaiciaus skaiciuoti atbuline tvarka :");
        int nuo = skait.nextInt();
        System.out.println("iki kokio :");
        int iki = skait.nextInt();
        skaiciaiMazejimoTvarka(nuo,iki);
    }
    public static void skaiciaiNuoIki (int pradzia, int pabaiga){
        for (int i = pradzia; i < pabaiga; i++) {
            System.out.println(i);
        }
    }
    public static void skaiciaiMazejimoTvarka (int pradzia, int pabaiga){
        for (int i = pradzia; i >= pabaiga ; i--) {
            System.out.println(i);
        }
    }
}
