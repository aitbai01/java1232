import java.util.Scanner;

public class lab1407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.print("a: ");
            int a = scanner.nextInt();
            System.out.print("b: ");
            int b = scanner.nextInt();

            System.out.println("Қосынды: " + (a + b));

            scanner.nextLine();
            System.out.print("Жалғастыру? ");
            choice = scanner.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Аяқталды");
    }
}