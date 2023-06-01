public class uzduotis6arKelemieji {
    public static void main(String[] args) {
 int x = 2022;
        System.out.println("x metai :"+arKelemieji(x));
        int y = 2024;
        System.out.println("y metai :"+arKelemieji(y));
    }
    public static String arKelemieji(int x){
        if (x<1582){
            return "Tada dar nebuvo keliamuju metu";
        } else if (x % 4 == 0) {
            return "Sie metai yra kelemieji";
        }return " Sie metai nera keliamieji";
    }
}
