public class Casting01 {
    public static void main(String[] args) {
        byte num1;
        short num2 = 128;
        num1 = (byte) num2;

        byte num3 = 127;
        num3 += 1;
        num3 += 1;

        System.out.println(num3);

    }
}
