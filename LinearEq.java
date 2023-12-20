public class LinearEq {
    public static void main(String[] args) {
        double a, b, c, x;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        x = (c-b)/a;
        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("X = " + x);
    }   
}
