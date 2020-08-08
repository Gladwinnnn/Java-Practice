import java.util.Scanner;

public class CheckOddEven{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an number: ");
        int integer = scanner.nextInt();
        if (integer % 2 == 0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}