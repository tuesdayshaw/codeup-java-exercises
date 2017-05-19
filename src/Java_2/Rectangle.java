package Java_2;

/**
 * Created by canidmars on 5/19/17.
 */
public class Rectangle {

    private double width;
    private double length;

    public Rectangle (double width, double length){
        this.length = length;
        this.width = width;
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
}
