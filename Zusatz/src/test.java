import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Diese Beispielklasse ermittelt 6 Zufallszahlen aus dem Zahlenbereich von 1 bis 49.
 * Die ermittelten Zahlen werden in aufsteigend sortierter Reihenfolge ausgegeben.
 *
 * @author Gernot Segieth
 */
public class test {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();
        Random random = new Random();

        System.out.println("Ziehung der Lottozahlen - 6 aus 49\n");
        while(numbers.size() < 6) {
            int n = random.nextInt(50);
            if(n > 0) {
            	numbers.add(n);
            }
        }
        System.out.println(Arrays.toString(numbers.toArray()));
    }
}