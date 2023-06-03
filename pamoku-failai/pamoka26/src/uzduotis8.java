public class uzduotis8 {
    public static void main(String[] args) {
        String s1 = "anakonda";
        String s2 = "antanas";
        String s3 = "gerve";
        String s4 = "rikis";
        System.out.println(kokiaGimine(s1));
        System.out.println(kokiaGimine(s2));
        System.out.println(kokiaGimine(s3));
        System.out.println(kokiaGimine(s4));
    }
    public static String kokiaGimine (String wow){
        if (wow.charAt(wow.length() - 1) =='s'){
    return "Vyriskos";
        }return "Moteriskos";
    }
}
