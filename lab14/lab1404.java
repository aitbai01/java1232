
import java.util.Scanner;

public class lab1404 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correct = "12345";
        String input;

        do {
            System.out.print("Құпиясөз: ");
            input = scanner.nextLine();
        } while (!input.equals(correct));

        System.out.println("Қол жеткізілді!");
    }
}