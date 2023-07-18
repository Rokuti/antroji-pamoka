// A function that creates a Java project, creates a Programa.java file (class), and creates a main function in that file
public class mergeArays {
    // The main function
    public static void main(String[] args) {
        // Create two int arrays for testing
        int[] x = {3, 5, 8};
        int[] y = {2, 7, 12, 9};
        // Call the mergeArrays function and print the result
        int[] result = mergeArrays(x, y);
        System.out.println(java.util.Arrays.toString(result));
    }

    // A function that takes two int arrays and merges them into one big array and returns it
    public static int[] mergeArrays(int[] a, int[] b) {
        // Get the lengths of the two arrays
        int aLength = a.length;
        int bLength = b.length;
        // Create a new array with the sum of the lengths of the two arrays
        int[] merged = new int[aLength + bLength];
        // Loop through the first array and copy its elements to the new array
        for (int i = 0; i < aLength; i++) {
            merged[i] = a[i];
        }
        // Loop through the second array and copy its elements to the new array after the first array's elements
        for (int j = 0; j < bLength; j++) {
            merged[aLength + j] = b[j];
        }
        // Return the new array
        return merged;
    }
}