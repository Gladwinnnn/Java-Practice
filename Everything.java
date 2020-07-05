import java.util.Scanner;

public class Everything{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number:");
        int number1 = scanner.nextInt();
        System.out.print("Input second number:");
        int number2 = scanner.nextInt();
        int sum = number1 + number2;
        int sub = number1 - number2;
        int multiply = number1 * number2;
        int divide = number1 % number2;
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + sub);
        System.out.println(number1 + " x " + number2 + " = " + multiply);
        System.out.println(number1 + " / " + number2 + " = " + divide);
        System.out.println(number1 + " mod " + number2 + " = " + divide);
    }
}