import java.util.Scanner;

public class ReadNumber{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int num = scanner.nextInt();

        scanner.close();

        System.out.println("The number entered by user: " + num);
    }
}