import java.util.Scanner;

public class main {

    public static int thirdLargest(int[] arr) {

        if (arr.length < 3) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // skip duplicates
            if (arr[i] == first || arr[i] == second || arr[i] == third)
                continue;

            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            } else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third) {
                third = arr[i];
            }
        }

        // check if 3 distinct numbers exist
        if (third == Integer.MIN_VALUE)
            return -1;

        return third;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int third = thirdLargest(arr);
        System.out.println("Third Largest Element in Array: " + third);

        scn.close();
    }
}
