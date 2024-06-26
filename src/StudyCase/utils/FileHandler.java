package StudyCase.utils;

import StudyCase.model.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
    private final File file;

    public FileHandler(String pathname) {
        this.file = new File(pathname);
    }

    public List<Customer> readFromFile() {
        if (!file.exists()) {
            return new ArrayList<>();
        }

        List<Customer> customers = new ArrayList<>();

        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(this.file))) {
            while ((line = br.readLine()) != null) {
                customers.add(Customer.fromCSV(line));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return customers;
    }

    public void writeToCSV(List<Customer> customers) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(this.file))) {
            for (Customer customer : customers) {
                bw.write(customer.toCSV());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
