package Shapes;

/*
        |\
        |  \
        |    \  sideC
Side B  |      \
        |________\
        SIde A
 */

public class Triangle implements Shapes {

    private int sideA;
    private int sideB;
    private double sideC;
    private Boolean calcHypot = true;

    public Triangle()
    {
        sideA = 0;
        sideB = 0;
        sideC = 0.0;
    }

    public Triangle(int length, int height, double hypot)
    {
        sideA = length;
        sideB = height;
        sideC = hypot;
    }

    public Triangle(int length, int height, int hypot)
    {
        sideA = length;
        sideB = height;
        sideC = (double)hypot;
    }

    public int area() {
        return sideA * sideB;
    }


    public int perimeter() {
        hypot();
        return sideA + sideB + (int)sideC;
    }

    private void hypot()
    {
        if(calcHypot)
        {
            double answer = Math.sqrt(sideA) + Math.sqrt(sideB);
            sideC = Math.sqrt(answer);
            calcHypot = false;
        }
    }
}
