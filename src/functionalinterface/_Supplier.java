package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    // Obycajny zapis funkcie
    static String getDBConnectionUrl () {
        return "jdbc://localhost:5432/users";
    }

    // Funkcionalny zapis Suppliera
    static Supplier<String> getDBConnectionUrlF = () -> "jdbc://localhost:5432/users";

    public static void main(String[] args) {

        // Obycajna funkcia
        System.out.println(getDBConnectionUrl());

        // Supplier
        System.out.println(getDBConnectionUrlF.get());
    }

}
