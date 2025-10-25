import java.util.Scanner;

public class main {
    public static int Fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fib(n-1) + Fib(n-2);

    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(Fib(i));
        }
    }
}
