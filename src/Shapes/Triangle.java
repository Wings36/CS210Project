package Shapes;
//Peter Hoang
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

    Triangle()
    {
        sideA = 0;
        sideB = 0;
        sideC = 0.0;
    }

    Triangle(int length, int height, double hypot)
    {
        sideA = length;
        sideB = height;
        sideC = hypot;
    }

    Triangle(int length, int height, int hypot)
    {
        sideA = length;
        sideB = height;
        sideC = (double)hypot;
    }

    public int getArea() {
        return sideA * sideB;
    }


    public int getPerimeter() {
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

    void setLength(int length) {

        sideA = length;
    }


    void setHeight(int height) {

        sideB = height;
    }
}
