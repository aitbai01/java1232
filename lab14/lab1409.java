import java.util.Scanner;

public class lab1409 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass;

        do {
            System.out.print("Password: ");
            pass = sc.nextLine();
        } while (pass.length() < 6);

        System.out.println("OK");
    }
}