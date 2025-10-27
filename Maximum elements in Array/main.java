import java.util.Scanner;

public class main {

    public static int maxArray(int []arr){
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

        int max = maxArray(arr);
        System.out.println("Max Element in Array is:" + max);

        scn.close();
    }
}
