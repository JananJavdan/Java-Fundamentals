package Project2Example;

import java.util.Arrays;

public class ScoreInfoService {
    long numberOfStudent;
    private ScoreInfo[] scoreData;
    public ScoreInfoService(){
        numberOfStudent = 0;
        scoreData = new ScoreInfo[0];
    }
    public void addScoreInfo(ScoreInfo info){
        int newLength = scoreData.length + 1;
        ScoreInfo[] copiedArray = Arrays.copyOf(scoreData, newLength);
        scoreData = copiedArray;
        scoreData[newLength - 1] = info;
    }
    public void getNumberOfStudents(){
        System.out.println(Arrays.stream(scoreData)
                .count());
    }
    public void calculateAverageScore(){
        System.out.printf("%.2f\n", Arrays.stream(scoreData)
                .mapToDouble(num -> (double) num.getScore())
                .average()
                .getAsDouble());
    }
    public void filterScore(){
        System.out.println(Arrays.stream(scoreData)
                .filter(score -> score.getScore() >= 90)
                .count());
    }
    private String[] getFailedStudents(){
        return Arrays.stream(scoreData)
                .filter(info -> info.getScore() < 60)
                .map(info -> info.getStudent().getName() + " " + info.getStudent().getLastName())
                .toArray(String[]::new);
    }
    public void printFailingStudents(){
        Arrays.stream(getFailedStudents())
                .forEach(System.out::println);
    }
    public void getDataSortedByLastName(){
        Arrays.stream(scoreData)
                .sorted((a,b)-> a.getStudent().getLastName().compareTo(b.getStudent().getLastName()))
                .forEach(System.out::println);
    }
    public void getDataSortedByScore(){
        Arrays.stream(scoreData)
                .sorted((a,b) -> a.getScore() - b.getScore())
                .forEach(System.out::println);
    }
}
