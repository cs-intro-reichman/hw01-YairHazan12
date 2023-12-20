import java.util.concurrent.ThreadLocalRandom;
public class GenThree {
    public static void main(String[] args) {
        
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int random1 = ThreadLocalRandom.current().nextInt(min, max);
        int random2 = ThreadLocalRandom.current().nextInt(min, max);
        int random3 = ThreadLocalRandom.current().nextInt(min, max);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        int minNumber = Math.min(random1, Math.min(random2, random3));
        System.out.println("The minimal generated number was " + minNumber);
    }
}
