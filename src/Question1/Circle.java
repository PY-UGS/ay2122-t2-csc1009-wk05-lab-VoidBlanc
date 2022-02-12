package Question1;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return (Math.PI * (radius * radius));
    }

    public double getPerimeter(){
        return (Math.PI * getDiameter());
    }

    public double getDiameter(){
        return (radius * 2.0);
    }

    public void printCircle(){
        System.out.println("A circle " + super.toString());
        System.out.println("The color is "+ getColor());
        System.out.println("The radius is " + radius);
        System.out.println("The area is " +getArea());
        System.out.println("The diameter is "+ getDiameter());
    }
}
