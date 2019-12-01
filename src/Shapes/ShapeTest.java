package Shapes;

public class ShapeTest {
    public static void main(String[] args)
    {
        Rectangle recOne = new Rectangle(4, 6);
        Rectangle recTwo = new Rectangle();

        System.out.println("The area of recOne is " + recOne.area());
        System.out.println("The Perimeter of recOne is " + recOne.perimeter());

        System.out.println();
        System.out.println("The area of recTwo is " + recTwo.area());
        System.out.println("The Perimeter of recTwo is " + recTwo.perimeter());

        System.out.println();
        recTwo.setHeight(7);
        recTwo.setLength(9);
        System.out.println("The area of recTwo is " + recTwo.area());
        System.out.println("The Perimeter of recTwo is " + recTwo.perimeter());

        Triangle triagOne = new Triangle(1, 3, 5);
        Triangle triagTwo = new Triangle(1, 4, 5.5);
        Triangle triagThree = new Triangle();

        System.out.println("The area of triagOne is " + triagOne.area());
        System.out.println("The Perimeter of triagOne is " + triagOne.perimeter());

        System.out.println();
        System.out.println("The area of triagTwo is " + triagTwo.area());
        System.out.println("The Perimeter of triagTwo is " + triagTwo.perimeter());

        System.out.println();
        triagThree.setHeight(7);
        triagThree.setLength(9);
        System.out.println("The area of recTwo is " + recTwo.area());
        System.out.println("The Perimeter of recTwo is " + recTwo.perimeter());


    }
}
