package Oefening2VanInheritance;

public class Student extends Person{
    //subclass , child
    private String lessonTitle;

    public Student(){}
    public Student(String lessonTitle){
        this.lessonTitle = lessonTitle;
    }
    public Student(String lessonTitle,String naam,int age){
        super(naam,age);
        this.lessonTitle = lessonTitle;
    }

    public void setLessonTitle(String lessonTitle){
        this.lessonTitle = lessonTitle;
    }
    public String getLessonTitle(){
        return lessonTitle;
    }
}
