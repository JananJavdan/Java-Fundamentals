package Les1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hi {

    public static void main(String[] args) {

        String[] arr = {"Hi", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> {
            System.out.println(s);
            return s.length() <=2;
        }))
        {
            System.out.println("removed");
        }
    }

}
