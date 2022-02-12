package Question2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================== Entry for Rectangle ===================== ");
        System.out.print("Enter the semi-major axis of length : ");
        double dim1 = sc.nextDouble();
        System.out.print("Enter the semi-minor axis of length : ");
        double dim2 = sc.nextDouble();
        Rectangle r = new Rectangle(dim1, dim2);
        System.out.println("===================== Entry for Triangle ===================== ");
        System.out.print("Enter the semi-major axis of length : ");
        dim1 = sc.nextDouble();
        System.out.print("Enter the semi-minor axis of length : ");
        dim2 = sc.nextDouble();
        Triangle t = new Triangle(dim1, dim2);
        System.out.println("===================== Entry for Circle ===================== ");
        System.out.print("Enter the semi-major axis of length : ");
        dim1 = sc.nextDouble();
        System.out.print("Enter the semi-minor axis of length : ");
        dim2 = sc.nextDouble();
        Circle c = new Circle(dim1, dim2);
        System.out.println("===================== Entry for Ellipse ===================== ");
        System.out.print("Enter the semi-major axis of length : ");
        dim1 = sc.nextDouble();
        System.out.print("Enter the semi-minor axis of length : ");
        dim2 = sc.nextDouble();
        Ellipse e = new Ellipse(dim1, dim2);
        System.out.println("===================== Entry for Square ===================== ");
        System.out.print("Enter the semi-major axis of length : ");
        dim1 = sc.nextDouble();
        System.out.print("Enter the semi-minor axis of length : ");
        dim2 = sc.nextDouble();
        Square s = new Square(dim1, dim2);
        Shape figref;// this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
        figref = c;
        System.out.println("Area is " + figref.area());
        figref = e;
        System.out.println("Area is " + figref.area());
        figref = s;
        System.out.println("Area is " + figref.area());
    }
}
