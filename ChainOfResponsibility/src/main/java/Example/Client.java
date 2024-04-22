package src.main.java.Example;

import src.main.java.Example.example_concrete_handlers.ConcreteHandler1;
import src.main.java.Example.example_concrete_handlers.ConcreteHandler2;
import src.main.java.Example.example_handler.Handler;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNext(handler2);

        handler1.handleRequest("Request1");
        handler1.handleRequest("Request2");
    }
}
