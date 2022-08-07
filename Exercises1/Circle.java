package com.company;

public class Circle {
    private double radius=1.0;
    private String color="red";

    public Circle() {
    }
    public Circle (double radius){
        this.setRadius(radius);
    }

    public Circle(double radias, String color) {
        this.radius = radias;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radias) {
        this.radius = radias;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }
    public String toString(){
        return "Circle[radius="+getRadius()+",color="+getColor()+"]";
    }
}
