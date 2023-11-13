package Les1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class StreamFlatMap {
    public static void main(String[] args) {
        try {
            long noOfWords = Files.lines(Paths.get("C:\\Users\\Intec\\Documents\\test.txt"))
                    .flatMap(l-> Arrays.stream(l.split(" +")))
                    .distinct()
                    .count();
            System.out.println("No Of Words: "+noOfWords);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
