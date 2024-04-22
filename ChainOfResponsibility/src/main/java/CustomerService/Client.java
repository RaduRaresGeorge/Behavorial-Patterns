package src.main.java.CustomerService;

import src.main.java.CustomerService.concrete_handler.SupportEngineer;
import src.main.java.CustomerService.concrete_handler.SupportManager;
import src.main.java.CustomerService.concrete_handler.SupportSpecialist;
import src.main.java.CustomerService.handler.Handler;

public class Client {
    public static void main(String[] args) {
        Handler supportEngineer = new SupportEngineer();
        Handler supportSpecialist = new SupportSpecialist();
        Handler supportManager = new SupportManager();

        supportEngineer.setNext(supportSpecialist);
        supportSpecialist.setNext(supportManager);

        supportEngineer.handleRequest("simple");
        supportEngineer.handleRequest("medium");
        supportEngineer.handleRequest("complex");
    }
}
