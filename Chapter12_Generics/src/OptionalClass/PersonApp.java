package OptionalClass;

import java.util.Optional;

public class PersonApp {
    public static void main(String[] args) {
        Person person = Person.getPerson("bob");
        System.out.println(person.getName());

        //Person person1 = Person.getPerson("sasha");  kerijgen we exsseption
      //  System.out.println(person1.getName());

        Optional<Person> personOptional = Person.getPersonOptiona("jean");
        System.out.println(personOptional.isPresent() ? personOptional.get().getName(): "");

        Optional<Person> personOptional2 = Person.getPersonOptiona("sasha");
        System.out.println(personOptional2.isPresent() ? personOptional2.get().getName(): "");
    }
}
