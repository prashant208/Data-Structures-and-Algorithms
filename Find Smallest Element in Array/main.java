import java.util.Scanner;

public class main {

    public static int findSmallest(int []arr){
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int smallest = findSmallest(arr);

        System.out.println("Smallest element in Array is:" + smallest);

        scn.close();
    }
}
