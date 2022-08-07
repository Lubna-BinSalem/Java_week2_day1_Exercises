public class Test {
    public static void main(String[] args) {
        Circle c= new Circle(3);
        System.out.println(c.toString());
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());

        System.out.println("ResizeableCircle");
        ResizeableCircle reC=new ResizeableCircle(3);
        System.out.println(reC.toString());
        reC.resize(5);
        System.out.println(reC.toString()+"after resize");



    }
}
