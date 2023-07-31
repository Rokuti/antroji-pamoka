import entity.Filmas;
import utility.FilmasFailaiUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Filmas> filmai = FilmasFailaiUtility.nuskaitytiFilmusIsFailo("filmai.csv");
//        filmai.forEach(f -> System.out.println(f));
        Collections.sort(filmai, (f1, f2) -> Double.compare(f1.getPelningumas(), f2.getPelningumas()));
        filmai.forEach(f -> System.out.println(f));
        Comparator<Filmas> pagalmetus = (f1, f2) -> Integer.compare(f2.getIsleidimoMetai(), f1.getIsleidimoMetai();
        Comparator<Filmas> pagalPajamas = (f1, f2) -> Double.compare(f2.getPajamos(), f1.getPajamos());
        Collections.sort(filmai, pagalmetus.reversed().thenComparing(pagalPajamas));
    }
}
