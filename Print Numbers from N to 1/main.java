import java.util.Scanner;

public class main{

    public static void printNto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printNto1(n);
    }
}