package Java_2;

/**
 * Created by canidmars on 5/19/17.
 */

public class Rectangle extends Quadralateral implements Measurable {


    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    void setWidth() {

    }

    @Override
    void setLength() {

    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
