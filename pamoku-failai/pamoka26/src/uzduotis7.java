import java.util.Scanner;

public class uzduotis7 {
    public static void main(String[] args) {

        Scanner skait = new Scanner(System.in);
        String a = "ana1konda";
        int i = 4;
        System.out.println(arSkaicius(a,i));
        int i1 = 6;
        System.out.println(arSkaicius(a,i1));
        System.out.println("Iveskite zodi su skaiciu," +
                " patikrinsim ar paskutinis zenklas yra skaicius");
        String nuskaitytas = skait.nextLine();
        System.out.println(arPaskutinisSkaicius(nuskaitytas));
    }
    public static boolean arSkaicius ( String a, int i){
        return Character.isDigit(a.charAt(i));
    }
    public static boolean arPaskutinisSkaicius (String a){
        return Character.isDigit(a.charAt(a.length() - 1));
    }
}
