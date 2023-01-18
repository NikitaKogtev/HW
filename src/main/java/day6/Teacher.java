package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    Random random = new Random();

    public void evaluate(Student student) {
        int score = random.nextInt((5 - 2) + 1) + 2;
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + score);

    }

}
