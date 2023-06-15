import java.util.Arrays;

public class leaders {
    public static void main(String[] args) {
      int[]  masyvas = {3, 7, 1, 5, 4, 3, 1, 2};
        System.out.println(Arrays.toString(getLeaders(masyvas)));
    }
    public static int[] getLeaders(int[] array) {
        int[] temp = new int[array.length];
        int leaderCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) {
                temp[leaderCount++] = array[i];
            }
        }
        int[] leaders = new int[leaderCount];
        for (int i = 0; i < leaderCount; i++) {
            leaders[i] = temp[i];
        }
        return leaders;
    }
}
