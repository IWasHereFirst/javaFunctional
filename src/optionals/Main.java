package optionals;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        // Vytvorenie objektu typu Optional s hodnotou null
        // a pokial je null, tak vrat default value
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "default value");

        // Vytvorenie objektu typu Optional s hodnotou "Hello"
        // a pokial je nulll, tak vrat default value
        value = Optional.ofNullable("Hello").orElseGet(() -> "default value");

        // Vytvorenie objektu typu Optional s hodnotou null
        // a pokial je null, tak hod exception
        //value = Optional.ofNullable(null).orElseThrow(() -> new IllegalStateException("Exception"));

        System.out.println(value);

        // Vytvorenie objektu typu Optional s hodnotou daniel@gmail.com
        // ak tento objekt existuje, vrat spravu
        Optional.ofNullable("daniel@gmail.com")
                .ifPresent(email -> System.out.println("Sending email to: " + email));

        // pokial nie je objekt prazdny, tak posli mail [1. argument v ifPresentOrElse]
        // pokial je objekt prazdny, tak ho neposielaj [2. argument v ifPresentOrElse]
        Optional.ofNullable(null)
                .ifPresentOrElse(
                        email -> System.out.println("sending email to: " + email),
                        () -> System.out.println("Cannot send email")
                );
    }

}
