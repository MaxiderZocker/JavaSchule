import java.util.Scanner;

public class Faku {

    public static int f(int n) {

        if (n == 0) {
            return 1;
        } else
            return n * f(n - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Geben sie Ihre Fakultät ein: ");
            int n = f(scan.nextInt());
            System.out.println("Ihr Wert Lautet: " + n);
        }
        scan.close();

    }
}