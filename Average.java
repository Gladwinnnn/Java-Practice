import java.util.Scanner;

public class Average{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 1st number:");
        int number1 = scanner.nextInt();

        System.out.print("Enter the 2nd number:");
        int number2 = scanner.nextInt();

        System.out.print("Enter the 3rd number:");
        int number3 = scanner.nextInt();

        double average = (number1 + number2 + number3) / 3;
        System.out.println("The average of your numbers is: " + average);
    }
}