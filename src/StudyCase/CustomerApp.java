package StudyCase;

import StudyCase.model.Customer;
import StudyCase.service.CustomerService;
import StudyCase.utils.InputHandler;

public class CustomerApp {
    private CustomerService service;
    private InputHandler inputHandler;

    public CustomerApp(CustomerService customerService, InputHandler inputHandler) {
        this.service = customerService;
        this.inputHandler = inputHandler;
    }

    public void run() {
        boolean flag = true;
        while (flag) {
            showMenu();
            int choice = inputHandler.getInt("Choose menu: ");
            switch (choice) {
                case 1 -> create();
                case 2 -> getAll();
                case 3 -> getById();
                case 4 -> update();
                case 5 -> deleteById();
                case 6 -> flag = false;
                default -> System.out.println("Not valid");
            }
        }
    }

    private void showMenu() {
        System.out.println("""
                === Menu ===
                1. Create Customer
                2. Show Customers
                3. Show Customer by ID
                4. Update Customer
                5. Delete Customer
                6. Exit
                """);
    }

    private void create() {
        String name = inputHandler.getString("Masukkan nama: ");
        System.out.println(service.create(name));
    }

    private void getAll() {
        service.getAll();
    }

    private void getById() {
        int id = inputHandler.getInt("Masukkan id: ");
        Customer foundCustomer = service.getById(id);
        System.out.println(foundCustomer);
    }

    private void update() {
        int targetId = inputHandler.getInt("Masukkan id: ");
        Customer targetCustomer = service.getById(targetId);

        String newName = inputHandler.getString("Masukkan nama untuk customer: ");
        Customer newCustomer = new Customer(targetId, newName);
        service.update(targetCustomer, newCustomer);
    }

    private void deleteById() {
        int id = inputHandler.getInt("Masukkan id: ");
        service.delete(id);
    }
}
