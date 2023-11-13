package Oefening2;

public class MainApp {
    public static void main(String[] args) {
        Student myStudent = new Student("math", "sara", 20);

        //my student
        System.out.println("age:" + myStudent.getAge());
        System.out.println("naam:" + myStudent.getNaam());
        System.out.println("lessonTitle:" + myStudent.getLessonTitle());
    }
}
