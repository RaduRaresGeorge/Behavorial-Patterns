package src.main.java.Handlers;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}