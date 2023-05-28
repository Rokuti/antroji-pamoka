public class Programa4 {
    public static void main(String[] args) {
        String p = "Penktadienis";
        System.out.println(trisKartus(p));
        String a = "Siandien as programuoju";
        System.out.println(trisKartus(a));

    }
    public static String trisKartus (String a){
       return (a+" "+a+" "+a);
    }
}
