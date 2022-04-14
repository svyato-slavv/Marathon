package day9.Task2;

public class Rectangle extends Figure {
    private double height;
    private double wight;

    public Rectangle(double height,double wight,String color) {
        super(color);
        this.height=height;
        this.wight=wight;
    }

    @Override
    public double area() {
        return height*wight;
    }

    @Override
    public double perimeter() {
        return 2*(height+wight);
    }
}
