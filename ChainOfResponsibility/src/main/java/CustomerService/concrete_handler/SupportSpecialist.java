package src.main.java.CustomerService.concrete_handler;

import src.main.java.CustomerService.handler.AbstractHandler;

public class SupportSpecialist extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("medium")) {
            System.out.println("Support Specialist solved the issue");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}


