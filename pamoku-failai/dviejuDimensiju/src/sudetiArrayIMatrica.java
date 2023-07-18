import java.util.Arrays;

public class sudetiArrayIMatrica {
    public static void main(String[] args) {
        int [] a1 = {1,2,3};
        int [] b1 = {4,5,6};
        int[] c1 = {7, 8, 9};
        int[] d2 = {10, 11, 12};
        int[] e3 = {13, 14, 15};


        combineArrays(a1,b1,c1,d2,e3);
    }
    public static void combineArrays(int[] a, int[] b, int[] c, int[] d, int[] e) {
        int[][] result = new int[5][];
        result[0] = a;
        result[1] = b;
        result[2] = c;
        result[3] = d;
        result[4] = e;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    int[] a = {1, 2, 3};
    int[] b = {4, 5, 6};
    int[] c = {7, 8, 9};
    int[] d = {10, 11, 12};
    int[] e = {13, 14, 15};

    public static int[][] combineArray(int[] a, int[] b, int[] c, int[] d, int[] e) {
        int[][] result = new int[5][a.length];
        for (int i = 0; i < a.length; i++) {
            result[0][i] = a[i];
            result[1][i] = b[i];
            result[2][i] = c[i];
            result[3][i] = d[i];
            result[4][i] = e[i];
        }
        return result;
    }



}
