import java.util.Scanner;

public class main {

    public static int minArray(int []arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1], minArray(arr, n-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int min = minArray(arr, n);
        System.out.println("Min of Array is: " + min);

        scn.close();
    }
}
