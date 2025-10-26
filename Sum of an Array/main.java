import java.util.Scanner;

public class main {

    public static int sumArray(int []arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int sum = sumArray(arr);
        System.out.println("Sum of Array is:" + sum);
        scn.close();
    }
}
