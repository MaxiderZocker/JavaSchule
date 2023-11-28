import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


public class LottoV2 {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        Set<Integer> numberss = new TreeSet<>();
        Random random = new Random();
        boolean win=false;

        System.out.println("Ziehung der Lottozahlen - 6 aus 49\n");
        while(numbers.size() < 6) {
            int n = random.nextInt(50);
            if(n > 0) {
            	numbers.add(n);
            }
        }
        System.out.println(Arrays.toString(numbers.toArray()));
        int c=0;
        
        while (win==false) {
            Set<Integer> number = new TreeSet<>();
            c=0;
            while(number.size() < 6) {
                int b = random.nextInt(50);
                if(b > 0) {
                	number.add(b);
                	c=c+b;
                }
            }
            if (number==numbers) {
            	System.out.println("YEP");
            	win=true;
            }
            System.out.println(Arrays.toString(number.toArray()));
        }
        System.out.println("We Done YEP");
    }
}