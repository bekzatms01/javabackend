import java.util.Scanner;
public class Lesson1 {
    public static void main(String [] args) {
        byte value1 = 12;
        short value2 = 555;
        int value3 = 4_565_125;
        long value4 = 5L;

        char ch = 'C';
        double value5 = 45.6;
        float value6 = 78.5f;
        boolean isActor = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a height: ");
        int height = input.nextInt();

        System.out.println("Enter a width: ");
        int width = input.nextInt();
        int rectangleArea = height * width;

        System.out.println("Area: " + rectangleArea);

    }
}
