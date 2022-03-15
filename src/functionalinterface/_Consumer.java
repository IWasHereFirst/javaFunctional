package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    // Consumer berie jeden argument a nevracia ziadnu hodnotu
    // BiConsumer berie dva argumenty a nevracia ziadnu hodnotu

    // Tieto dve metody su si rovne

    // Obycajny zapis funkcie Consumer
    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName +
                " thanks for the registering phone number "
                + customer.customerPhoneNumber);
    }

    // Funkcionalny zapis Consumer
    static Consumer<Customer> greetCustomerF = customer -> {
        System.out.println("Hello " + customer.customerName +
                " thanks for the registering phone number "
                + customer.customerPhoneNumber);
    };

    // Obycajny zapis funkcie BiConsumer
    static void greetBiCustomer(Customer customer, boolean showNumber){
        System.out.println("Hello " + customer.customerName +
                " thanks for the registering phone number "
                + (showNumber ? customer.customerPhoneNumber : "******"));
    }

    // Funkcionalny zapis BiConsumer
    static BiConsumer<Customer, Boolean> greetByCustomerF = (customer, showNumber) -> {
        System.out.println("Hello " + customer.customerName +
                " thanks for the registering phone number "
                + (showNumber ? customer.customerPhoneNumber : "******"));
    };


    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "99999");
        greetCustomer(maria);
        greetCustomerF.accept(maria);

        greetByCustomerF.accept(maria, false);
        greetByCustomerF.accept(maria, true);

    }

    static  class Customer {

        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
