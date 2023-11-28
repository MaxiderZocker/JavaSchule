import java.util.Scanner;

public class Fibonacci2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben sie Ihre Zahl ein: ");
        long length = scan.nextLong()+1;
        scan.close();

        long[] fib = new long[(int) length];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < length; i++){
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
}