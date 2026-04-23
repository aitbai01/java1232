import java.util.Scanner;

public class lab1403 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int number = scanner.nextInt();

        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);

        System.out.println("Қосынды: " + sum);
    }
}