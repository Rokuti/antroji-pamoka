import java.util.Arrays;

public class arYraDviejuosePasikartojanciu {
    public static void main(String[] args) {
        int[] m1 = {5, 3, 8, 20, 7, 9, 4};
        int[] m2 = {20, 3, 4, 15, 17, 80};
        System.out.println("pasikartojantys skaiciai :" + Arrays.toString(getIntersection(m1,m2)));

    }
    public static int[] getIntersection(int[] array1, int[] array2) {
        int[] temp = new int[Math.min(array1.length, array2.length)];
        int intersectionCount = 0;
        for (int value1 : array1) {
            for (int value2 : array2) {
                if (value1 == value2) {
                    boolean isDuplicate = false;
                    for (int i = 0; i < intersectionCount; i++) {
                        if (temp[i] == value1) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        temp[intersectionCount++] = value1;
                    }
                }
            }
        }
        int[] intersection = new int[intersectionCount];
        System.arraycopy(temp, 0, intersection, 0, intersectionCount);
        return intersection;
    }
}
