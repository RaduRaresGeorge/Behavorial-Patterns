package src.main.java.Handlers;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);

        handler1.handleRequest("Request1");
        handler1.handleRequest("Request2");
    }
}
