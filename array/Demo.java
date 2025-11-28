import java.util.Arrays;

class Demo {
    public static void main(String[] str) {
        System.out.println("arrays");
        char vowels[] = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        System.out.println(Arrays.toString(vowels));
    }
}