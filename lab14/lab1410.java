import java.util.Scanner;

public class lab1410 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int n;

        do {
            n = sc.nextInt();
            if (n != 0 && n < min) {
                min = n;
            }
        } while (n != 0);

        System.out.println("Min: " + min);
    }
}