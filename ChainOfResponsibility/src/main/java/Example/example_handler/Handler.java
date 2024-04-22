package src.main.java.Example.example_handler;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
