
class Demo {
    public static void main(String arg[]) {
        int nums[] = { 1, 2, 3, };
        int arr[] = new int[4]; // dynamic
        // System.out.println(nums[0]);
        nums[2] = 5;
        for (int n : arr) {
            System.out.println(n);
        }
    }
}