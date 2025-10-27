import java.util.Scanner;

public class main {

    public static int sumAndavgArr(int []arr, int n){
        if(n==1){
            return arr[0];
        }
        return arr[n-1] + sumAndavgArr(arr, n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int sumAvg = sumAndavgArr(arr, n);

        double Average = (double) sumAvg / n;
        System.out.println("Sum of Array is: " + sumAvg);
        System.out.println("Average of Array is: " + Average);

        scn.close();
    }
}
