import java.util.Arrays;
import java.util.Scanner;

public class DviejuDimensiju {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scan.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = scan.nextInt();

        int[][] multidimensionalArray= new int[rows][columns];
        int suma = 0;
        int eiluciuSuma = 0;
        int daugybosSuma = 1;

        // Now you can use the array like a regular
        // 2-dimensional array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Iveskite "+"multidimensionalArray["+i+"]["+j+"] reiksme :");
                int reiksme = scan.nextInt();
                suma += reiksme;
                multidimensionalArray[i][j]= reiksme;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                eiluciuSuma += multidimensionalArray[i][j];
                System.out.print(multidimensionalArray[i][j]+ " ");
            }
            System.out.print("eilutes Suma = " + eiluciuSuma);
            eiluciuSuma = 0;
            System.out.println();
        }
        System.out.println(" visuSkaiciuSuma = " + suma);
        int maxSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;

        for (int i = 0; i < multidimensionalArray.length; i++) {
            int sum = 0;
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                sum += multidimensionalArray[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxRowIndex = i;
            }
        }

        System.out.println("Row index with highest sum: " + maxRowIndex + " with "+ maxSum);

        int neigiami = 0;

        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int j = 0; j < multidimensionalArray[i].length; j++) {
                int sum = 0;
                sum += multidimensionalArray[i][j];
                if (sum < 0) {
                    neigiami++;
                }
            }
        }
        System.out.println("Neigiamu Skaiciu yra: " + neigiami);
    }
}
