import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}