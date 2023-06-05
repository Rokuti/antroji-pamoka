import java.time.YearMonth;
import java.util.Scanner;

public class uzduotis9menesioDienos {
    public static void main(String[] args) {
        Scanner skait = new Scanner(System.in);
        System.out.println("Iveskite metus :");
        int metai = skait.nextInt();
        System.out.println("Iveskite menesi :");
        int menesis = skait.nextInt();
        System.out.println("sis menuo turi  dienu:" + kiekDienu(metai,menesis));

    }
    public static int kiekDienu (int metai, int menuo){
        YearMonth yearMonthObject = YearMonth.of(metai,menuo);
        int daysInMonth = yearMonthObject.lengthOfMonth();
        return daysInMonth;
    }
}
