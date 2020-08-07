import java.util.Scanner;
import java.lang.Math; 

public class SquareRoot{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int integer = scanner.nextInt();
        double result = Math.sqrt(integer);
        System.out.print(result);
    }
}