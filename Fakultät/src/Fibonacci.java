import java.util.Scanner;

public class Fibonacci {

    public static int fib(int n) {

        if (n == 0) {
            return 1;
        } 
        else if (n == 1) {
        	return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
            }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Geben sie Ihre Zahl ein: ");
            int n = fib(scan.nextInt()-1);
            System.out.println("Ihre Fibonaccizahl Lautet: " + n);
        }
        scan.close();

    }
}