import java.util.Scanner;

public class Product{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number:");
        int number1 = scanner.nextInt();
        System.out.print("Input second number:");
        int number2 = scanner.nextInt();
        int result = number1 * number2;
        System.out.println(number1 + " x " + number2 + " = " + result);
    }
}