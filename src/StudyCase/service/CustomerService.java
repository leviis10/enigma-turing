package StudyCase.service;

import StudyCase.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    protected List<Customer> db = new ArrayList<>();
    protected static int nextId = 1;

    public CustomerService() {
        // seed database
//        this.create("Joni");
//        this.create("Steak");
        System.out.println("FROM CUSTOMER SERVICE");
    }

    public Customer create(String request) {
        Customer newCustomer = new Customer();
        newCustomer.setName(request);
        newCustomer.setId(nextId++);
        db.add(newCustomer);
        return newCustomer;
    }

    public void getAll() {
        for (Customer customer : db) {
            System.out.println(customer);
        }
    }

    public Customer getById(Integer id) {
        for (Customer customer : db) {
            if (customer.getId() != id) {
                continue;
            }

            return customer;
        }
        return null;
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
