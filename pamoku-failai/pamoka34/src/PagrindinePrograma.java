import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class PagrindinePrograma {
    public static void main(String[] args) {
        Preke[] prekes = nuskaitoIsCsv("prekes.csv");
        System.out.println("prekes = " + Arrays.toString(prekes));

    }
    public static Preke[] nuskaitoIsCsv (String tekstas){
        Preke[] prekes;
        File failas = new File(tekstas);
        try {
            Scanner sc = new Scanner(failas);
            int n = sc.nextInt();
            prekes = new Preke[n];
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String prekesEilute = sc.nextLine();
                String[] prekesEiluteIsskaidyta = prekesEilute.split(",");
                int id = Integer.parseInt(prekesEiluteIsskaidyta[0]);
                String pavadinimas = prekesEiluteIsskaidyta[1];
                double kaina = Double.parseDouble(prekesEiluteIsskaidyta[2]);
                int kiekisSandelyje = Integer.parseInt(prekesEiluteIsskaidyta[3]);
                String kategorija = prekesEiluteIsskaidyta[4];
                Preke preke = new Preke(id,pavadinimas,kaina,kiekisSandelyje,kategorija);
                prekes[i] = preke;

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } return prekes;
    }
}
