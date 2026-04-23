import java.util.Scanner;

public class lab1405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сан: ");
        int n = scanner.nextInt();

        int fact = 1, i = 1;

        do {
            fact *= i;
            i++;
        } while (i <= n);

        System.out.println("Факториал: " + fact);
    }
}