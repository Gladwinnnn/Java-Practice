import java.util.Scanner;

public class While{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:");
        int number = scanner.nextInt();

        while (number != 1){
            if (number % 2 == 0){
                number /= 2;
                System.out.print(number);
            }
            else{
                number *= 3;
                number += 1;
                System.out.print(number);
            }
        }
        System.out.print("WHILE LOOP DONE");
    }
}