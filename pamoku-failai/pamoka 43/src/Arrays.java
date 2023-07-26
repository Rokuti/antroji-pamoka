import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        Integer sk = 31;
        System.out.println("sk = " + sk);
        Double poKableliu = -4.1515;
        System.out.println("poKableliu = " + poKableliu);
        Boolean klaidinga = false;
        System.out.println("klaidinga = " + klaidinga);
        Character p = 'p';
        System.out.println("p = " + p);
        ArrayList<Integer> skaiciai = new ArrayList<>();
        skaiciai.add(27);
        skaiciai.add(-27);
        skaiciai.add(28);
        skaiciai.add(45);
        skaiciai.add(23);
        skaiciai.add(-12);
        skaiciai.add(420);
        skaiciai.add(421);
        skaiciai.add(150);
        skaiciai.add(277);
        skaiciai.remove(4);
        skaiciai.remove((Integer)150);
        skaiciai.set(3,27);
        System.out.println(skaiciai.get(0)+skaiciai.get(6));
        skaiciai.set(7,-10);
        Integer naujas = skaiciai.get(3);
        skaiciai.set(3,skaiciai.get(4));
        skaiciai.set(4,naujas);
        System.out.println("maziausias = "+surastiMaziausia(skaiciai));
        System.out.println("suma ="+ surastiSuma(skaiciai));
        System.out.println("Teigiamu suma = "+ surastiTeigiamuElementuSuma(skaiciai));
        findNumber(27,skaiciai);
    }
    public static int surastiMaziausia(ArrayList<Integer> skaiciai) {
        int min = skaiciai.get(0);
        for (int i = 0; i < skaiciai.size(); i++) {
            if (skaiciai.get(i) < min) {
                min = skaiciai.get(i);
            }
        }
        return min;
    }
    public static int surastiSuma(ArrayList<Integer> skaiciai) {
        int max = 0;
        for (int i = 0; i < skaiciai.size(); i++) {
                max += skaiciai.get(i);
        }
        return max;
    }
    public static int surastiTeigiamuElementuSuma(ArrayList<Integer> skaiciai) {
        int max = 0;
        for (int i = 0; i < skaiciai.size(); i++) {
            if (skaiciai.get(i) > 0) {
                max += skaiciai.get(i);
            }
        }
        return max;
    }
    public static void findNumber(int searchNumber, ArrayList<Integer> numbers) {
        int index = numbers.indexOf(searchNumber);
        if (index != -1) {
            System.out.println(searchNumber + " is at position " + index);
        } else {
            System.out.println(searchNumber + " is not in the list");
        }
    }
    public static void removeAllIfPresent(int searchNumber, ArrayList<Integer> numbers) {
        if (numbers.contains(searchNumber)) {
            numbers.clear();
        }
    }
    public void swapElements(ArrayList<Integer> numbers, int i1, int i2) {
        int temp = numbers.get(i1);
        numbers.set(i1, numbers.get(i2));
        numbers.set(i2, temp);
    }
}
