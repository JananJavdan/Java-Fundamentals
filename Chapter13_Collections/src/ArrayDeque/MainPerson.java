package ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

//Maak een programma dat een rij mensen creëert.
//Mannen worden eerst toegevoegd en vrouwen worden achteraan toegevoegd.
//Vervolgens worden koppels gevormd door één man van het begin van de rij en één vrouw van het einde te nemen.
public class MainPerson {
    public static void main(String[] args) {
        Deque<Person> persons = new ArrayDeque<>();
        persons.offerFirst(new Person("Petter", Person.Gender.MALE));
        persons.offerFirst(new Person("John", Person.Gender.MALE));
        persons.offerFirst(new Person("kkk", Person.Gender.MALE));
        persons.offerLast(new Person("Mary", Person.Gender.FEMALE));
        persons.offerLast(new Person("Matia", Person.Gender.FEMALE));
        persons.offerLast(new Person("Katy", Person.Gender.FEMALE));

        Person person = persons.pollFirst();

        while (person != null) {
            System.out.println("Couples are: " + person + "and" + persons.pollLast() + "\n");

            person = persons.pollFirst();


        }

    }

}