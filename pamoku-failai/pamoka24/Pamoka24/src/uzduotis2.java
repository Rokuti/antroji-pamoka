public class uzduotis2 {
    public static void main(String[] args) {
        double i = 1679.25;
        double p = 2631.25;
        System.out.println(arApsimoka(p,i));
        double pa = 1131.25;
        double is = 1325.25;
        System.out.println(arApsimoka(pa,is));
        double paj = 2300.25;
        double isl = 2300.25;
        System.out.println(arApsimoka(paj,isl));
    }
    public static boolean arApsimoka (double pajamos,double islaidos){
        if(pajamos - islaidos > 0){
            return true;
        } return false;
    }
}
