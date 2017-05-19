package Java_2;

/**
 * Created by canidmars on 5/19/17.
 */
public class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape = new Rectangle(10, 20);

        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShapeTwo = new Square(10);

        System.out.println(myShapeTwo.getArea());
        System.out.println(myShapeTwo.getPerimeter());

    }
}
