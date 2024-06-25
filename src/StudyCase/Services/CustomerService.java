package StudyCase.Services;

import StudyCase.Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> db = new ArrayList<>();
    private static int nextId = 1;

    public CustomerService() {
        // seed database
        this.create("Joni");
        this.create("Steak");
    }

    public Customer create(String request) {
        Customer newCustomer = new Customer();
        newCustomer.setName(request);
        newCustomer.setId(nextId++);
        db.add(newCustomer);
        System.out.printf("Customer created named: %s%n", newCustomer.getName());
        return newCustomer;
    }

    public void getAll() {
        for (Customer customer : db) {
            System.out.println(customer);
        }
    }

    public void getById(Integer id) {
        for (Customer customer : db) {
            if (customer.getId() != id) {
                continue;
            }

            System.out.println(customer);
            return;
        }
        System.out.println("Not found");
    }

    public void update(Customer targetRequest, Customer request) {
        for (int i = 0; i < db.size(); i++) {
            if (db.get(i).getId() != targetRequest.getId()) {
                continue;
            }

            db.set(i, request);
            return;
        }
    }

    public void delete(int id) {
        for (int i = 0; i < db.size(); i++) {
            if (id != db.get(i).getId()) {
                continue;
            }

            db.remove(i);
            return;
        }
    }
}
