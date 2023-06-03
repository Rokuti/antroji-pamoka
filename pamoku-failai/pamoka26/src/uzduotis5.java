public class uzduotis5 {
    public static void main(String[] args) {
        String an = "ananasas";
        int i1 = 5;
        int i2 = 7;
        System.out.println(arVienodiIndeksuoti(an,i1,i2));
        int i3 = 0;
        int i4 = 7;
        System.out.println(arVienodiIndeksuoti(an,i3,i4));
    } public static boolean arVienodiIndeksuoti(String zodis, int i1, int i2){
        if (zodis.charAt(i1) == zodis.charAt(i2)){
            return true;
        } return false;
    }
}
