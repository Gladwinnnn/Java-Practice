import java.util.Scanner;

public class CheckThird{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number : ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = scanner.nextInt();
        int total = firstNumber + secondNumber;
        System.out.println(total == thirdNumber);
    }
}