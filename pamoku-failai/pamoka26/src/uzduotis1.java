public class uzduotis1 {
    public static void main(String[] args) {
String a = "Antanas";
int x = 5;
        System.out.println(arIlgesnis(a,x));
        String b = "rope";
        int c = 7;
        System.out.println(arIlgesnis(b,c));
    }
    public static boolean arIlgesnis(String zodis, int x){
        if (zodis.length()>x){
            return true;
        } return false;
    }
}
