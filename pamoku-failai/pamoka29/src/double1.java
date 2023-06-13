import java.util.Arrays;

public class double1 {
    public static void main(String[] args) {
        double[] masyvas = {3.15,42.5,55.0,66.66};
        paskutinisIndeksas(masyvas);
        int[] ints = {3,5,66,47,101};
        System.out.println(Arrays.toString(masyvoKopija(ints)));
        masyvoIndeksuotaVieta(ints,3);
        System.out.println(masyvoElementuSudetis(ints,1,2));
        double[] masyva = {11,11,22.1,46.23,45};
        System.out.println(masyvoVidurkis(masyva));
    }
    public static void paskutinisIndeksas (double[] masyvas){
        System.out.println(masyvas[masyvas.length -1]);
    }
    public static int[] masyvoKopija(int[] masyva){
        int[] kopija = new int[masyva.length];
        for (int i = 0; i < masyva.length; i++) {
            kopija[i] += masyva[i];
        } return kopija;
    }
    public static void masyvoIndeksuotaVieta (int[] masyva, int indeksa){
        System.out.println(masyva[masyva.length-indeksa]);
    }
    public static int masyvoElementuSudetis (int[] masyva, int a, int b){
        return masyva[a] + masyva[b];
    }
    public static double masyvoVidurkis (double[] masyva){
        double naujas = 0;
        for (int i = 0; i < masyva.length; i++) {
            naujas += masyva[i];
        }return naujas / masyva.length;
    }
}
