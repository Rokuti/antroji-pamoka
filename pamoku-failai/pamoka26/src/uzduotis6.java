public class uzduotis6 {
    public static void main(String[] args) {
        String s1 = "ananasas";
        String s2 = "anakonda";
        String s3 = "antanas";
        String s4 = "masina";
        String s5 = "asotis";
        verboseCompare(s1, s2);
        verboseCompare(s3, s4);
        verboseCompare(s1, s5);
    }

    public static void verboseCompare(String s1, String s2) {
        System.out.println("Comparing \"" + s1 + "\" to \"" + s2 + "\"...");

        int comparisonResult = s1.compareTo(s2);
        System.out.println("The result of the comparison was " + comparisonResult);

        System.out.print("This means that \"" + s1 + "\" ");
        if (comparisonResult < 0) {
            System.out.println("lexicographically precedes \"" + s2 + "\".");
        } else if (comparisonResult > 0) {
            System.out.println("lexicographically follows \"" + s2 + "\".");
        } else {
            System.out.println("equals \"" + s2 + "\".");
        }
        System.out.println();
    }
}
