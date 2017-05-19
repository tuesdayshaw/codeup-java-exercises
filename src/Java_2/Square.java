package Java_2;


/**
 * Created by canidmars on 5/19/17.
 */

public class Square extends Quadralateral implements Measurable{


    public Square(int side) {
        super(side, side);
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
