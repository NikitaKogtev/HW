package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Никита", "Хор турецкого");
        Teacher teacher = new Teacher("Софи", "Музыка");

        student.printInfo();
        teacher.printInfo();
    }
}
