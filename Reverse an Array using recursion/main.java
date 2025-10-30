import java.util.Scanner;

public class main {

    public static void reverseArray(int []arr, int start, int end){
        if(start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr, start + 1, end - 1);
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        reverseArray(arr, 0 , n-1);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        scn.close();
    }
}
