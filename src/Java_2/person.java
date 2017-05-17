package Java_2;

/**
 * Created by canidmars on 5/16/17.
 */
public class person {

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;

    }

    public void sayHello(){
        System.out.println("Hello " + name);
    }

    public person (String name){
        this.name = name;
    }


    public static void main(String[] args) {
        person Tuesday = new person("Tuesday");

        System.out.println(Tuesday.getName());
        Tuesday.sayHello();

    }




}
