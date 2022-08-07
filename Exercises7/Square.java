public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super.setLength(side);
        super.setWidth(side);

    }
    public Square(double side, String color, boolean filled){
        super.setLength(side);
        super.setWidth(side);
        super.setColor(color);
        super.setFilled(filled);
    }
    public double getSide(){
        return super.getLength();
    }
    public void setSide (double side) {
        super.setLength(side);
        super.setWidth(side);
    }


    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
    }
    public String toString(){
        return "Square["+super.toString()+"]";
    }

}
