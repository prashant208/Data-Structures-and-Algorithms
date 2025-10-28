import java.lang.reflect.Array;
import java.util.Scanner;

public class main {

    public static void reverseArray(int []arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        scn.close();
    }
}
