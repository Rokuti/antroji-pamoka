import java.util.Arrays;

public class trijuDidziausiuSuma {
    public static void main(String[] args) {
        int [] isbandom = {13,99,97,24,36,98};
        System.out.println(sumOfThreeLargest(isbandom));
        double[] isbandom2 = {11.11,12,14,16.16,14.14,99};
        int i1 = 3;
        int i2 = 5;
        swapElements(isbandom2,i1,i2);
    }
    public static int sumOfThreeLargest(int[] arr) {
        // Sort the array in ascending order
        Arrays.sort(arr);
        // Get the length of the array
        int n = arr.length;
        // Check if the array has at least three elements
        if (n < 3) {
            return -1; // or throw an exception
        }
        // Add the last three elements of the sorted array
        int sum = arr[n - 1] + arr[n - 2] + arr[n - 3];
        // Return the sum
        return sum;
    }
    public static boolean moreTrueThanFalse(boolean[] array) {
        int trueCount = 0;
        for (boolean value : array) {
            if (value) {
                trueCount++;
            }
        }
        return trueCount > array.length / 2;
    }
    public static void swapElements(double[] array, int i1, int i2) {
        double temp = array[i1];
        array[i1] = array[i2];
        array[i2] = temp;
        System.out.println(Arrays.toString(array));
    }
}
