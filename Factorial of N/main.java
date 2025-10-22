import java.util.Scanner;

public class main {

    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Invalid Input: Factorial not defined for negative numbers.");
            return -1;
        } else if (n == 0 || n == 1) {
            return 1; // base case
        } else {
            return n * factorial(n - 1); // recursive case
        }
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}