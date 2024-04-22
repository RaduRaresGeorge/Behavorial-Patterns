package src.main.java.CustomerService.concrete_handler;

import src.main.java.CustomerService.handler.AbstractHandler;

public class SupportManager extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("complex")) {
            System.out.println("Support Manager solved the issue");
        } else {
            System.out.println("The issue could not be solved");
        }
    }
}
