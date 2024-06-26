package StudyCase;

import StudyCase.service.CustomerService;
import StudyCase.utils.FileCustomerService;
import StudyCase.utils.FileHandler;
import StudyCase.utils.InputHandler;

public class Main {
    public static void main(String[] args) {
//        CustomerService service = new CustomerService();
//        InputHandler input = new InputHandler();
//        CustomerApp app = new CustomerApp(service, input);
//        app.run();

        FileHandler fileHandler = new FileHandler("data.csv");
        CustomerService service = new FileCustomerService(fileHandler);
        InputHandler input = new InputHandler();
        new CustomerApp(service, input).run();
    }
}
