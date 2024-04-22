package src.main.java.CustomerService.concrete_handler;

import src.main.java.CustomerService.handler.AbstractHandler;

public class SupportEngineer extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("simple")) {
            System.out.println("Support Engineer solved the issue");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}


