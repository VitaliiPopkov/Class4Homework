import java.util.Scanner;

public class UnitsTensHundreds {
    public static void main(String[] args) {
        System.out.println("Please input some number(not equal to 0): ");
        Scanner scNum = new Scanner(System.in);
        long num = scNum.nextLong();
        long typeOfPrint = 1;
        System.out.println("Result of digits: ");
        while (num != 0) {
            long digit = num % 10;
            System.out.println(typeOfPrint + " - " + digit + " pc");
            typeOfPrint = typeOfPrint * 10;
            num /= 10;
        }
    }
}
