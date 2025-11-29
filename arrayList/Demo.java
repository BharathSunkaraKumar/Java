import java.util.ArrayList;
import java.util.Comparator;

class Demo {
    public static void main(String[] arg) {
        System.out.println("array list");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        // numbers.remove(1); // its remove by index
        // numbers.remove(Integer.valueOf(5));
        // numbers.clear();
        // numbers.set(2, Integer.valueOf(30));
        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());
    }
}