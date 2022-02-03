package Question2;

public class Circle extends Shape{
    public Circle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    public double area() {
        return getPI() * (getDim1() * getDim1());
    }
}
