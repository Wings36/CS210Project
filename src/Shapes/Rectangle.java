//credit: Peter Hoang

package Shapes;
/*
            Side B
        ----------------
 Side A |              |
        |              |
        ----------------
*/
public class Rectangle implements Shapes {

    private int sideA;
    private int sideB;

    Rectangle()
    {
        sideA = 0;
        sideB = 0;
    }

    Rectangle(int length, int width)
    {
        sideA = width;
        sideB = length;
    }

    public int getArea() {
        return sideA * sideB;
    }

    public int getPerimeter() {
        return (sideB * 2) + (sideA * 2);
    }

    void setLength(int length)
    {
        sideB = length;
        System.out.println("Successfully set the length to " + sideB);
    }

    void setHeight(int height)
    {
        sideA = height;
        System.out.println("Successfully set the height to " + sideA);
    }

    int getLength() { return sideB; }

    int getHeight() { return sideA; }
}
