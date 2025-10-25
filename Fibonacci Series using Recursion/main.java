import java.util.Scanner;

public class main {

    public static void Fib(int a, int b, int n){
        if(n==0) return;

        int c = a + b;
        System.out.println(c);
        Fib(b, c, n-1);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
        }
        if(n==0){
            return;
        }
        System.out.println(0);
        if(n==1){
            return;
        }
        System.out.println(1);
        Fib(0,1,n-2);
    }
}
