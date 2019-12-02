//credit: Peter Hoang

package Shapes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ShapeClient {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream print = new FileOutputStream("ShapesOutput.txt");
        PrintStream output = new PrintStream(print);

        //Rectangles
        Rectangle recOne = new Rectangle(4, 6);
        Rectangle recTwo = new Rectangle();

        output.println("The area of recOne is " + recOne.getArea());
        output.println("The Perimeter of recOne is " + recOne.getPerimeter());

        output.println();
        output.println("The area of recTwo is " + recTwo.getArea());
        output.println("The Perimeter of recTwo is " + recTwo.getPerimeter());

        output.println();
        recTwo.setHeight(7);
        output.println("Successfully set the height to " + recTwo.getHeight());
        recTwo.setLength(9);
        output.println("Successfully set the length to " + recTwo.getLength());

        output.println("The area of recTwo is " + recTwo.getArea());
        output.println("The Perimeter of recTwo is " + recTwo.getPerimeter());
        output.println();

        //Triangles

        Triangle triagOne = new Triangle(1, 3, 5);
        Triangle triagTwo = new Triangle(1, 4, 5.5);
        Triangle triagThree = new Triangle();

        output.println("The area of triagOne is " + triagOne.getArea());
        output.println("The Perimeter of triagOne is " + triagOne.getPerimeter());

        output.println();
        output.println("The area of triagTwo is " + triagTwo.getArea());
        output.println("The Perimeter of triagTwo is " + triagTwo.getPerimeter());

        output.println();
        triagThree.setHeight(7);
        output.println("Successfully set the height to " + triagThree.getHeight());
        triagThree.setLength(9);
        output.println("Successfully set the length to " + triagThree.getLength());

        output.println("The area of recTwo is " + recTwo.getArea());
        output.println("The Perimeter of recTwo is " + recTwo.getPerimeter());
        output.println();

        //Circles
        Circle cirOne = new Circle(4);
        Circle cirTwo = new Circle();

        output.println("The area of cirOne is " + cirOne.getArea());
        output.println("The Perimeter of cirOne is " + cirOne.getPerimeter());

        output.println();
        output.println("The area of cirTwo is " + cirTwo.getArea());
        output.println("The Perimeter of cirTwo is " + cirTwo.getPerimeter());

        output.println();
        cirTwo.setRadius(7);
        output.println("Successfully set the radius to " + cirTwo.getRadius());

        output.println("The area of cirTwo is " + cirTwo.getArea());
        output.println("The Perimeter of cirTwo is " + cirTwo.getPerimeter());

        //Hexagon
        output.println();
        Hexagon hexOne = new Hexagon(7);
        Hexagon hexTwo = new Hexagon();

        output.println("The area of hexOne is " + hexOne.getArea());
        output.println("The Perimeter of hexOne is " + hexOne.getPerimeter());

        output.println();
        output.println("The area of hexTwo is " + hexTwo.getArea());
        output.println("The Perimeter of hexTwo is " + hexTwo.getPerimeter());

        output.println();
        hexTwo.setLength(8);
        output.println("Successfully set the length to " + hexTwo.getLength());

        output.println("The area of hexTwo is " + hexTwo.getArea());
        output.println("The Perimeter of hexTwo is " + hexTwo.getPerimeter());


    }
}
