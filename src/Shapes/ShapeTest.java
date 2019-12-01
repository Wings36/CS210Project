//credit: Peter Hoang

package Shapes;

public class ShapeTest {
    public static void main(String[] args)
    {
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


    }
}
