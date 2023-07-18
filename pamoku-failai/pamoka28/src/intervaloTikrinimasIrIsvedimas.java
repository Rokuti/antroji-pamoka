public class intervaloTikrinimasIrIsvedimas {
    public static void main(String[] args) {
        String intervalas ="[100,200)";
        printIntegers(intervalas);
        String i2 = "(25,58]";
        printIntegers(i2);
    }
    // A function that takes an interval as a string and prints all the integers in it
    public static void printIntegers(String interval) {
        // Check if the interval is valid
        if (interval == null || interval.length() < 5 ||
                interval.charAt(0) != '(' && interval.charAt(0) != '[' ||
                interval.charAt(interval.length() - 1) != ')' && interval.charAt(interval.length() - 1) != ']') {
            System.out.println("Invalid interval");
            return;
        }
        // Split the interval by comma and trim the brackets
        String[] parts = interval.substring(1, interval.length() - 1).split(",");
        // Parse the lower and upper bounds as integers
        int lower = Integer.parseInt(parts[0].trim());
        int upper = Integer.parseInt(parts[1].trim());
        // Check if the lower bound is smaller than the upper bound
        if (lower > upper) {
            System.out.println("Empty interval");
            return;
        }
        // Loop from the lower bound to the upper bound
        for (int i = lower; i <= upper; i++) {
            // Check if the lower bound is inclusive or exclusive
            if (i == lower && interval.charAt(0) == '(') {
                continue;
            }
            // Check if the upper bound is inclusive or exclusive
            if (i == upper && interval.charAt(interval.length() - 1) == ')') {
                break;
            }
            // Print the integer
            System.out.println(i);
        }
    }
}
