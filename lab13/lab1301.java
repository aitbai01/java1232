import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + age + " " + grade;
    }
}

public class lab1301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add two numbers (Lambda)");
            System.out.println("2. To Uppercase");
            System.out.println("3. Filter odd numbers");
            System.out.println("4. Square numbers");
            System.out.println("5. Find max");
            System.out.println("6. Sort strings by length");
            System.out.println("7. First letter uppercase");
            System.out.println("8. Filter length > 5");
            System.out.println("9. Method reference");
            System.out.println("10. Optional min");
            System.out.println("11. Consumer");
            System.out.println("12. Supplier");
            System.out.println("13. Comparator");
            System.out.println("14. Student filter/sort");
            System.out.println("15. Stream chaining");
            System.out.println("16. groupingBy");
            System.out.println("17. reduce sum");
            System.out.println("18. distinct + limit");
            System.out.println("19. flatMap");
            System.out.println("20. Orders example");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
                    System.out.println(add.apply(5, 3));
                    break;

                case 2:
                    Function<String, String> upper = s -> s.toUpperCase();
                    System.out.println(upper.apply("hello"));
                    break;

                case 3:
                    List<Integer> list1 = Arrays.asList(1,2,3,4,5);
                    list1.stream().filter(x -> x % 2 != 0).forEach(System.out::println);
                    break;

                case 4:
                    List<Integer> list2 = Arrays.asList(1,2,3);
                    list2.stream().map(x -> x * x).forEach(System.out::println);
                    break;

                case 5:
                    List<Integer> list3 = Arrays.asList(5,9,2);
                    int max = list3.stream().max(Integer::compare).orElse(0);
                    System.out.println(max);
                    break;

                case 6:
                    List<String> strs = Arrays.asList("Java", "Hi", "Programming");
                    strs.stream()
                            .sorted(Comparator.comparing(String::length))
                            .forEach(System.out::println);
                    break;

                case 7:
                    Function<String, String> cap = s ->
                            s.substring(0,1).toUpperCase() + s.substring(1);
                    System.out.println(cap.apply("java"));
                    break;

                case 8:
                    List<String> strs2 = Arrays.asList("hi","hello","welcome");
                    strs2.stream().filter(s -> s.length() > 5)
                            .forEach(System.out::println);
                    break;

                case 9:
                    List<Integer> nums = Arrays.asList(1,2,3);
                    nums.forEach(System.out::println);
                    break;

                case 10:
                    List<Integer> nums2 = Arrays.asList(7,2,9);
                    int min = nums2.stream().min(Integer::compare).orElse(0);
                    System.out.println(min);
                    break;

                case 11:
                    Consumer<String> printer = x -> System.out.println(x);
                    printer.accept("Hello Consumer");
                    break;

                case 12:
                    Supplier<Integer> random = () -> new Random().nextInt(100);
                    System.out.println(random.get());
                    break;

                case 13:
                    List<String> names = Arrays.asList("Ali","Zara","Bob");
                    names.stream()
                            .sorted(Comparator.comparing(s -> s))
                            .forEach(System.out::println);
                    break;

                case 14:
                    List<Student> students = Arrays.asList(
                            new Student("Ali",20,85),
                            new Student("Bob",22,70),
                            new Student("Sara",21,90)
                    );

                    students.stream()
                            .filter(s -> s.grade > 80)
                            .sorted(Comparator.comparing(s -> s.name))
                            .forEach(System.out::println);
                    break;

                case 15:
                    List<Integer> chain = Arrays.asList(1,2,3,4,5);
                    chain.stream()
                            .filter(x -> x > 2)
                            .map(x -> x * 2)
                            .forEach(System.out::println);
                    break;

                case 16:
                    List<Student> groupList = Arrays.asList(
                            new Student("A",20,80),
                            new Student("B",20,90),
                            new Student("C",21,85)
                    );

                    Map<Integer, List<Student>> grouped =
                            groupList.stream()
                                    .collect(Collectors.groupingBy(s -> s.age));

                    System.out.println(grouped);
                    break;

                case 17:
                    List<Integer> sumList = Arrays.asList(1,2,3,4);
                    int sum = sumList.stream().reduce(0, Integer::sum);
                    System.out.println(sum);
                    break;

                case 18:
                    List<Integer> d = Arrays.asList(1,2,2,3,3,4);
                    d.stream().distinct().limit(3)
                            .forEach(System.out::println);
                    break;

                case 19:
                    List<List<Integer>> lists = Arrays.asList(
                            Arrays.asList(1,2),
                            Arrays.asList(3,4)
                    );
                    lists.stream()
                            .flatMap(List::stream)
                            .forEach(System.out::println);
                    break;

                case 20:
                    List<Integer> orders = Arrays.asList(100, 200, 300);
                    orders.stream()
                            .filter(o -> o > 150)
                            .map(o -> o * 0.9)
                            .forEach(System.out::println);
                    break;

                case 0:
                    System.out.println("Exit...");
                    return;

                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}