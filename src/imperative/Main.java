package imperative;

import java.util.ArrayList;
import java.util.List;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)
        );

        // Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person: people){
            if (FEMALE.equals(person.gender)) females.add(person);
        }
        for (Person female: females) System.out.println(female);

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
