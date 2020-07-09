import java.util.Scanner;

public class Rectangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width = ");
        double width = scanner.nextDouble();
        System.out.print("Height = ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * width + 2 * height;

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}