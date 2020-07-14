import java.util.Scanner;
public class Compare{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int integer1 = scanner.nextInt();
        System.out.print("Input second integer: ");
        int integer2 = scanner.nextInt();
        if (integer1 != integer2){
            System.out.println(integer1 + " != " + integer2);
        }
        else{
            System.out.println(integer1 + " == " + integer2);
        }

        if (integer1 < integer2){
            System.out.println(integer1 + " < " + integer2);
        }
        else{
            System.out.println(integer1 + " > " + integer2);
        }
    }
}