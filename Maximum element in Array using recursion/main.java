import java.util.Scanner;

public class main {

    public static int maxArray(int []arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.max(arr[n-1], maxArray(arr, n-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = maxArray(arr, n);
        System.out.println("Max of Array is: " + max);

        scn.close();
    }
}
