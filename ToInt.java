import java.util.Scanner;

public class ToInt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number(string): ");
        String placeHolder = scanner.nextLine();
        int number = Integer.parseInt(placeHolder);
        System.out.print("The integer value is: " + placeHolder);
    }
}