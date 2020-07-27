import java.util.Scanner;

public class Factors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.print("Input an integer : ");
        int number = scanner.nextInt();
        for (int i = 1; i < number + 1; i ++)
        {
            if (number % i == 0)
            {
                counter ++;
            }
        }
        System.out.println(counter);
    }
}