import java.util.InputMismatchException;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number A:");
            Scanner userInput = new Scanner(System.in);
            int a = userInput.nextInt();
            System.out.println("Enter the number B:");
            int b = userInput.nextInt();

            if (a < b) {
                System.out.println("A < B");
            } else if (a > b) {
                System.out.println("A > B");
            } else {
                System.out.println("A = B");
            }

            System.out.println("A+B=" + (a + b));
            System.out.println("A-B=" + (a - b));
            System.out.println("A*B=" + (a * b));
            try {
                System.out.println("A/B=" + (a / b));
            } catch (ArithmeticException e1) {
                System.out.println("division by zero is not correct");
            }

        } catch (InputMismatchException e2) {
            System.out.println("You should enter the correct number");
        }

    }
}