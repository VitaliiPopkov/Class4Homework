import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scNum = new Scanner(System.in);
        int a = scNum.nextInt();
        for (int i = 0; i <= 10; i++) {
            int sum = 0;
            sum += a * i;
            System.out.println(a + " * " + i + " = " + sum);
        }

    }
}
