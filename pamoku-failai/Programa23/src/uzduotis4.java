public class uzduotis4 {
    public static void main(String[] args) {
        String a = "Laba Diena :)";
        String b = "LAba Diena";
        System.out.println(arVienodi(a,b));

    }
    public static boolean arVienodi (String a, String b){
        if ( a == b){
            return true;
        }
        return false;
    }
}
