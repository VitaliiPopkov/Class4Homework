import java.util.Scanner;

public class TaskInLesson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = in.nextDouble();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "kg = " + price * i + "$");

        }
    }
}
