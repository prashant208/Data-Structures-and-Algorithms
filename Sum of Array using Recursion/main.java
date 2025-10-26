import java.util.Scanner;

public class main {

    public static int sumArray(int []arr, int n){
        if(n==0){
            return 0;
        }
        return arr[n-1] + sumArray(arr, n-1);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int sum = sumArray(arr, n);
        System.out.println("Sum of Array is:" + sum);
        scn.close();
    }
}
