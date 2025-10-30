import java.util.Scanner;
import java.util.Arrays;

public class main {

    public void reverseInGroups(int[] arr, int k){

        if(k <= 0){
            System.out.println("Invalid group size. k must be > 0");
            return;
        }
        if(k == 1){
            return;
        }

        if (k >= arr.length) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return;
        }

        // ✅ Normal case: reverse in groups of k
        for (int start = 0; start < arr.length; start += k) {
            int left = start;
            int right = Math.min(start + k - 1, arr.length - 1); // handle last smaller group

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        reverseInGroups(arr, k);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        scn.close();
    }
}
