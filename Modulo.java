import java.util.Scanner;

public class Modulo{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = scanner.nextInt();
        int placeHolder = firstNumber/secondNumber;
        int remainder = firstNumber - (placeHolder * secondNumber);
        System.out.println(remainder);
    }
}