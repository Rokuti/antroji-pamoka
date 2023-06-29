import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class filmuPagrindinePrograma {
    public static void main(String[] args) {
        Filmai[] filmai = nuskaitoIsCsv("filmai.csv");
        System.out.println("filmai = " + Arrays.toString(filmai));
        for (int i = 0; i < filmai.length; i++) {
            System.out.println(filmai[i]);

        }
        System.out.println("geriausias filmas = " + rastiGeriausiaFilma(filmai));
        double ivertinimas = 5.5;
        System.out.println("geresniu nei 5.5 ivertinimo filmai yra : "
                + skaiciuotiGeriauIvertintus(filmai, ivertinimas));
        int[] pasirinktiID = {12, 11};
        System.out.println("pasirinktu filmu kaina yra = " + apskaiciuotiBendraKaina(filmai
        ,pasirinktiID));
    }
    public static Filmai[] nuskaitoIsCsv (String tekstas){
        Filmai[] filmai;
        File failas = new File(tekstas);
        try {
            Scanner sc = new Scanner(failas);
            int n = sc.nextInt();
            filmai = new Filmai[n];
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String filmoEilute = sc.nextLine();
                String[] filmoEiluteIsskaidyta = filmoEilute.split(",");
                int id = Integer.parseInt(filmoEiluteIsskaidyta[0]);
                String pavadinimas = filmoEiluteIsskaidyta[1];
                double ivertinimas = Double.parseDouble(filmoEiluteIsskaidyta[2]);
                String zanras = filmoEiluteIsskaidyta[3];
                double trukme = Double.parseDouble(filmoEiluteIsskaidyta[4]);
                int isleidimoMetai = Integer.parseInt(filmoEiluteIsskaidyta[5]);
                double kaina = Double.parseDouble(filmoEiluteIsskaidyta[6]);
                Filmai filmas = new Filmai(id,pavadinimas,ivertinimas,zanras,trukme,isleidimoMetai,
                        kaina);
                filmai[i] = filmas;

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } return filmai;

    }


    public static Filmai rastiGeriausiaFilma(Filmai[] filmai) {
        Filmai geriausiasFilmas = filmai[0];
        for (int i = 0; i < filmai.length; i++) {
            if (filmai[i].getIvertinimas() > geriausiasFilmas.getIvertinimas()) {
                geriausiasFilmas = filmai[i];
            }
        }
        return geriausiasFilmas;
    }
    public static int skaiciuotiGeriauIvertintus(Filmai[] filmai, double ivertinimas) {
        int kiekis = 0;
        for (int i = 0; i < filmai.length; i++) {
            if (filmai[i].getIvertinimas() > ivertinimas) {
                kiekis++;
            }
        }
        return kiekis;
    }
        public static double apskaiciuotiBendraKaina(Filmai[] filmai, int[] pasirinktiId) {
            double bendraKaina = 0;
            for (int i = 0; i < pasirinktiId.length; i++) {
                int id = pasirinktiId[i];
                for (int j = 0; j < filmai.length; j++) {
                    Filmai filmas = filmai[j];
                    if (filmas.getId() == id) {
                        bendraKaina += filmas.getKaina();
                        break;
                    }
                }
            }
            return bendraKaina;
        }
}
