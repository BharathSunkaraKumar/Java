import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        // System.out.println("hello " + arg[0]);
        // System.out.println("hello " + arg[1]);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(18);
        arr.add(56);
        arr.add(78);
        arr.add(99);
        System.out.println(arr);
        arr.remove(1);
        arr.add(57);
        arr.set(1, 188);
        System.out.println(arr);
        System.out.println(arr.size());
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf(18));
    }
}
