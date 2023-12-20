/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
import java.util.concurrent.ThreadLocalRandom;
public class Gen3 {
    public static void main(String[] args) {
        
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int random1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int random2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int random3 = ThreadLocalRandom.current().nextInt(min, max + 1);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int minNumber = Math.min(random1, Math.min(random2, random3));
        System.out.println("The minimal generated number was " + minNumber);
    }
}
