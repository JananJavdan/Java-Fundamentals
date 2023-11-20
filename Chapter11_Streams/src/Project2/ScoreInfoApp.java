package Project2;

import java.util.ArrayList;
import java.util.List;

public class ScoreInfoApp {
    public static void main(String[] args) {

        ScoreInfoService scoreInfoService = new ScoreInfoService();
        List<Student> students = new ArrayList<>();

        students.add(new Student("Petter", "Doe", 1));
        students.add(new Student("Lambert", "Bah", 2));
        students.add(new Student("Simon", "Willems", 3));
        students.add(new Student("Martin", "Jacobs", 4));
        students.add(new Student("Maes", " Janssens", 5));

        /*
        Student student1 = new Student("Petter", "Doe", 1);
        Student student2 = new Student("Lambert", "Bah", 2);
        Student student3 = new Student("Simon", "Willems", 3);
        Student student4 = new Student("Martin", "Jacobs", 4);
        Student student5 = new Student("Maes", " Janssens", 5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

*/
       for (Student student : students){
           System.out.println(student.getName()+" "+ student.getLastName()+ " "+ student.id);}


        List<ScoreInfo> scoreInfos = new ArrayList<>();
        scoreInfos.add(new ScoreInfo(80, 1));
        scoreInfos.add(new ScoreInfo(90, 2));
        scoreInfos.add(new ScoreInfo(85, 3));
        scoreInfos.add(new ScoreInfo(95, 4));
        scoreInfos.add(new ScoreInfo(55, 5));





       /*
        ScoreInfo scoreInfo1 = new ScoreInfo(80,1);
        ScoreInfo scoreInfo2 = new ScoreInfo(90, 2);
        ScoreInfo scoreInfo3 = new ScoreInfo(85, 3);
        ScoreInfo scoreInfo4 = new ScoreInfo(95, 4);
        ScoreInfo scoreInfo5 = new ScoreInfo(55, 5);

        scoreInfos.add(scoreInfo1);
        scoreInfos.add(scoreInfo2);
        scoreInfos.add(scoreInfo3);
        scoreInfos.add(scoreInfo4);
        scoreInfos.add(scoreInfo5);
*/
        for (ScoreInfo scoreInfo : scoreInfos){
            System.out.println(scoreInfo.getScore()+" "+ scoreInfo.getStudent());
        }




        scoreInfoService.getNumberOfStudents();
        long numberOfstudent = scoreInfoService.getNumberOfStudents();
        System.out.println("het aantal van de student:"+numberOfstudent+students);
        scoreInfoService.filterScore();
        long filterScore = scoreInfoService.filterScore();
        System.out.println("Het aantal studenten met een score van 90 of hoger is:" +scoreInfos+filterScore);
        scoreInfoService.getDataSortedByScore();
        scoreInfoService.printFailingStudents();
        //scoreInfoService.addScoreData();
        scoreInfoService.calculateAverageScore();
        scoreInfoService.getDataSortedByLastName();



/*
        scoreInfoService.addScoreData();
        scoreInfoService.addScoreData();
        scoreInfoService.addScoreData(scoreInfo3);
        scoreInfoService.addScoreData(scoreInfo4);
        scoreInfoService.addScoreData(scoreInfo5);
*/






    }
}
