public class kurieDidesni {
    public static void main(String[] args) {
String a = "LabaDiena123";
String b = "VisoGero4252";
        System.out.println(kurisDidesnis(a,b));
        String c = "keliSkaiciai5454";
        String d = "darSkaiciu111";
        System.out.println(kurisDidesnis(c,d));
    }
    public static String kurisDidesnis (String a, String b){
        if (Integer.parseInt(a.substring(a.length() - 3)) >
                (Integer.parseInt(b.substring(b.length() - 3)))){
                    return "pirmas didesnis";
        }return  "Antras didesnis";
    }
}
