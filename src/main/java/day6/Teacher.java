package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int score = random.nextInt((5 - 2) + 1) + 2;
        String sc = null;

        if (score == 2) {
            sc = "Неудвлетворительно";
        }
        if (score == 3) {
            sc = "Удвлетворительно";
        }
        if (score == 4) {
            sc = "Хорошо";
        }
        if (score == 5) {
            sc = "Отлично";
        }
        
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + sc);

    }

}
