public class Coins {
    public static void main(String[] args) {
        int total, quarters, cents;
        total = Integer.parseInt(args[0]);
        quarters = total / 25;
        cents = total % 25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}
