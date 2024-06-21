package StudyCase.Services;

import StudyCase.Model.Customer;

public class CustomerService {
    private Customer[] db = new Customer[12];
    static private int count = 0;

    public CustomerService() {
        this.create(new Customer(1, "levi", "085156231354", "3372051005010007", "10-05-2001"));
        this.create(new Customer(2, "randy", "000000000000", "0000000000000000", "00-00-0000"));
    }

    public void create(Customer request) {
        if (count >= db.length) {
            System.out.println("full bro");
            return;
        }

        db[count] = request;
        count++;
        System.out.println("Customer created");
    }

    public void getAll() {
        if (count == 0) {
            System.out.println("nothing");
            return;
        }

        for (Customer customer : db) {
            if (customer == null) {
                continue;
            }
            System.out.println(customer);
        }
    }

    public void getById(int id) {
        try {
            for (Customer customer : db) {
                if (customer.getId() != id) {
                    continue;
                }

                System.out.println(customer);
                return;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(Customer request) {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() != request.getId()) {
                continue;
            }

            db[i] = request;
            System.out.println("updated");
            return;
        }
    }

    public void delete(int id) {
        for (int i = 0; i < count; i++) {
            if (db[i].getId() != id) {
                continue;
            }

            db[i] = null;
            System.out.println("deleted");
            return;
        }
    }
}
