import java.awt.*;
import java.util.ArrayList;

public class Student {
    String name;
    long id;
    ArrayList<Integer> grades;

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public double getGradeAverage() {
        double total = 0;
        double sum = 0;
        for(int i = 0; i < grades.size(); i++) {
            total += grades.get(i);
            sum = total / grades.size();
        }


        return sum;
    }


    public static void main(String[] args) {
        Student nick = new Student("Nick", 1);
        nick.addGrade(98);
        nick.addGrade(69);

        System.out.println(nick.getName() + " " + nick.getGrades() + " " + nick.getId());
        System.out.println(nick.getGradeAverage());

    }




}
