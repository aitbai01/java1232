import java.util.Scanner;

public class tap1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expr = sc.nextLine(); // мысалы: 2 + 3

        String[] parts = expr.split(" ");

        double a = Double.parseDouble(parts[0]);
        String op = parts[1];
        double b = Double.parseDouble(parts[2]);

        switch (op) {
            case "+": System.out.println(a + b); break;
            case "-": System.out.println(a - b); break;
            case "*": System.out.println(a * b); break;
            case "/": System.out.println(a / b); break;
        }
    }
}