package Les1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamStudent {

    public static void main(String args[]){
        List<Student> list=new ArrayList<Student>();

        //Adding Students
        list.add(new Student(1,"John"));
        list.add(new Student(3,"Pear"));
        list.add(new Student(2,"Ahmet"));

        // using lambda to filter data
        Stream<Student> filtered_data = list.stream().filter(s -> s.rollNo > 2);

        // using lambda to iterate through collection
        filtered_data.forEach(
                student -> System.out.println(student.name)
        );
    }
}
