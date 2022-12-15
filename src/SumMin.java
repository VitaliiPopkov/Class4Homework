import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // #1 Вывести нечетные числа
        for (int i = a; i < b; i++) {
            if (i % 2 != 0) {
                System.out.println("non-even numbers: " + i);
            }
        }
        // #2 выведите суму всех чисел
        int sum = 0;
        for (int i = a + 1; i < b; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("The sum of all the entered numbers is: " + sum);
    }
}
