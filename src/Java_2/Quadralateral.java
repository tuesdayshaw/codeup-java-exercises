package Java_2;

/**
 * Created by canidmars on 5/19/17.
 */

abstract class Quadralateral extends Shape implements Measurable {

    protected int width;
    protected int length;

    public Quadralateral(int width, int length) {
        this.width = width;
        this.length = length;
    };

    public void setWidth(){
        this.width = width;
    }

    public void setLength(){
        this.length = length;
    }

    public int getWidth(){
        return this.width = width;
    }

    public int getLength(){
        return this.length = length;
    }


}
