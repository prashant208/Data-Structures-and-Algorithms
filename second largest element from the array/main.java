import java.util.Scanner;

public class main {

    public static int sLargest(int []arr, int n){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int result = sLargest(arr, n);
        System.out.println("Second Largest element in Array is: " + result);

        scn.close();
    }
}
