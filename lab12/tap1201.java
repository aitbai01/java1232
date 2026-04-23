import java.util.Scanner;

public class tap1201 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. String length");
            System.out.println("2. Upper/Lower case");
            System.out.println("3. Word count");
            System.out.println("4. Reverse words");
            System.out.println("5. Search word");
            System.out.println("6. Replace word");
            System.out.println("7. Palindrome check");
            System.out.println("8. Compare strings");
            System.out.println("9. Split string");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer тазалау

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String str1 = scanner.nextLine();
                    System.out.println("Length: " + str1.length());
                    break;

                case 2:
                    System.out.print("Enter text: ");
                    String str2 = scanner.nextLine();
                    System.out.println("Upper: " + str2.toUpperCase());
                    System.out.println("Lower: " + str2.toLowerCase());
                    break;

                case 3:
                    System.out.print("Enter sentence: ");
                    String sentence = scanner.nextLine();
                    String[] words = sentence.trim().split("\\s+");
                    System.out.println("Word count: " + words.length);
                    break;

                case 4:
                    System.out.print("Enter sentence: ");
                    String s = scanner.nextLine();
                    String[] w = s.split(" ");
                    for (String word : w) {
                        String reversed = new StringBuilder(word).reverse().toString();
                        System.out.print(reversed + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter sentence: ");
                    String text = scanner.nextLine();
                    System.out.print("Enter word to search: ");
                    String find = scanner.nextLine();

                    if (text.contains(find)) {
                        System.out.println("Found!");
                    } else {
                        System.out.println("Not found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter sentence: ");
                    String original = scanner.nextLine();
                    System.out.print("Word to replace: ");
                    String oldWord = scanner.nextLine();
                    System.out.print("New word: ");
                    String newWord = scanner.nextLine();

                    System.out.println("Result: " + original.replace(oldWord, newWord));
                    break;

                case 7:
                    System.out.print("Enter text: ");
                    String input = scanner.nextLine();
                    String reversed = new StringBuilder(input).reverse().toString();

                    if (input.equalsIgnoreCase(reversed)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not palindrome");
                    }
                    break;

                case 8:
                    System.out.print("First string: ");
                    String a = scanner.nextLine();
                    System.out.print("Second string: ");
                    String b = scanner.nextLine();

                    if (a.equals(b)) {
                        System.out.println("Equal");
                    } else {
                        System.out.println("Not equal");
                    }
                    break;

                case 9:
                    System.out.print("Enter sentence: ");
                    String line = scanner.nextLine();
                    System.out.print("Enter delimiter: ");
                    String delimiter = scanner.nextLine();

                    String[] parts = line.split(delimiter);
                    for (String part : parts) {
                        System.out.println(part);
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}