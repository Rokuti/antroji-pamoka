public class uzduotis2 {
    public static void main(String[] args) {
    String zodis = "ananasas";
        System.out.println("paskutine raide :"+ paskutineRaide(zodis));
        String z1 = "Sakinys";
        System.out.println(z1+ " paskutine raide :"+ paskutineRaide(z1));
        String z2 = "meska";
        System.out.println(paskutineRaide(z2));
    }
    public static char paskutineRaide(String zodis){
        return zodis.charAt(zodis.length() - 1);
    }
}
