package Question2;

public class Rectangle extends Shape{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return getDim1() * getDim2();
    }
}
