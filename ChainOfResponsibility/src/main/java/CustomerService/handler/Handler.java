package src.main.java.CustomerService.handler;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}

