
import java.util.Scanner;

public class lab1402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Оң сан енгізіңіз: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Сіз енгіздіңіз: " + number);
    }
}