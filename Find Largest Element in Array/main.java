import java.util.Scanner;

public class main {

    public static int findLargest(int []arr){
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int []arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int largest = findLargest(arr);
        System.out.println("Largest element in array is: " + largest);

        scn.close();
        
    }
}
