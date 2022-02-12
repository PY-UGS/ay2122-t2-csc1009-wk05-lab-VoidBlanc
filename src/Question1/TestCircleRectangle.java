package Question1;

import java.util.Scanner;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== Entry for Circle ===================== ");
        System.out.print("Enter the radius for Circle : ");
        double circleRadius = sc.nextDouble();
        System.out.print("Enter the Color for Circle : ");
        String circleColor = sc.next();
        System.out.print("Choose an option : \n1. Filled \n2. Not Filled \nEnter the option number: ");
        int circleFill  = sc.nextInt();
        boolean isFilled = circleFill == 1;
        System.out.println("===================== Entry for Rectangle ===================== ");
        System.out.print("\nEnter the Width for Rectangle : ");
        double rectWidth = sc.nextDouble();
        System.out.print("Enter the Height for Rectangle : ");
        double rectHeight = sc.nextDouble();
        System.out.print("Enter the Color for Rectangle : ");
        String rectColor = sc.next();
        System.out.print("Choose an option : \n1. Filled \n2. Not Filled \nEnter the option number: ");
        int rectFill  = sc.nextInt();
        boolean rectFilled = rectFill == 1;
        System.out.println("");
        Circle circle = new Circle(circleRadius, circleColor, isFilled);
        circle.printCircle();

        Rectangle rectangle = new Rectangle(rectWidth,rectHeight, rectColor, rectFilled);
        System.out.println("A rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());
    }
}