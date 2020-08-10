import java.util.Scanner;
import java.lang.Math; 

public class Power4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an number: ");
        int integer = scanner.nextInt();
        if (Math.pow(integer, 0.25) % 1 == 0){
            System.out.print("TRUE");
        }
        else{
            System.out.print("FALSE");
        }
    }
}