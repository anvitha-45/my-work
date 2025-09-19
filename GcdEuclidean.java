import java.util.Scanner;

public class GcdEuclidean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GcdEuclidean e=new GcdEuclidean();
        // Input two numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Find the greatest common divisor using Euclidean algorithm
        while (a != 0 && b != 0) {
            if (a >= b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        // Print the greatest common divisor
        if (a == 0) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}