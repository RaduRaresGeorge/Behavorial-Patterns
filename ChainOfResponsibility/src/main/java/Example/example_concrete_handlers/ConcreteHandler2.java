package src.main.java.Example.example_concrete_handlers;

import src.main.java.Example.example_handler.AbstractHandler;

public class ConcreteHandler2 extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request2")) {
            System.out.println("ConcreteHandler2 handled the request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
