package Java_2;

import java.util.ArrayList;

/**
 * Created by canidmars on 5/22/17.
 */

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int sum = 0;

    public Student (String name, ArrayList<Integer> grades){
        this.name = name;
        this.grades = grades;
    }

    public Student (String name){
        this.name = name;
        this.grades = grades;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        for(double element : grades){
            sum += element;
        }
        sum /= grades.size();
        return sum;
    }


    public static void main(String[] args) {

        Student student1 = new Student("Tuesday");
        student1.addGrade(80);
        student1.addGrade(90);
        student1.addGrade(93);

        System.out.println(student1.getGradeAverage());
    }

}
