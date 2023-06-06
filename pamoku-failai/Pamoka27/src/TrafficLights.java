public class TrafficLights {
    public static void main(String[] args) {
        String current = "green";
        System.out.println(updateLight(current));
    }

    public static String updateLight(String current) {
        if (current == "green") {
            return "yellow";
        } else if (current == "yellow") {
            return "red";
        } else if (current == "red") {
            return "green";
        }
        return "not in range";
    }
}
