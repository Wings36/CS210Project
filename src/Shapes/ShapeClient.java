//credit: Peter Hoang

package Shapes;

public class ShapeClient {
    public static void main(String[] args)
    {
        //Rectangles
        Rectangle recOne = new Rectangle(4, 6);
        Rectangle recTwo = new Rectangle();

        System.out.println("The area of recOne is " + recOne.getArea());
        System.out.println("The Perimeter of recOne is " + recOne.getPerimeter());

        System.out.println();
        System.out.println("The area of recTwo is " + recTwo.getArea());
        System.out.println("The Perimeter of recTwo is " + recTwo.getPerimeter());

        System.out.println();
        recTwo.setHeight(7);
        recTwo.setLength(9);
        System.out.println("The area of recTwo is " + recTwo.getArea());
        System.out.println("The Perimeter of recTwo is " + recTwo.getPerimeter());
        System.out.println();

        //Triangles

        Triangle triagOne = new Triangle(1, 3, 5);
        Triangle triagTwo = new Triangle(1, 4, 5.5);
        Triangle triagThree = new Triangle();

        System.out.println("The area of triagOne is " + triagOne.getArea());
        System.out.println("The Perimeter of triagOne is " + triagOne.getPerimeter());

        System.out.println();
        System.out.println("The area of triagTwo is " + triagTwo.getArea());
        System.out.println("The Perimeter of triagTwo is " + triagTwo.getPerimeter());

        System.out.println();
        triagThree.setHeight(7);
        triagThree.setLength(9);
        System.out.println("The area of recTwo is " + recTwo.getArea());
        System.out.println("The Perimeter of recTwo is " + recTwo.getPerimeter());
        System.out.println();

        //Circles
        Circle cirOne = new Circle(4);
        Circle cirTwo = new Circle();

        System.out.println("The area of cirOne is " + cirOne.getArea());
        System.out.println("The Perimeter of cirOne is " + cirOne.getPerimeter());

        System.out.println();
        System.out.println("The area of cirTwo is " + cirTwo.getArea());
        System.out.println("The Perimeter of cirTwo is " + cirTwo.getPerimeter());

        System.out.println();
        cirTwo.setRadius(7);
        System.out.println("The area of cirTwo is " + cirTwo.getArea());
        System.out.println("The Perimeter of cirTwo is " + cirTwo.getPerimeter());




    }
}
