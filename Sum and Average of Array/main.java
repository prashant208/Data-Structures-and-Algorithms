import java.util.Scanner;

public class main {

    public static int sumAvgArr(int[]arr, int n){
        int sum = 0;
        for(int i=1; i<arr.length; i++){
            sum += arr[i];
        }
        int average = sum/n;
        return average;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int sumAvg = sumAvgArr(arr, n);
        System.out.println("Sum and Average of Array is:" + sumAvg);

        scn.close();
    }
}
