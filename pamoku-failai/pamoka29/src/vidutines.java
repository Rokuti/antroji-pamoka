import java.lang.reflect.Array;
import java.util.Arrays;

public class vidutines {
    public static void main(String[] args) {
int [] a = {3, 5, 8, 12};
        System.out.println(Arrays.asList(a).contains("8"));
        boolean found = false;
        int searchedValue = 8;

        for(int x : a){
            if(x == searchedValue){
                found = true;
                break;
            }
        }

        System.out.println(found);
        System.out.println(mediana(a));
        System.out.println(Arrays.toString(atvirkstinisMasyvas(a)));
    }
    public static int[] filtruotiNeigiamus(int[] masyvas) {
        int[] prafiltruotas = new int[masyvas.length];
        int j = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < 0) {
                prafiltruotas[j] = masyvas[i];
                j++;
            }
        }
        return prafiltruotas;
    }
    public static int kieklyginiu(int[] masyvas) {
        int kiekis = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] % 2 == 0) {
                kiekis++;
            }
        }
        return kiekis;
    }
    public static int mediana (int[] a){
        return a[a.length/2];
    }
    public static int[] atvirkstinisMasyvas (int[] masyva){
        int[] naujasMasyvas = new int[masyva.length];
        for (int i = 0; i < masyva.length; i++) {
            naujasMasyvas [i] = masyva[masyva.length-1-i];
        } return naujasMasyvas;
    }
}
