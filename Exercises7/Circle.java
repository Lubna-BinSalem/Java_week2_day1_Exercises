public class Circle extends Shape{
    protected double radius=1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    public double getPerimeter() {
        return 2*Math.PI*this.getRadius();
    }
    public String toString(){
        return "Circle"+super.toString()+",radius="+this.getRadius()+"]";
    }


}
