

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius="+this.radius+"]";
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}