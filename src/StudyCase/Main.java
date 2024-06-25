package StudyCase;

import StudyCase.Model.Customer;
import StudyCase.Services.CustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();

        // Testing Create
        Customer randy = service.create("Randy");
        Customer levi = service.create("Levi");
        Customer irsyad = service.create("Irsyad");
        Customer tommy = service.create("Tommy");
        System.out.println("=".repeat(20));

        // Testing Read All
        service.getAll();
        System.out.println("=".repeat(20));

        // Testing Read One
        service.getById(1);
        System.out.println("=".repeat(20));

        // Testing Update
        Customer updated = new Customer();
        updated.setId(levi.getId());
        updated.setName("updated");
        service.update(levi, updated);
        service.getById(levi.getId());
        System.out.println("=".repeat(20));

        // Testing Delete
        service.delete(tommy.getId());
        service.getAll();
    }
}
