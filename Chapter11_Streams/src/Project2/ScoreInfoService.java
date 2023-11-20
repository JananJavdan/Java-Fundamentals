package Project2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreInfoService{
   private List<ScoreInfo> scoreDataList = new ArrayList<>();//eesrt maak een list array van score data van student

   // public void addScoreData(ScoreInfo scoreData){//en dan een methode die de student en de score toevoegt aan de ScoreData[]
     //  scoreDataList.add(scoreData);//met deze method list van data toe voegen in score data array list
    //}
  //  private ScoreInfo[] scoreData;
   // public ScoreInfoService(){
    // scoreData = new ScoreInfo[0];
    //}

    public void addScoreData(ScoreInfo scoreData){//en dan een methode die de student en de score toevoegt aan de ScoreData[]
        scoreDataList.add(scoreData);//met deze method list van data toe voegen in score data array list
    }

    public long getNumberOfStudents(){   //deze methode retorneerrt het aantaal van student ineen list met gebruik van stream
        return (long) scoreDataList.stream()
                .count();
    }
    //deze methode de gemiddelde score voor alle leerlingen afdruken
    public void calculateAverageScore(){
        double average = scoreDataList.stream()
                .mapToInt(ScoreInfo :: getScore)
                .average()
                .orElse(0.0);
        System.out.println("The average score for all student is :" +average);
    }
    //deze methode druk het aantal studenten af die een A hebben gekregen
    public long filterScore(){
        return scoreDataList.stream()
                .filter(scoreInfo -> scoreInfo.getScore() >= 90) //met methode filter maak (score groter  dan of gelijk aan 90)
                .count();
    }
    //deze methode een string[] terug te geven die de naam van student bevaten met een score van minder dan 60
    private String[] getFailedStudents(){
        return scoreDataList.stream()
                .filter(scoreInfo -> scoreInfo.getScore()<60)  //met filter methode de score van student minder dan 60
                .map(scoreInfo -> scoreInfo.getName()+" " + scoreInfo.getLastName()) // met map methode de voornaam en achternaam van de studenten zijn
                .toArray(String[] :: new); // met to array methode resultaten om te zetten naar een String[].
    }
    //in deze methode we afdruken naamen van studenten die minder dan 60 score krijgen
    public void printFailingStudents(){
        String[] failingStudents = getFailedStudents();
        System.out.println(" De naam van studenten die minder dan 60 score krijgen");
        for (String student : failingStudents)
            System.out.println(student);
    }
    //in deze methode afdrukt de naam en score van de students , geordend by achternaam
    public void getDataSortedByLastName(){
        List<ScoreInfo> sortedList = scoreDataList.stream()
                .sorted(Comparator.comparing(ScoreInfo::getLastName))
                .collect(Collectors.toList());
        System.out.println("De students gesorted by Lastname");
        for (ScoreInfo scoreInfo : sortedList){
            System.out.println(scoreInfo.getLastName()+ " ," + scoreInfo.getName()+ ": " +scoreInfo.getScore());
        }
    }
    //in deze methode uitprint de naam en score van student die gerangschikt naar score
    public void getDataSortedByScore(){
        List<ScoreInfo> sortedByScore = scoreDataList.stream()
                .sorted(Comparator.comparing(ScoreInfo::getScore))
                .collect(Collectors.toList());
        System.out.println("De students gesorterd by score:");
        sortedByScore.forEach(scoreInfo -> System.out.println(scoreInfo.getScore()+" ,"
                +scoreInfo.getName()+", "+scoreInfo.getLastName()));
    }
    long numbersOfStudents;

    
}
