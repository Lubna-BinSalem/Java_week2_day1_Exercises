public class Test {
    public static void main(String[] args) {
        Circle c = new Circle("blue", false, 3);
        System.out.println(c.getArea());
        System.out.println(c.toString());

        Square s= new Square(5, "blue", true);
        System.out.println(s.getArea());
        System.out.println(s.getSide());
        System.out.println(s.toString());
    }
}
