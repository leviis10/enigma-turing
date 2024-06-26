package StudyCase.utils;

import StudyCase.model.Customer;
import StudyCase.service.CustomerService;

public class FileCustomerService extends CustomerService {
    private final FileHandler fileHandler;

    public FileCustomerService(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
        System.out.println(this.fileHandler);
        this.db = fileHandler.readFromFile();

        if (!db.isEmpty()) {
            CustomerService.nextId = db.stream().mapToInt(Customer::getId).max().orElse(0) + 1;
        }
    }

    @Override
    public Customer create(String name) {
        Customer newCustomer = super.create(name);
        fileHandler.writeToCSV(db);
        return newCustomer;
    }
}
