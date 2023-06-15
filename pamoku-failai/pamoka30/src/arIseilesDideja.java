public class arIseilesDideja {
    public static void main(String[] args) {
    double[] didejimoTvarka = {11.11,12.12,13.14,15,16};
        System.out.println("ar pirmas didejimo tvarka :" + arDidejimoTvarka(didejimoTvarka));
        double [] neDidejimo = {10,18,26,34.25,25};
        System.out.println("ar antras didejimo tvarka :"+ arDidejimoTvarka(neDidejimo));
    }
    public static boolean arDidejimoTvarka (double[] a){
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    }
