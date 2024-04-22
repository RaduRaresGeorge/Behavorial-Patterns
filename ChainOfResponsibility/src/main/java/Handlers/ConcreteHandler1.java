package src.main.java.Handlers;

public class ConcreteHandler1 extends AbstractHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Request1")) {
            System.out.println("ConcreteHandler1 handled the request");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}


