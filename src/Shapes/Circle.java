// by Peter Hoang

package Shapes;

public class Circle implements Shapes {
    private int radius;

    Circle(int radius)
    {
        this.radius = radius;
    }

    Circle()
    {
        radius = 0;
    }

    public int getArea() {
        double result = Math.PI * radius * radius;
        return (int) result;
    }


    public int getPerimeter() {
        double result = (radius * 2) * Math.PI * 2;
        return (int)result;
    }

    void setRadius(int radius)
    {
        this.radius = radius;
        System.out.println("Successfully set the radius to " + this.radius);
    }

    int getRadius() { return radius; }
}
