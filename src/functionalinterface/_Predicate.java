package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // Obycajna funkcia
        System.out.println("Simple functions:");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        // Predicate
        System.out.println("Predicates:");
        System.out.println(isPhoneNumberValidF.test("07000000000"));
        System.out.println(isPhoneNumberValidF.test("09009877300"));

        // Chained Predicate
        System.out.println("Chained Predicates:");
        // Using or
        System.out.println("Is phone number valid and contains number 3 = " +
                isPhoneNumberValidF.or(containsNumber3).test("09009877300"));
        // Using and
        System.out.println("Is phone number valid and contains number 3 = " +
                isPhoneNumberValidF.and(containsNumber3).test("07000000300"));
        // Using BiPredicate
        System.out.println("BiPredicate");
        System.out.println(inputValidation.test("Daniel", 10));

    }
    // funkcie startsWith, length a contains su java string funkcie

    static boolean isPhoneNumberValid (String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    // Predicates
    static Predicate<String> isPhoneNumberValidF = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

    // BiPredicate
    static BiPredicate<String, Integer> inputValidation = (name, number) ->
        name.length() > 0 && number != 0;

}
