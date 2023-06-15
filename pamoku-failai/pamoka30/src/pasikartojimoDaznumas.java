public class pasikartojimoDaznumas {
    public static void main(String[] args) {

    }
    public static int findMostFrequent(byte[] arr) {
        int[] frequency = new int[128];
        for (int i = 0; i < arr.length; i++) {
            frequency[arr[i]]++;
        }
        int maxCount = 0;
        int mostFrequent = -1;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxCount) {
                maxCount = frequency[i];
                mostFrequent = i;
            }
        }
        return mostFrequent;
    }
}
