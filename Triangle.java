public class Triangle {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        boolean isTri = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
        System.out.println(side1 + ", " + side2 + ", " + side3 + ": " + isTri);
    }
}
