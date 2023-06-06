public class Greeter {
    public static void main(String[] args) {
        String name = "Rokas";
        System.out.println(greet(name));
        String n = "Johnny";
        System.out.println(greet(n));
    }
    public static String greet(String name) {
        if(name.equals("Johnny")){
            return "Hello, my love!";
        } else {
        return String.format("Hello, %s!", name);
        }
    }
}