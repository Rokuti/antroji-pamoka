import java.io.Serializable;

public class uzduotis4indeksas {
    public static void main(String[] args) {
        String a = "ananasas";
        int in = 5;
        System.out.println(indeksuotaRaie(a,in));
        String s = "sakinys";
        int i = 3;
        System.out.println(indeksuotaRaie(s,i));
        String meska = "meska";
        int i1 = 2;
        System.out.println(indeksuotaRaie(meska,i1));
        int perdaug = 10;
        System.out.println(indeksuotaRaie(meska,perdaug));

    }
    public static Serializable indeksuotaRaie(String a, int in){
        if ( in > a.length()){
            return "Indeksas per didelis";
        }
        return a.charAt(in);
    }
}
