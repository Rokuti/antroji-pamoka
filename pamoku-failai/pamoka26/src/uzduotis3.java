public class uzduotis3 {
    public static void main(String[] args) {
        String zodis = "Antanas";
        String zodis2 = "rope";
        System.out.println(kurisIlgesnis(zodis,zodis2));
        String z1 = "kelmas";
        String z2 = "skruzdelynas";
        System.out.println(kurisIlgesnis(z1,z2));
        String z3 = "masina";
        String z4 = "metras";
        System.out.println(kurisIlgesnis(z3,z4));
        String s1 = "medis";
        String s2 = "meska";
        System.out.println(kurisDidesnis(s1.length(),s2.length()));
    }
    public static int kurisIlgesnis(String zodis,String zodis2){
        if(zodis.length()>zodis2.length()){
            return -1;
        } else if (zodis.length()<zodis2.length()) {
            return 1;
        }return 0;
    }
    public static int kurisDidesnis(int zodis,int zodis2){
        if(zodis>zodis2){
            return -1;
        } else if (zodis<zodis2) {
            return 1;
        }return 0;
    }
}
