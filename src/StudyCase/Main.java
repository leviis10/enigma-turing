package StudyCase;

import StudyCase.service.CustomerService;
import StudyCase.utils.InputHandler;

public class Main {
    public static void main(String[] args) {
        CustomerService service = new CustomerService();
        InputHandler input = new InputHandler();
        CustomerApp app = new CustomerApp(service, input);
        app.run();
    }
}
