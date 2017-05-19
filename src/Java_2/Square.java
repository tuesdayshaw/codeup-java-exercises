package Java_2;


/**
 * Created by canidmars on 5/19/17.
 */

public class Square extends Rectangle {

    private double side;

    public Square (double side){
        super(side, side);
        this.side = side;
    }

    public double getArea(){
        return side * side;
        //or
//        return super.getArea();
    }

    public double getPerimeter(){
        return 4 * side;
//        return super.getPerimeter();
    }
}
