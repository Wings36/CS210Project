package Shapes;

public class Circle implements Shapes {
    private int radius;

    Circle(int radius)
    {
        this.radius = radius;
    }

    public int getArea() {
        double result = Math.PI * radius * radius;
        return (int) result;
    }


    public int getPerimeter() {
        double result = (radius * 2) * Math.PI * 2;
        return (int)result;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }
}
