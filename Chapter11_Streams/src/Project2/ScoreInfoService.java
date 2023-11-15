package Project2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ScoreInfoService {
    public static void getNumberOfStudents(ScoreInfo[] scoreInfos){
        Student NumberOfStudents = Arrays.stream(scoreInfos)
                .collect(Collectors.groupingBy(Student :: ))
    }
}
