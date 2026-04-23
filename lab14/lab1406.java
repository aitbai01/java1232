import java.util.Scanner;

public class lab1406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Операция...");
            System.out.print("Жалғастыру? (yes/no): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Аяқталды");
    }
}