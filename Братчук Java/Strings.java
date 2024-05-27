import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the string A:");
        String a = userInput.nextLine();
        System.out.println("Enter the string B:");
        String b = userInput.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

    }
}
