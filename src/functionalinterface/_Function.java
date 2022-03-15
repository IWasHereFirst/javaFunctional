package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    // Function berie jeden argument a vracia jednu hodnotu
    // BiFunction berie dva argumenty a vracia jednu hodnotu

    // Tieto dve metody su si rovne:

    // 1. Obycajny zapis funkcie
    static int takeIn(int nr){
        return nr + 1;
    }
    // 1. Funkcionalny zapis funkcie
    // 1. parameter je argument funkcie
    // 2. parameter je navratovy typ
    static Function<Integer, Integer> takeInF = nr -> nr + 1;

    // Tieto dve metody su si rovne

    // 2. Obycajny zapis funkcie
    static int takeTwoIn(int nr1, int nr2){
        return (nr1 + 1) * nr2;
    }

    // 2. Funkcionalny zapis funkcie
    // 1. parameter je prvy argument funkcie
    // 1. parameter je druhy argument funkcie
    // 3. parameter je navratovy typ
    static BiFunction<Integer, Integer, Integer> takeTwoInF = (nr1, nr2) -> (nr1 + 1) * nr2;



    public static void main(String[] args) {
        // Functions topic
        int increment1 = incrementByOne(1);
        System.out.println(increment1);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        // Chainovanie funkcii
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        // Bifunctions topic
        System.out.println(takeTwoIn(4, 100));
        System.out.println(takeTwoInF.apply(4, 100));

    }

    // Obycajny zapis funkcie
    static int incrementByOne(int number) {
        return number + 1;
    }
    // Vytvorenie funkcionalnej funkcie rovnakej ako incrementByOne
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;



}
