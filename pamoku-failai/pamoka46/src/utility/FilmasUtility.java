package utility;

import entity.Filmas;

import java.util.ArrayList;

public class FilmasUtility {
    public static ArrayList<Filmas> filtruotiPagalPajamos (ArrayList<Filmas> filmai, double pelnas) {
        ArrayList<Filmas> pelningi = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getPelningumas() > pelnas ){
                pelningi.add(filmas);
            }
        } return pelningi;
    }
    public static void isvestiFilmus(ArrayList<Filmas> filmai) {
        for (Filmas filmas : filmai) {
            System.out.println("filmas = " + filmas);
        }
    }
    public static ArrayList<Filmas> filtruotiPagalZanra(String zanras, ArrayList<Filmas> filmai) {
        ArrayList<Filmas> prafiltruoti = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getZanras().equalsIgnoreCase(zanras)) {
                prafiltruoti.add(filmas);
            }
        }
        return prafiltruoti;
    }
    public static ArrayList<Filmas> filtruotiTikPelningus (ArrayList<Filmas> filmai) {
        ArrayList<Filmas> pelningi = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getPelningumas() > 1 ){
                pelningi.add(filmas);
            }
        } return pelningi;
    }
    public static ArrayList<Filmas> filtruotiZiurovu (ArrayList<Filmas> filmai) {
        ArrayList<Filmas> pelningi = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getZiurovuIvertinimas() > filmas.getEkspertuIvertinimas() ){
                pelningi.add(filmas);
            }
        } return pelningi;
    }
    public static ArrayList<Filmas> filtruotiPagalMetus (ArrayList<Filmas> filmai, int pradzia, int iki) {
        ArrayList<Filmas> pelningi = new ArrayList<>();
        for (Filmas filmas : filmai) {
            if (filmas.getIsleidimoMetai() <= iki)
                if (pradzia <= filmas.getIsleidimoMetai()) {
                    continue;
                }
            pelningi.add(filmas);
        } return pelningi;
    }
}
