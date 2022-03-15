package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidator.*;
import static combinatorpattern.CustomerRegistrationValidator.ValidationResult.*;

public class Main {

    // Combinator moze vziat ine funkcie ako argumenty a vrati novu funkciu

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0898787879878",
                LocalDate.of(2000, 1, 1)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // Vyuzitie Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != SUCCESS) throw new IllegalStateException(result.name());

    }
}
