public class lab1408 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 2;

        do {
            sum += i;
            i += 2;
        } while (i <= 100);

        System.out.println("Қосынды: " + sum);
    }
}