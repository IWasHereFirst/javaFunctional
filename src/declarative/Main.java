package declarative;

import java.util.List;
import java.util.function.Predicate;

import static declarative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        List<Person> females = people.stream()
                .filter(personPredicate).toList();
        females.forEach(System.out::println);

    }
    static class Person{
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "name: " + this.name + " gender: " + this.gender;
        }
    }


    enum Gender {
        MALE, FEMALE
    }
}
